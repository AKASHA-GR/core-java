package eql.xworkz.oil;

public class Oil {
    String brand;
    double price;
    double quantity;

    @Override
    public String toString() {
        return "Oil{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Oil oil = this;
        if(obj instanceof Oil) {
            Oil oilObj = (Oil) obj;

            if(oil.brand == oilObj.brand && oil.price == oilObj.price && oil.quantity == oilObj.quantity){
                return true;
            }
        }
        return super.equals(obj);
    }

    public Oil(double price, double quantity, String brand) {
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }
}
