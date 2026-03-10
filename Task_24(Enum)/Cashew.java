class Cashew {

    String brand;
    Batch batch;
    Quality quality;

    Cashew(String brand, Batch batch, Quality quality) {
        this.brand = brand;
        this.batch = batch;
        this.quality = quality;
    }

    void printInfo() {

        System.out.println("The cashew brand: " + this.brand);

        if (this.batch != null) {
            this.batch.getBatch();
        } else {
            System.out.println("Batch is null");
        }

        System.out.println("Cashew quality: " + this.quality);
    }
}