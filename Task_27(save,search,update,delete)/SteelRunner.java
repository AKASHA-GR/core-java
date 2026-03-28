class SteelRunner {
    public static void main(String[] args) {

        String[] steels = new String[10];
        Steel steel = new Steel(steels);

        steel.save("Tata Steel");
        steel.save("JSW Steel");
        steel.save("SAIL");
        steel.save("Jindal Steel");
        steel.save("Essar Steel");
        steel.save("Bhushan Steel");
        steel.save("Vizag Steel");
        steel.save("Electrosteel");
        steel.save("Kalyani Steel");
        steel.save("Rashtriya Ispat Nigam");

        System.out.println();

        boolean found = steel.search("JSW Steel");
        System.out.println("Found: " + found);

        System.out.println();

        steel.update(3, "Updated Steel");

        System.out.println();

        boolean updated = steel.update("SAIL", "SAIL Updated");
        System.out.println("Updated by name: " + updated);

        System.out.println();

        boolean deletedIndex = steel.delete(5);
        System.out.println("Deleted by index: " + deletedIndex);

        System.out.println();

        boolean deletedName = steel.delete("JSW Steel");
        System.out.println("Deleted by name: " + deletedName);
    }
}