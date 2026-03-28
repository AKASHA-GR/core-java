class Carrom {
    String brand;
    String boardSize;
    boolean isFoldable;
    int numberOfCoins;
    double price;

    Carrom() {
        System.out.println("Carrom constructor without arguments created.");
    }

    Carrom(String brand) {
        this.brand = brand;
    }

    Carrom(String boardSize, boolean isFoldable) {
        this.boardSize = boardSize;
        this.isFoldable = isFoldable;
    }

    Carrom(boolean isFoldable) {
        this.isFoldable = isFoldable;
    }

    Carrom(int numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    Carrom(String brand, int numberOfCoins, double price) {
        this.brand = brand;
        this.numberOfCoins = numberOfCoins;
        this.price = price;
    }
}

