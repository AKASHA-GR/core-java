public class ClassesRunner {

    public static void main(String[] args) {

        // Two copies of each class

        Light l1 = new Light();
        Light l2 = new Light();

        Dress d1 = new Dress();
        Dress d2 = new Dress();

        Disc disc1 = new Disc();
        Disc disc2 = new Disc();

        Button b1 = new Button();
        Button b2 = new Button();

        Chocolate c1 = new Chocolate();
        Chocolate c2 = new Chocolate();

        Logo logo1 = new Logo();
        Logo logo2 = new Logo();

        Coin coin1 = new Coin();
        Coin coin2 = new Coin();

        Borewell bore1 = new Borewell();
        Borewell bore2 = new Borewell();

        Robot r1 = new Robot();
        Robot r2 = new Robot();

        Iron i1 = new Iron();
        Iron i2 = new Iron();

        Box box1 = new Box();
        Box box2 = new Box();

        Wood w1 = new Wood();
        Wood w2 = new Wood();

        Plastic p1 = new Plastic();
        Plastic p2 = new Plastic();

        Number n1 = new Number();
        Number n2 = new Number();

        Plate pl1 = new Plate();
        Plate pl2 = new Plate();

        Cotton ct1 = new Cotton();
        Cotton ct2 = new Cotton();

        SkateBoard s1 = new SkateBoard();
        SkateBoard s2 = new SkateBoard();

        ToothPaste t1 = new ToothPaste();
        ToothPaste t2 = new ToothPaste();

        Tom tom1 = new Tom();
        Tom tom2 = new Tom();

        Jerry j1 = new Jerry();
        Jerry j2 = new Jerry();

        // Reference pointing example
        Light ref = l1;  // ref pointing to l1 object

        // Making object eligible for Garbage Collection
        l1 = null;   // Now original Light object can be GC if no reference
        System.gc(); // Request JVM to run Garbage Collector

        System.out.println("Program Completed");
    }
}