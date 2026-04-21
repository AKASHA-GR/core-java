package eql.xworkz.toothPaste;

public class ToothPaste {
    String brand;
    double price;
    int size;

    @Override
    public String toString() {
        return "ToothPaste{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        ToothPaste rightSide = this;
        if(obj instanceof ToothPaste){
            ToothPaste leftSide = (ToothPaste) obj;

            if(rightSide.brand == leftSide.brand && rightSide.price == leftSide.price && rightSide.size == leftSide.size){
                return true;
            }
        }
        return super.equals(obj);
    }

    public ToothPaste(String brand, double price, int size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }
}
