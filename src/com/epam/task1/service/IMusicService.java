package com.epam.task1.service;

import com.epam.task1.model.song.Song;
import com.epam.task1.model.style.Style;

import java.util.List;

public interface IMusicService {

    int getDuration(List<Song> songList);

    void getSongByRange(List<Song> songList, int from, int to);

    void sortByStyle(List<Song> songList, Style style);

}
