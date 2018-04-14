package com.epam.task1.model.song;

import com.epam.task1.model.author.Author;
import com.epam.task1.model.style.Style;

public class Song extends AbstractSong{

    private Author author;

    private String songName;

    private double duration;

    private Style style;


    public Song(Author author, String name, double duration, Style style) {
        this.author = author;
        this.songName = name;
        this.duration = duration;
        this.style = style;
    }




    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setName(String name) {
        this.songName = name;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return songName;
    }

    public double getDuration() {
        return duration;
    }

    public Style getStyle() {
        return style;
    }
}
