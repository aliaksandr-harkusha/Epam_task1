package com.epam.task1.main;

import com.epam.task1.FileUtils.DataInitializerFromFile;
import com.epam.task1.model.entityDisc.Disc;
import com.epam.task1.model.song.Song;
import com.epam.task1.model.style.Style;

import java.util.ArrayList;

public class StartApp {

    public static final String BEFORE = "Before Sorting:";
    public static final String AFTER = "After Sorting:";

    public static void main(String[] args) {

        ArrayList<Song> songs = DataInitializerFromFile.initData("data.txt");

//                  HARDCODE for debug
//        songs.add(new Song(new Author("Dethklok"), "Awaken" , 3*60+37, Style.Rock));
//        songs.add(new Song(new Author("Kauan"), "Sat" , 6*60+13, Style.Rap));
//        songs.add(new Song(new Author("Gangsters Paradise"), "Like A Storm" , 3*60+27, Style.Pop));
//        songs.add(new Song(new Author("Dethklok"), "Murmaider" , 2*60+49, Style.Rock));
//        songs.add(new Song(new Author("Rise Against"), "Give it all" , 3*60+17, Style.Metal));


        Disc disc = new Disc(songs);

        disc.getMusicService().getDuration(disc.getSongs());

        disc.getMusicService().getSongByRange(disc.getSongs(), 40, 500);

        System.out.println(BEFORE);

        for (Song song : disc.getSongs()) {
            System.out.print(song.getName() + " ");
        }

        System.out.println();

        disc.getMusicService().sortByStyle(disc.getSongs(), Style.Rock);

        System.out.println(AFTER);

        for (Song song : disc.getSongs()) {

            System.out.print(song.getName() + " ");

        }

    }
}
