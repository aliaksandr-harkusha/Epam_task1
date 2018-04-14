package com.epam.task1;

import java.util.ArrayList;
import java.util.List;

public class MusicService {



  public double getDuration(List<Song> songList){

      double durationOfAllSongs = 0;

      for (Song song : songList) {
        durationOfAllSongs += song.getDuration();

      }

      System.out.printf("Total duration is %d", durationOfAllSongs);

      return durationOfAllSongs;
  }


  public void getSongByRange(List<Song> songList, double from , double to){


      for (Song song : songList) {
          if ((song.getDuration() <= to) && (song.getDuration() >= from)){
              System.out.printf("Song %s lasts %d \n",song.getName() ,song.getDuration());
          }
      }

  }



  public void sortByStyle(List<Song> songList, Style style){

      ArrayList <Song> copyArrayList = new ArrayList<>();

      for (Song song : songList) {
          if (song.getStyle() == style){
              copyArrayList.add(song);
          }
      }

      for (Song song : songList) {
          if (song.getStyle() != style){
              copyArrayList.add(song);
          }
      }






  }


}
