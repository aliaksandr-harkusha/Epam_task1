package com.epam.task1.service;

import com.epam.task1.model.song.Song;
import com.epam.task1.model.style.Style;

import java.util.List;

public interface IMusicService {


    /**
     *
     * @param songList
     * @return total duration of all songs
     */

    int getDuration(List<Song> songList);

    /**
     *
     * @param songList
     * @param from
     * @param to
     *
     * show all songs with duration between from and to
     *
     */
    void getSongByRange(List<Song> songList, int from, int to);


    /**
     *
     * @param songList
     * @param style
     *
     * sort list in the following order :
     * first
     *
     */

    void sortByStyle(List<Song> songList, Style style);

}
