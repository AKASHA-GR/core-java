package agr.xworkz.MedicalShop;

public class Apollo extends MedicalShop{
    String startTime;
    String endTime;

    public Apollo(Staff staff, Location location, boolean hadLicence, char[] grade, double rating, String startTime, String endTime) {
        super(staff, location, hadLicence, grade, rating);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public void tabletInfo() {
        super.tabletInfo();
    }

    @Override
    public void shopInfo() {
        super.shopInfo();
    }

    @Override
    public String toString() {
        return "StatingTime:"+startTime+"EndingTime:"+endTime;
    }
}
