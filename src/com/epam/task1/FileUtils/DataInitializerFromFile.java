package com.epam.task1.FileUtils; // наименование пакетов: 
                                  //1. все буквы маленькие
                                  //2. единственное число
                                  //у тебя нарушено и первое и второе
import com.epam.task1.model.author.Author;
import com.epam.task1.model.song.Song;
import com.epam.task1.model.style.Style;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataInitializerFromFile {


    /**
     *
     * @return list with Songs
     * read file , parse it and give ready list
     */
    public static ArrayList initData(String fileName) {

        ArrayList<Song> list = new ArrayList<>();

        try {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

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
