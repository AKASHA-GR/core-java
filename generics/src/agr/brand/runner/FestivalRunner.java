package agr.brand.runner;

import agr.brand.names.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival<String,Integer> festival = new Festival<>("Akasha",22);
        festival.action();
    }

}
