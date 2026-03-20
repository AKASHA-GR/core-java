class KettleRunner {
    public static void main(String[] args) {

        String[] kettles = new String[10];
        Kettle kettle = new Kettle(kettles);

        kettle.save("Electric Kettle");
        kettle.save("Stainless Steel Kettle");
        kettle.save("Glass Kettle");
        kettle.save("Travel Kettle");
        kettle.save("Cordless Kettle");
        kettle.save("Whistling Kettle");
        kettle.save("Tea Kettle");
        kettle.save("Gooseneck Kettle");
        kettle.save("Mini Kettle");
        kettle.save("Smart Kettle");

        System.out.println();

        boolean found = kettle.search("Tea Kettle");
        System.out.println("Found: " + found);

        System.out.println();

        kettle.update(4, "Updated Kettle");

        System.out.println();

        boolean updated = kettle.update("Glass Kettle", "Glass Kettle Pro");
        System.out.println("Updated by name: " + updated);

        System.out.println();

        boolean deletedIndex = kettle.delete(7);
        System.out.println("Deleted by index: " + deletedIndex);

        System.out.println();

        boolean deletedName = kettle.delete("Tea Kettle");
        System.out.println("Deleted by name: " + deletedName);
    }
}