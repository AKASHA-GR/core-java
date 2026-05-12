package com.xworkz.runner;

import com.xworkz.work.Anime;
import com.xworkz.work.AnimeInfo;

public class AnimeRunner {
    public static void main(String[] args) {
        Anime anime = new AnimeInfo();

        anime.chapters();
        anime.characters();
        anime.seasons();
        anime.story();

        Anime.fansInfo();

        System.out.println(Anime.name);
        System.out.println(Anime.numberOfEpisode);
        System.out.println(Anime.budget);
    }
}
