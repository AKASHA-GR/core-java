class StrawberryRunner {
    public static void main(String[] args) {

        Strawberry strawberry = new Strawberry();
        System.out.println("Color: " + strawberry.color);
        System.out.println("Taste: " + strawberry.taste);
        System.out.println("Is Fresh: " + strawberry.isFresh);
        System.out.println("Weight: " + strawberry.weight);
        System.out.println("Price: " + strawberry.price);

        Strawberry strawberry1 = new Strawberry("Red");
        System.out.println("Color: " + strawberry1.color);

        Strawberry strawberry2 = new Strawberry("Sweet", true);
        System.out.println("Taste: " + strawberry2.taste);
        System.out.println("Is Fresh: " + strawberry2.isFresh);

        Strawberry strawberry3 = new Strawberry(false);
        System.out.println("Is Fresh: " + strawberry3.isFresh);

        Strawberry strawberry4 = new Strawberry(250.5);
        System.out.println("Weight: " + strawberry4.weight);

        Strawberry strawberry5 = new Strawberry("Red", 300.0, 150.0);
        System.out.println("Color: " + strawberry5.color);
        System.out.println("Weight: " + strawberry5.weight);
        System.out.println("Price: " + strawberry5.price);
    }
}