package exercise046;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        Song thesong = findSong(title);
        if (thesong == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        else {
            return false;
        }
    }

    private Song findSong(String title) {
        for (Song song : this.songs) {
            if(song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        int index = track;
        if((index > 0) && (index <= this.songs.size())) {
            Song thesong = findSong(this.songs.get(index - 1).getTitle());
            if(thesong != null) {
                playlist.add(thesong);
                return true;
            }
        }
        System.out.println("This album does not have a track " + track);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song thesong = findSong(title);
        if(thesong != null) {
            playlist.add(thesong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}
