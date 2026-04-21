package eql.xworkz.diamond;

public class Diamond {
    String location;
    double height;
    double width;

    public Diamond(String location, double height, double width) {
        this.location = location;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "location='" + location + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        Diamond diamond = this;
        if(obj instanceof Diamond) {
            Diamond diamond1 = (Diamond) obj;

            if(diamond.location == diamond1.location && diamond.height == diamond1.height && diamond.width == diamond1.width){
                return true;
            }
        }
        return super.equals(obj);
    }
}
