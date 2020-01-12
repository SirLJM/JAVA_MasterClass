package com.company;

import java.util.LinkedList;

public class Playlist {

    private String name;
    private LinkedList<Album> playlist;

    public Playlist(String name) {
        this.name = name;
        this.playlist = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Album> getPlaylist() {
        return playlist;
    }

    public void addSongsFromAlbum(Album album) {

        for (int i = 0; i < album.getSongs().size(); i++) {
            playlist.add(i, album);
        }
    }

    public void skipForward() {
        if (playlist.listIterator().hasNext()) {
            System.out.println("Skipping forward...");
            playlist.listIterator().next();
            System.out.println("Now playing: " + playlist.listIterator().nextIndex());
        } else {
            System.out.println("End of playlist");
        }
    }

    public void showPlaylist() {
        System.out.println(playlist.toString());
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", playlist=" + playlist +
                '}';
    }
}
