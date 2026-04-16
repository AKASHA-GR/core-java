package agr.xworkz.information;

public class Information {
    Type type;
    Resource resource;
    String infoCountry;
    boolean isBadInfo;
    String date;

    public Information(Type type, Resource resource, String infoCountry, boolean isBadInfo, String date) {
        this.type = type;
        this.resource = resource;
        this.infoCountry = infoCountry;
        this.isBadInfo = isBadInfo;
        this.date = date;
    }

    public void typeInfo(){
        System.out.println("There are different type of information in the world.");
    }

    public void resourceInfo(){
        System.out.println("There are different resources like book,stories,etc......");
    }


    @Override
    public String toString() {
        return "Information{" +
                "type=" + type +
                ", resource=" + resource +
                ", infoCountry='" + infoCountry + '\'' +
                ", isBadInfo=" + isBadInfo +
                ", date='" + date + '\'' +
                '}';
    }
}
