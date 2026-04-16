package agr.xworkz.Language;

import java.util.Arrays;

public class Language {
    OriginOfLanguage language;
    JnanpithAward jnanpithAward;
    int[] yearsOfOld;
    boolean nationalLanguage;
    boolean hasFlag;

    public Language(OriginOfLanguage language, JnanpithAward jnanpithAward, int[] yearsOfOld, boolean nationalLanguage, boolean hasFlag) {
        this.language = language;
        this.jnanpithAward = jnanpithAward;
        this.yearsOfOld = yearsOfOld;
        this.nationalLanguage = nationalLanguage;
        this.hasFlag = hasFlag;
    }

    public void speak(){
        System.out.println("The languages are used to communicate with each other.");
    }

    public void sing(){
        System.out.println("The languages have a song.");
    }

    public String toString(){
        return "OriginOfLanguage:"+language+",JnanpithAward:"+jnanpithAward+",YearOfOld:"+ Arrays.toString(yearsOfOld)+",NationalLanguage:"+nationalLanguage+",Has Flag:"+hasFlag;
    }
}
