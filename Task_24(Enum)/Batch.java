class Batch {

    int quantity;
    String origin;

    Batch(int quantity, String origin) {
        this.quantity = quantity;
        this.origin = origin;
    }

    void getBatch() {
        System.out.println("Cashew quantity: " + this.quantity);
        System.out.println("Cashew origin: " + this.origin);
    }
}