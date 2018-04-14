package com.epam.task1.FileUtils;

import com.epam.task1.model.author.Author;
import com.epam.task1.model.song.Song;
import com.epam.task1.model.style.Style;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataInitializerFromFile {

    public static ArrayList initData() {

        ArrayList<Song> list = new ArrayList<>();

        BufferedReader bufferedReader = null;

        try {

            bufferedReader = new BufferedReader(new FileReader("data.txt"));

            while (bufferedReader.ready()) {

                String s = bufferedReader.readLine();

                String[] initData = s.split(" ");

                list.add(new Song(new Author(initData[0].replace("_", " ")), initData[1].replace("_", " "), Integer.parseInt(initData[2]), Style.valueOf(initData[3])));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return list;

    }
}
