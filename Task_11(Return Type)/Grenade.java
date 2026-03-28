class Grenade {

    static int blastRadius() {
		System.out.println("Exicuting the blastRadius method in Grenade.");
        return 15;
    }

    static String type() {
		System.out.println("Exicuting the type method in Grenade.");
        return "Fragmentation";
    }

    static double weight() {
		System.out.println("Exicuting the weight method in Grenade.");
        return 0.4;
    }

    static boolean isActive() {
		System.out.println("Exicuting the isActive method in Grenade.");
        return false;
    }

    static char safetyLevel() {
		System.out.println("Exicuting the safetyLevel method in Grenade.");
        return 'H';
    }
}
