package eql.xworkz.battery;

public class Battery {
    String brand;
    double price;
    boolean isRechargeable;

    public Battery(String brand, double price, boolean isRechargeable) {
        this.brand = brand;
        this.price = price;
        this.isRechargeable = isRechargeable;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", isRechargeable=" + isRechargeable +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Battery battery = this;
        if(obj instanceof Battery) {
            Battery battery1 = (Battery) obj;
            if(battery.brand == battery1.brand && battery.price == battery1.price && battery.isRechargeable == battery1.isRechargeable){
                return true;
            }
        }
        return super.equals(obj);
    }
}
