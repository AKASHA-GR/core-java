class ToxicRunner {
    public static void main(String[] args) {

        Toxic toxic1 = new Toxic("Hydrochloric Acid","HCl","Acid","Liquid","Colorless","Sharp","Chemical Plant","High","Cool Dry Place",36.5,1.2,110, -27,8.5,100,2027,9,50,8,true,true);
        toxic1.display();
        System.out.println();

        Toxic toxic2 = new Toxic("Sulfuric Acid","H2SO4","Acid","Liquid","Colorless","Odorless","Factory","Very High","Sealed Container",98.0,1.8,337,10,9.5,80,2028,10,40,9,false,true);
        toxic2.display();
        System.out.println();

        Toxic toxic3 = new Toxic("Ammonia","NH3","Gas","Gas","Colorless","Pungent","Industry","Medium","Pressurized Tank",17.0,0.7,-33,-78,7.0,120,2026,7,60,6,true,false);
        toxic3.display();
        System.out.println();

        Toxic toxic4 = new Toxic("Chlorine","Cl2","Gas","Gas","Greenish","Strong","Water Treatment","High","Cylinder",70.9,3.2,-34,-101,8.0,60,2026,8,30,7,true,true);
        toxic4.display();
        System.out.println();

        Toxic toxic5 = new Toxic("Methanol","CH3OH","Alcohol","Liquid","Colorless","Mild","Lab","Medium","Closed Bottle",32.0,0.79,65,-98,6.5,90,2027,6,25,5,true,false);
        toxic5.display();
        System.out.println();

        Toxic toxic6 = new Toxic("Benzene","C6H6","Hydrocarbon","Liquid","Colorless","Sweet","Petrochemical","High","Sealed Drum",78.0,0.88,80,5,8.5,50,2025,9,20,8,true,false);
        toxic6.display();
        System.out.println();

        Toxic toxic7 = new Toxic("Carbon Monoxide","CO","Gas","Gas","Colorless","Odorless","Combustion","Very High","Cylinder",28.0,1.14,-191,-205,9.0,40,2026,10,15,9,true,false);
        toxic7.display();
        System.out.println();

        Toxic toxic8 = new Toxic("Formaldehyde","CH2O","Aldehyde","Liquid","Colorless","Strong","Industry","High","Cool Storage",30.0,0.82,-19,-92,8.0,70,2027,8,35,7,true,true);
        toxic8.display();
        System.out.println();

        Toxic toxic9 = new Toxic("Acetone","C3H6O","Solvent","Liquid","Colorless","Sweet","Lab","Medium","Closed Bottle",58.0,0.79,56,-95,6.0,110,2026,6,45,5,true,false);
        toxic9.display();
        System.out.println();

        Toxic toxic10 = new Toxic("Nitric Acid","HNO3","Acid","Liquid","Yellowish","Sharp","Chemical Industry","Very High","Glass Container",63.0,1.5,83,-42,9.0,55,2028,9,30,9,true,true);
        toxic10.display();
        System.out.println();
    }
}