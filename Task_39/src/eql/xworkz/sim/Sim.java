package eql.xworkz.sim;

public class Sim {
    String brand;
    String userName;
    String location;

    public Sim(String brand, String userName, String location) {
        this.brand = brand;
        this.userName = userName;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "brand='" + brand + '\'' +
                ", userName='" + userName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Sim sim = this;
        if(obj instanceof Sim) {
            Sim sim1 = (Sim) obj;

            if(sim.brand == sim1.brand && sim.brand == sim1.brand && sim.location == sim1.location){
                return true;
            }
        }
        return super.equals(obj);
    }
}
