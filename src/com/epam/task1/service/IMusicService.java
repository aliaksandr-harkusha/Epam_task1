package com.epam.task1.service;

import com.epam.task1.model.song.Song;
import com.epam.task1.model.style.Style;

import java.util.List;

public interface IMusicService {

    double getDuration(List<Song> songList);

    void getSongByRange(List<Song> songList, double from, double to);

    void sortByStyle(List<Song> songList, Style style);

}
