package agr.xworkz.jail;

import java.util.Arrays;

public class Jail {
    Name name;
    int[] numberOfCriminal ;
    Staff staff;
    int numberOfCell;
    int punishmentYear;

    public Jail(Name name, int[] numberOfCriminal, Staff staff, int numberOfCell, int punishmentYear) {
        this.name = name;
        this.numberOfCriminal = numberOfCriminal;
        this.staff = staff;
        this.numberOfCell = numberOfCell;
        this.punishmentYear = punishmentYear;
    }

    public void criminalInfo(){
        System.out.println("The each criminal have different ID.");
    }

    public void cellInfo(){
        System.out.println("The each cell have its own property.");
    }

    @Override
    public String toString() {
        return "NameInfo:"+name+",NumberOfCriminal:"+ Arrays.toString(numberOfCriminal)+",Staff:"+staff+",NumberOfCell:"+numberOfCell+",PunishmentYear:"+punishmentYear;
    }
}
