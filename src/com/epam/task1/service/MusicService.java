package com.epam.task1.service;

import com.epam.task1.model.song.Song;
import com.epam.task1.model.style.Style;

import java.util.ArrayList;
import java.util.List;

public class MusicService implements IMusicService {


    @Override
    public int getDuration(List<Song> songList) {

        int durationOfAllSongs = 0;

        for (Song song : songList) {
            durationOfAllSongs += song.getDuration();

        }

        System.out.printf("Total duration is %d\n", durationOfAllSongs);

        return durationOfAllSongs;
    }


    @Override
    public void getSongByRange(List<Song> songList, int from, int to) {


        for (Song song : songList) {
            if ((song.getDuration() <= to) && (song.getDuration() >= from)) {
                System.out.printf("Song '%s' lasts %d seconds \n", song.getName(), song.getDuration());
            }
        }

    }


    @Override
    public void sortByStyle(List<Song> songList, Style style) {

        ArrayList<Song> copyArrayList = new ArrayList<>();

        for (Song song : songList) {
            if (song.getStyle() == style) {
                copyArrayList.add(song);
            }
        }

        for (Song song : songList) {
            if (song.getStyle() != style) {
                copyArrayList.add(song);
            }
        }

        songList.clear();

        songList.addAll(copyArrayList);



    }


}
