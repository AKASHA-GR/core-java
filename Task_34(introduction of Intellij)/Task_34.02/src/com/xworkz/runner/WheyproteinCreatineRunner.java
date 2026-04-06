package com.xworkz.runner;

import com.xworkz.health.Creatine;
import com.xworkz.health.WheyProtein;

public class WheyproteinCreatineRunner {
    public static void main(String[] args) {
        WheyProtein wheyProtein = new WheyProtein("avvatar PERFORMANCE",2765,783);
        wheyProtein.wheyProteinInfo();
        System.out.println();

        Creatine creatine = new Creatine("MuscleBlaze",609,1);
        creatine.creatineInfo();
    }
}
