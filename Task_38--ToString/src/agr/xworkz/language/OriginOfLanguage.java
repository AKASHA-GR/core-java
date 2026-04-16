package agr.xworkz.language;

public class OriginOfLanguage {
    String place;
    String nation;

    public OriginOfLanguage(String place, String nation) {
        this.place = place;
        this.nation = nation;
        System.out.println("The Place:"+this.place);
        System.out.println("The nation:"+this.nation);
    }

    public String toString(){
        return "Place:"+place+",Nation:"+nation;
    }
}
