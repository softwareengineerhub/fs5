package com.app.ch12;

public class Main {

    public static void main(String[] args) {
        MyImmutable immutable = new MyImmutable("Piter", 45);
        System.out.println(immutable);
        System.out.println("------------");
        Artist artist = new Artist();
        artist.setName("Artist1");
        MyImmutableLabel label = new MyImmutableLabel("Label1", artist);
        System.out.println(label);
        artist.setName("test");
        System.out.println(label);
        System.out.println(artist);
    }

}
