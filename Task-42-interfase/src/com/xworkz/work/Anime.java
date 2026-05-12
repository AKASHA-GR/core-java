package com.xworkz.work;

public interface Anime {

    String name = "Naruto";
    String budget = "$100,000";
    int numberOfEpisode = 720;


    default void story(){
        System.out.println("The story is on 'Never giveUp'.");
    }

    default void characters(){
        System.out.println("The naruto anime have 1000 above characters");
    }

    void seasons();
    void chapters();

    static void fansInfo(){
        System.out.println("The Naruto anime have 4.6 million fans.");
    }
}
