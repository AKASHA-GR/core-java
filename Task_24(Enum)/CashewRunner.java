class CashewRunner {

    public static void main(String... args) {

        Batch batch1 = new Batch(50, "Mangalore");
        Cashew cashew1 = new Cashew("Golden Cashew", batch1, Quality.W180);
        cashew1.printInfo();

        Batch batch2 = new Batch(30, "Goa");
        Cashew cashew2 = new Cashew("Premium Cashew", batch2, Quality.W240);
        cashew2.printInfo();

        Batch batch3 = new Batch(60, "Kerala");
        Quality quality1 = Quality.W320;
        Cashew cashew3 = new Cashew("Royal Cashew", batch3, quality1);
        cashew3.printInfo();

        Batch batch4 = new Batch(40, "Karnataka");
        Quality quality2 = Quality.W450;
        Cashew cashew4 = new Cashew("Fresh Cashew", batch4, quality2);
        cashew4.printInfo();

        System.out.println("");
    }
}