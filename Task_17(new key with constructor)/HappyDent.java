class HappyDent {
    String name;
    String flavor;
    double price;
    int quantity;
    String brand;
    boolean sugarFree;
    String color;
    double weight;
    String shape;
    String packagingType;
    String manufacturingDate;
    String expiryDate;
    String countryOfOrigin;
    String texture;
    boolean vegetarian;
    String sweetenerType;
    double length;
    double width;
    double height;
    int calories;
    boolean mintBased;
    boolean bubbleGum;
    boolean kidsFriendly;
    boolean adultFriendly;
    String storageInstructions;
    String distributor;
    String barcode;
    int batchNumber;
    String qualityMark;
    boolean exportQuality;

    String[] ingredients;
    String[] availableSizes;
}

class HappyDentRunner {
    public static void main(String[] args) {

        HappyDent hd1 = new HappyDent();

        hd1.name = "HappyDent White";
        hd1.flavor = "Mint";
        hd1.price = 10;
        hd1.quantity = 1;
        hd1.brand = "Perfetti";
        hd1.sugarFree = false;
        hd1.color = "White";
        hd1.weight = 5;
        hd1.shape = "Rectangle";
        hd1.packagingType = "Foil";
        hd1.manufacturingDate = "02-2025";
        hd1.expiryDate = "02-2026";
        hd1.countryOfOrigin = "India";
        hd1.texture = "Chewy";
        hd1.vegetarian = true;
        hd1.sweetenerType = "Sugar";
        hd1.length = 3;
        hd1.width = 1;
        hd1.height = 1;
        hd1.calories = 40;
        hd1.mintBased = true;
        hd1.bubbleGum = false;
        hd1.kidsFriendly = true;
        hd1.adultFriendly = true;
        hd1.storageInstructions = "Keep in cool place";
        hd1.distributor = "Local Distributor";
        hd1.barcode = "HD123456";
        hd1.batchNumber = 101;
        hd1.qualityMark = "ISO";
        hd1.exportQuality = true;

        hd1.ingredients = new String[]{"Sugar","Mint Flavor","Gum Base"};
        hd1.availableSizes = new String[]{"Small","Medium","Large"};

        System.out.println("Name: " + hd1.name);
        System.out.println("Flavor: " + hd1.flavor);
        System.out.println("Price: " + hd1.price);

        System.out.println("Ingredients:");
        for(int i=0;i<hd1.ingredients.length;i++){
            System.out.println(hd1.ingredients[i]);
        }
    }
}