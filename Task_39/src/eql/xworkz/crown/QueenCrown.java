package eql.xworkz.crown;

public class QueenCrown extends Crown{
    int numberOfDiamond;

    public QueenCrown(String material, double weight, double height, int numberOfDiamond) {
        super(material, weight, height);
        this.numberOfDiamond = numberOfDiamond;
    }

    @Override
    public String toString() {
        return "QueenCrown{" +
                "numberOfDiamond=" + numberOfDiamond +
                '}';
    }
}
