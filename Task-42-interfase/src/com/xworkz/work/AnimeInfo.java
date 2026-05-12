package com.xworkz.work;

public class AnimeInfo implements Anime{
    @Override
    public void seasons() {
        System.out.println("The naruto anime have 5 Seasons.");
    }

    @Override
    public void chapters() {
        System.out.println("The naruto anime have 700 Chapters.");
    }
}
