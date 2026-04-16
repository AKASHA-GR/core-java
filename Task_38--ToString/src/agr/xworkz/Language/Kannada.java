package agr.xworkz.Language;

public class Kannada extends Language{
    String numberOfNovels;
    String numberOfMovie;

    public Kannada(OriginOfLanguage language, JnanpithAward jnanpithAward, int[] yearOfOld, boolean nationalLanguage, boolean hasFlag, String numberOfMovie,String numberOfNovels) {
        super(language, jnanpithAward, yearOfOld, nationalLanguage, hasFlag);
        this.numberOfNovels = numberOfNovels;
        this.numberOfMovie = numberOfMovie;
    }

    @Override
    public void speak(){
        System.out.println("The kannada language ia also called as Kanarese.");
    }

    @Override
    public void sing() {
        System.out.println("The Gaana app have 30 million kannada songs.");
    }

    @Override
    public String toString() {
        return "The totle number of kannada Movies:"+numberOfMovie+",The totle number of Novels:"+numberOfNovels;
    }
}
