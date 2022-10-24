package exercise048;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        Song thesong = this.songs.findSong(track);
        if(thesong != null) {
            playlist.add(thesong);
            return true;
        }
        System.out.println("This album does not have a track " + track);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song thesong = this.songs.findSong(title);
        if(thesong != null) {
            playlist.add(thesong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {
            Song thesong = findSong(song.getTitle());
            if (thesong == null) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song song: this.songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int track) {
            if (track > 0 && track <= this.songs.size()) {
                if (this.songs.get(track - 1) != null) {
                    return this.songs.get(track - 1);
                }
            }
            return null;
        }
    }
}
