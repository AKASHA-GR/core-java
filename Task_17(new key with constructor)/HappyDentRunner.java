class HappyDentRunner {

    public static void main(String[] args) {

        HappyDent gum1 = new HappyDent();

        gum1.name = "HappyDent White";
        gum1.flavor = "Mint";
        gum1.price = 10;
        gum1.quantity = 1;
        gum1.brand = "Perfetti Van Melle";
        gum1.sugarFree = true;
        gum1.color = "White";
        gum1.weight = 2.5;
        gum1.shape = "Rectangular";
        gum1.packagingType = "Blister Pack";
        gum1.manufacturingDate = "01-2026";
        gum1.expiryDate = "01-2027";
        gum1.countryOfOrigin = "India";
        gum1.texture = "Soft Chewy";
        gum1.vegetarian = true;
        gum1.sweetenerType = "Xylitol";
        gum1.length = 3.5;
        gum1.width = 1.5;
        gum1.height = 0.5;
        gum1.calories = 5;
        gum1.mintBased = true;
        gum1.bubbleGum = false;
        gum1.kidsFriendly = true;
        gum1.adultFriendly = true;
        gum1.storageInstructions = "Store in cool and dry place";
        gum1.distributor = "ABC Distributors";
        gum1.barcode = "8901234567890";
        gum1.batchNumber = 101;
        gum1.qualityMark = "FSSAI Approved";
        gum1.exportQuality = true;

        gum1.ingredients = new String[]{"Gum Base", "Xylitol", "Mint Flavor", "Sweetener"};
        gum1.availableSizes = new String[]{"Single Stick", "Pack of 10", "Pack of 50"};

        // Printing Details
        System.out.println("Name: " + gum1.name);
        System.out.println("Flavor: " + gum1.flavor);
        System.out.println("Price: ₹" + gum1.price);
        System.out.println("Quantity: " + gum1.quantity);
        System.out.println("Brand: " + gum1.brand);
        System.out.println("Sugar Free: " + gum1.sugarFree);
        System.out.println("Color: " + gum1.color);
        System.out.println("Weight: " + gum1.weight + "g");
        System.out.println("Shape: " + gum1.shape);
        System.out.println("Packaging: " + gum1.packagingType);
        System.out.println("Manufacturing Date: " + gum1.manufacturingDate);
        System.out.println("Expiry Date: " + gum1.expiryDate);
        System.out.println("Country Of Origin: " + gum1.countryOfOrigin);
        System.out.println("Texture: " + gum1.texture);
        System.out.println("Vegetarian: " + gum1.vegetarian);
        System.out.println("Sweetener Type: " + gum1.sweetenerType);
        System.out.println("Dimensions (LxWxH): " + gum1.length + " x " + gum1.width + " x " + gum1.height);
        System.out.println("Calories: " + gum1.calories);
        System.out.println("Mint Based: " + gum1.mintBased);
        System.out.println("Bubble Gum: " + gum1.bubbleGum);
        System.out.println("Kids Friendly: " + gum1.kidsFriendly);
        System.out.println("Adult Friendly: " + gum1.adultFriendly);
        System.out.println("Storage Instructions: " + gum1.storageInstructions);
        System.out.println("Distributor: " + gum1.distributor);
        System.out.println("Barcode: " + gum1.barcode);
        System.out.println("Batch Number: " + gum1.batchNumber);
        System.out.println("Quality Mark: " + gum1.qualityMark);
        System.out.println("Export Quality: " + gum1.exportQuality);

        System.out.println("Ingredients:");
        for (int i = 0; i < gum1.ingredients.length; i++) {
            System.out.println(gum1.ingredients[i]);
        }

        System.out.println("Available Sizes:");
        for (int i = 0; i < gum1.availableSizes.length; i++) {
            System.out.println(gum1.availableSizes[i]);
        }
    }
}