package com.epam.task1.model.entityDisc;

import com.epam.task1.model.song.Song;
import com.epam.task1.service.IMusicService;
import com.epam.task1.service.MusicService;

import java.util.ArrayList;
import java.util.List;

public class Disc {

    private List<Song> songs = new ArrayList<>();

    private IMusicService musicService = new MusicService();


    public Disc(List<Song> songs) {
        this.songs = songs;
    }

    public IMusicService getMusicService() {
        return musicService;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
