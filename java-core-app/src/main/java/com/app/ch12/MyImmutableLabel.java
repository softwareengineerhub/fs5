package com.app.ch12;

public class MyImmutableLabel {
    private final String title;
    private final Artist artist;

    public MyImmutableLabel(String title, Artist artist) {
        this.title = title;
        this.artist = new Artist();
        this.artist.setName(artist.getName());
        //this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "MyImmutableLabel{" +
                "title='" + title + '\'' +
                ", artist=" + artist +
                '}';
    }
}
