package agr.xworkz.Jail;

public class JailIRunner {
    public static void main(String[] args) {
        Name name = new Name("Ballary Jail","Ballary");
        int[] numberOfCriminal = {20,30,400,300,250,600};

        Jail jail = new Jail(name,numberOfCriminal,Staff.THIRTY,400,10);
        System.out.println(jail.toString());
        jail.cellInfo();
        jail.criminalInfo();
        System.out.println();

        DistrictJail districtJail = new DistrictJail(name,numberOfCriminal,Staff.THIRTY,400,10,"Naresh","45");
        districtJail.cellInfo();
        districtJail.criminalInfo();
        System.out.println(districtJail);
    }
}
