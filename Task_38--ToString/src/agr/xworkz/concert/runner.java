package agr.xworkz.concert;

public class runner {
    public static void main(String[] args) {
        Singer singer = new Singer("Sonu Nigam",52);
        int[] audience = {200,500,1000,2500,4000,6000};

        Concert concert = new Concert("Bengaluru",singer,audience,Lights.FIFTY,"07-02-2026");
        concert.singerInfo();
        concert.dancerInfo();
        System.out.println(concert.toString());
        System.out.println();

        Dance dance = new Dance("Bengaluru",singer,audience,Lights.FIFTY,"07-02-2026",30,12);
        dance.singerInfo();
        dance.dancerInfo();
        System.out.println(dance.toString());
    }
}
