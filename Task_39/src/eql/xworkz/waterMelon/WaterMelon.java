package eql.xworkz.waterMelon;

public class WaterMelon {
    double size;
    double price;
    boolean isSeedless;

    public WaterMelon(double size, double price, boolean isSeedless) {
        this.size = size;
        this.price = price;
        this.isSeedless = isSeedless;
    }

    @Override
    public boolean equals(Object obj) {
        WaterMelon rightSide = this;

        if(obj instanceof WaterMelon){
            WaterMelon leftSide = (WaterMelon) obj;

            if(rightSide.size == leftSide.size && rightSide.price == leftSide.price && rightSide.isSeedless == leftSide.isSeedless){
                return true;
            }
        }


        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "WaterMelon{" +
                "size=" + size +
                ", price=" + price +
                ", isSeedless=" + isSeedless +
                '}';
    }
}
