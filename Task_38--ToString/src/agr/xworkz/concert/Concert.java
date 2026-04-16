package agr.xworkz.concert;

import java.util.Arrays;

public class Concert {
    String location;
    Singer singer;
    int[] numberOfAudience;
    Lights nubberOfLights;
    String date;

    public Concert(String location, Singer singer, int[] numberOfAudience, Lights nubberOfLights, String date) {
        this.location = location;
        this.singer = singer;
        this.numberOfAudience = numberOfAudience;
        this.nubberOfLights = nubberOfLights;
        this.date = date;
    }

    public void singerInfo(){
        System.out.println("There are different type of singer in the world.");
    }

    public void dancerInfo(){
        System.out.println("There are different type of categories of dancers in the concert.");
    }

    @Override
    public String toString() {
        return "Location:"+location+",SingerInfo:"+singer+",Number of audience:"+ Arrays.toString(numberOfAudience)+",NumberofLights:"+nubberOfLights+",Date"+date;
    }
}
