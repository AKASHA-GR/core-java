package agr.xworkz.concert;

public class Dance extends Concert{
    int numOfMenDancers;
    int numOfWomenDancers;

    public Dance(String location, Singer singer, int[] numberOfAudience, Lights nubberOfLights, String date, int numOfMenDancers, int numOfWomenDancers) {
        super(location, singer, numberOfAudience, nubberOfLights, date);
        this.numOfMenDancers = numOfMenDancers;
        this.numOfWomenDancers = numOfWomenDancers;
    }

    @Override
    public void dancerInfo() {
        super.dancerInfo();
    }

    @Override
    public void singerInfo() {
        super.singerInfo();
    }

    @Override
    public String toString() {
        return "Dance{" +
                "numOfMenDancers=" + numOfMenDancers +
                ", numOfWomenDancers=" + numOfWomenDancers +
                '}';
    }
}
