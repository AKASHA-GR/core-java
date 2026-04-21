package eql.xworkz.trolley;

public class Trolley {
    String brand;
    int price;
    String size;

    public Trolley(String brand, int price, String size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        Trolley trolley = this;
        if(obj instanceof Trolley) {
            Trolley trolley1 = (Trolley) obj;
            if(trolley.brand == trolley1.brand && trolley.price == trolley1.price &&  trolley.size == trolley1.size){
                return true;
            }
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Trolley{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
