package agr.xworkz.medicalShop;

import java.util.Arrays;

public class MedicalShop {
    Staff staff;
    Location location;
    boolean hadLicence;
    char[] grade;
    double rating;

    public MedicalShop(Staff staff, Location location, boolean hadLicence, char[] grade, double rating) {
        this.staff = staff;
        this.location = location;
        this.hadLicence = hadLicence;
        this.grade = grade;
        this.rating = rating;
    }

    public void tabletInfo(){
        System.out.println("There are different type of tablet in a Shop.");
    }

    public void shopInfo(){
        System.out.println("The have a three staff and owner.");
    }

    @Override
    public String toString() {
        return "StaffInfo:"+staff+",Location:"+location+",HadLicence:"+hadLicence+",Grade:"+ Arrays.toString(grade)+",Rating:"+rating;
    }
}
