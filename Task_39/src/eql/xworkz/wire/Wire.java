package eql.xworkz.wire;

import java.util.Objects;

public class Wire {
    String color;
    double price;
    double length;

    public Wire(String color,double price,double length){
        this.color = color;
        this.price = price;
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        Wire rightSide = this;
        if(obj instanceof Wire){
            Wire leftSide = (Wire) obj;

            if(Objects.equals(rightSide.color, leftSide.color) && rightSide.price == leftSide.price && rightSide.length == leftSide.length){
                return true;
            }
        }

        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Wire{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", length=" + length +
                '}';
    }
}
