package eql.xworkz.fork;

public class Fork {
    Double price;
    double height;
    double weight;

    @Override
    public String toString() {
        return "Fork{" +
                "price=" + price +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Fork fork = this;
        if(obj instanceof Fork) {
            Fork fork1 = (Fork) obj;

            if(fork.price == fork1.price && fork.height == fork1.height && fork.weight == fork1.weight){
                return true;
            }
        }
        return super.equals(obj);
    }

    public Fork(Double price, double height, double weight) {
        this.price = price;
        this.height = height;
        this.weight = weight;
    }
}
