class ConditionerRunner {

    public static void main(String[] args) {

        Conditioner conditioner1 = new Conditioner("Dove","Intense Repair","Mild","Dry",
                "Keratin","Aloe","Vitamin E","White","HUL","India",
                100,24,5,2024,12,180,250,5.5,10,200);
        conditioner1.display();
        System.out.println("");

        Conditioner conditioner2 = new Conditioner("Pantene","Smooth & Shine","Floral","Frizzy",
                "Pro-V","Argan Oil","Aqua","Gold","P&G","USA",
                80,30,4,2023,12,200,300,6.0,15,220);
        conditioner2.display();
        System.out.println("");

        Conditioner conditioner3 = new Conditioner("Clinic Plus","Strong Hair","Fresh","Normal",
                "Milk Protein","Aloe","Vitamin B5","White","HUL","India",
                120,24,4,2024,12,175,180,5.8,5,190);
        conditioner3.display();
        System.out.println("");

        Conditioner conditioner4 = new Conditioner("Loreal","Total Repair","Rose","Damaged",
                "Ceramide","Protein","Aqua","Pink","Loreal","France",
                60,36,5,2022,18,250,450,6.2,20,260);
        conditioner4.display();
        System.out.println("");

        Conditioner conditioner5 = new Conditioner("Head & Shoulders","Anti Hairfall","Mint","Oily",
                "Zinc","Menthol","Aqua","Blue","P&G","USA",
                90,30,4,2023,12,210,320,6.0,12,230);
        conditioner5.display();
        System.out.println("");

        Conditioner conditioner6 = new Conditioner("Tresemme","Keratin Smooth","Mild","Dry",
                "Keratin","Marula Oil","Aqua","Black","Unilever","UK",
                70,24,5,2024,12,340,550,5.7,18,350);
        conditioner6.display();
        System.out.println("");

        Conditioner conditioner7 = new Conditioner("Sunsilk","Soft & Smooth","Jasmine","Normal",
                "Egg Protein","Aloe","Vitamin E","Yellow","HUL","India",
                110,24,4,2024,12,190,210,5.6,8,205);
        conditioner7.display();
        System.out.println("");

        Conditioner conditioner8 = new Conditioner("Mamaearth","Onion","Herbal","Hairfall",
                "Onion Oil","Plant Keratin","Aqua","Brown","Mamaearth","India",
                75,18,5,2025,12,220,399,5.9,10,240);
        conditioner8.display();
        System.out.println("");

        Conditioner conditioner9 = new Conditioner("WOW","Apple Cider","Apple","Oily",
                "ACV","Coconut Oil","Aqua","Transparent","WOW","India",
                85,24,4,2024,12,250,499,6.1,15,260);
        conditioner9.display();
        System.out.println("");

        Conditioner conditioner10 = new Conditioner("Garnier","Ultra Blends","Avocado","Dry",
                "Avocado Oil","Shea Butter","Aqua","Green","Garnier","France",
                95,24,5,2025,12,200,275,5.8,12,215);
        conditioner10.display();
        System.out.println("");
    }
}