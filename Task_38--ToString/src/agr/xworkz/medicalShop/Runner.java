package agr.xworkz.medicalShop;

public class Runner {
    public static void main(String[] args) {
        Staff staff = new Staff("Manohara",23);
        char[] grade = {'A','B','C','D'};

        MedicalShop medicalShop = new MedicalShop(staff,Location.BENGALURU,true,grade,4.5);
        medicalShop.tabletInfo();
        medicalShop.shopInfo();
        System.out.println(medicalShop);
        System.out.println();

        Apollo apollo = new Apollo(staff,Location.BENGALURU,true,grade,4.5,"6AM","11PM");
        apollo.tabletInfo();
        apollo.shopInfo();
        System.out.println(apollo);
    }
}
