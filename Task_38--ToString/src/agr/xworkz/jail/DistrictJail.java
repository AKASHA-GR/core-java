package agr.xworkz.jail;

public class DistrictJail extends Jail {
    String criminalName;
    String age;

    public DistrictJail(Name name, int[] numberOfCriminal, Staff staff, int numberOfCell, int punishmentYear, String criminalName, String age) {
        super(name, numberOfCriminal, staff, numberOfCell, punishmentYear);
        this.criminalName = criminalName;
        this.age = age;
    }

    @Override
    public void cellInfo() {
        super.cellInfo();
    }

    @Override
    public void criminalInfo() {
        super.criminalInfo();
    }

    @Override
    public String toString() {
        return "CriminalName:"+criminalName+",Age:"+age;
    }
}
