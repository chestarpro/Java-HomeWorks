package com.company.A;

public class Song {
    private String name;
    private String genre;
    private String singer;
    private String lyrics;

    public Song(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    @Override
    public String toString() {
        return String.format("%s \n%s \n%s \n%s",
                this.name, this.genre, this.singer, this.lyrics);
    }
}
