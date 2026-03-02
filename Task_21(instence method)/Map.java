class Map {

    String name;
    String type;
    String region;
    String publisher;
    String language;
    String scale;
    String material;
    String colorTheme;
    String countryOfOrigin;
    double width;
    double height;
    double weight;
    double price;
    double scaleRatio;
    int pages;
    int publicationYear;
    int quantityInStock;
    int warrantyYears;
    int durabilityRating;
    boolean laminated;
    boolean foldable;

    Map(String name, String type, String region, String publisher, String language,
        String scale, String material, String colorTheme, String countryOfOrigin,
        double width, double height, double weight, double price, double scaleRatio,
        int pages, int publicationYear, int quantityInStock, int warrantyYears,
        int durabilityRating, boolean laminated, boolean foldable) {

        this.name = name;
        this.type = type;
        this.region = region;
        this.publisher = publisher;
        this.language = language;
        this.scale = scale;
        this.material = material;
        this.colorTheme = colorTheme;
        this.countryOfOrigin = countryOfOrigin;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.price = price;
        this.scaleRatio = scaleRatio;
        this.pages = pages;
        this.publicationYear = publicationYear;
        this.quantityInStock = quantityInStock;
        this.warrantyYears = warrantyYears;
        this.durabilityRating = durabilityRating;
        this.laminated = laminated;
        this.foldable = foldable;
    }

    void display() {
        System.out.println("The Map Name: " + name);
        System.out.println("The Type: " + type);
        System.out.println("The Region: " + region);
        System.out.println("The Publisher: " + publisher);
        System.out.println("The Language: " + language);
        System.out.println("The Scale: " + scale);
        System.out.println("The Material: " + material);
        System.out.println("The Color Theme: " + colorTheme);
        System.out.println("The Country Of Origin: " + countryOfOrigin);
        System.out.println("The Width: " + width);
        System.out.println("The Height: " + height);
        System.out.println("The Weight: " + weight);
        System.out.println("The Price: " + price);
        System.out.println("The Scale Ratio: " + scaleRatio);
        System.out.println("The Pages: " + pages);
        System.out.println("The Publication Year: " + publicationYear);
        System.out.println("The Quantity In Stock: " + quantityInStock);
        System.out.println("The Warranty Years: " + warrantyYears);
        System.out.println("The Durability Rating: " + durabilityRating);
        System.out.println("The Laminated: " + laminated);
        System.out.println("The Foldable: " + foldable);
    }
}