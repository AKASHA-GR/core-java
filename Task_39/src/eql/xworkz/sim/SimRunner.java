package eql.xworkz.sim;

public class SimRunner {
    public static void main(String[] args) {
        Sim sim1 = new Sim("Jio","Akasha","Bengaluru");
        Sim sim2 = new Sim("Jio","Akasha","Bengaluru");

        boolean check = sim1.equals(sim2);
        System.out.println("Both sim1 and sim2 are same:"+check);
    }


}
