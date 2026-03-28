class ShoeLace {
    String brand;
    String material;
    String color;
    double length;
    double price;
    boolean elastic;
    String pattern;
    String shoeType;
    boolean waterproof;
    String originCountry;

    ShoeLace(String brand, String material, String color, double length,
             double price, boolean elastic, String pattern,
             String shoeType, boolean waterproof, String originCountry) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.price = price;
        this.elastic = elastic;
        this.pattern = pattern;
        this.shoeType = shoeType;
        this.waterproof = waterproof;
        this.originCountry = originCountry;
    }
}