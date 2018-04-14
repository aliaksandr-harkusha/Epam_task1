package com.epam.task1.model.song;

import com.epam.task1.model.author.Author;
import com.epam.task1.model.style.Style;

public class Song{

    private Author author;

    private String songName;

    private int duration;

    private Style style;


    public Song(Author author, String name, int duration, Style style) {
        this.author = author;
        this.songName = name;
        this.duration = duration;
        this.style = style;
    }

    @Override
    public String toString() {
        return "Song{" +
                "author=" + author +
                ", songName='" + songName + '\'' +
                ", duration=" + duration +
                ", style=" + style +
                '}';
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setName(String name) {
        this.songName = name;
    }

    public void setDuration(int duration) {
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

    public int getDuration() {
        return duration;
    }

    public Style getStyle() {
        return style;
    }
}
