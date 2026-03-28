class CylinderRunner{
	public static void main(String[] args){
		String[] company = new String[10];
		Cylinder cylinder = new Cylinder(company);
		cylinder.save("HP Gas");
		cylinder.save("Everest Kanto Cylinder Ltd");
		cylinder.save("Maruthi Koatsu Cylinder Ltd");
		cylinder.save("Euro india Cylinder");
		cylinder.save("Lizer Cylinder Limited");
		cylinder.save("BGL Cyliders");
		cylinder.save("Indane Gas");
		cylinder.save("Sahwala High-Pressure Cylinder");
		cylinder.save("Axcel Gases");
		cylinder.save("Rama Cylinder Pvt Ltd");
		cylinder.save("Rama Cylinder Pvt Ltd");
		
		System.out.println("");
		
		boolean value = cylinder.search("Indane Gas");
		System.out.println("The name is in Array:"+value);
	}
}