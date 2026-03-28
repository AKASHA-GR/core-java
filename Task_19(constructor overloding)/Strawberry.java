class Strawberry {
    String color;
    String taste;
    boolean isFresh;
    double weight;
    double price;

    Strawberry() {
        System.out.println("Strawberry constructor without arguments created.");
    }

    Strawberry(String color) {
        this.color = color;
    }

    Strawberry(String taste, boolean isFresh) {
        this.taste = taste;
        this.isFresh = isFresh;
    }

    Strawberry(boolean isFresh) {
        this.isFresh = isFresh;
    }

    Strawberry(double weight) {
        this.weight = weight;
    }

    Strawberry(String color, double weight, double price) {
        this.color = color;
        this.weight = weight;
        this.price = price;
    }
}

