package eql.xworkz.industry;

public class Industry {
    String product;
    double price;
    String location;

    @Override
    public String toString() {
        return "Industry{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Industry rightSide = this;

        if(obj instanceof Industry) {
            Industry leftSide = (Industry) obj;

            if(rightSide.product == leftSide.product && rightSide.price == leftSide.price && rightSide.location == leftSide.location){
                return true;
            }
        }

        return super.equals(obj);
    }

    public Industry(String product, double price, String location) {
        this.product = product;
        this.price = price;
        this.location = location;
    }
}
