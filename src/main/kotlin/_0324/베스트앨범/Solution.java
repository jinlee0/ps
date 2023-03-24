package _0324.베스트앨범;

import java.util.*;
class Solution {
    public List<Integer> solution(String[] genres, int[] plays) {
        Map<String, Genre> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++) {
            if(map.containsKey(genres[i])) {
                Genre g = map.get(genres[i]);
                Song s = new Song(i, plays[i]);
                g.addSong(s);
            } else {
                Genre g = new Genre();
                Song s = new Song(i, plays[i]);
                g.addSong(s);
                map.put(genres[i], g);
            }
        }
        List<Genre> list = new ArrayList<>(map.values());
        list.sort(Comparator.comparingInt(Genre::getTotalPlays).reversed());
        List<Integer> album = new ArrayList<>();
        for(Genre g : list) {
            g.sort();
            List<Song> songs = g.list();
            for(int i = 0; i < Math.min(songs.size(), 2); i++) {
                album.add(songs.get(i).getId());
            }
        }
        return album;
    }

    class Genre {
        private final List<Song> songs = new ArrayList<>();
        private int totalPlays;

        public void addSong(Song song) {
            this.songs.add(song);
            this.totalPlays += song.getPlays();
        }
        public int getTotalPlays() {
            return this.totalPlays;
        }
        public void sort() {
            songs.sort((s1, s2) -> s2.getPlays() == s1.getPlays() ?
                    s1.getId() - s2.getId() :
                    s2.getPlays() - s1.getPlays());
        }
        public List<Song> list() {
            return songs;
        }
    }

    class Song {
        private final int id;
        private int plays;
        public Song(int id, int plays) {
            this.id = id;
            this.plays = plays;
        }

        public int getPlays() {
            return this.plays;
        }

        public int getId() {
            return this.id;
        }
    }
}
