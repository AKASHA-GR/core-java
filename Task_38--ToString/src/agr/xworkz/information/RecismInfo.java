package agr.xworkz.information;

public class RecismInfo extends Information {
    String location;
    String state;

    public RecismInfo(Type type, Resource resource, String infoCountry, boolean isBadInfo, String date, String location, String state) {
        super(type, resource, infoCountry, isBadInfo, date);
        this.location = location;
        this.state = state;
    }

    @Override
    public void typeInfo() {
        super.typeInfo();
    }

    @Override
    public void resourceInfo() {
        super.resourceInfo();
    }

    @Override
    public String toString() {
        return "RecismInfo{" +
                "location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

