class CarromRunner {
    public static void main(String[] args) {

        Carrom carrom = new Carrom();
        System.out.println("Brand: " + carrom.brand);
        System.out.println("Board Size: " + carrom.boardSize);
        System.out.println("Is Foldable: " + carrom.isFoldable);
        System.out.println("Number Of Coins: " + carrom.numberOfCoins);
        System.out.println("Price: " + carrom.price);

        Carrom carrom1 = new Carrom("Synco");
        System.out.println("Brand: " + carrom1.brand);

        Carrom carrom2 = new Carrom("32x32", true);
        System.out.println("Board Size: " + carrom2.boardSize);
        System.out.println("Is Foldable: " + carrom2.isFoldable);

        Carrom carrom3 = new Carrom(true);
        System.out.println("Is Foldable: " + carrom3.isFoldable);

        Carrom carrom4 = new Carrom(19);
        System.out.println("Number Of Coins: " + carrom4.numberOfCoins);

        Carrom carrom5 = new Carrom("Prestige", 19, 2500.0);
        System.out.println("Brand: " + carrom5.brand);
        System.out.println("Number Of Coins: " + carrom5.numberOfCoins);
        System.out.println("Price: " + carrom5.price);
    }
}