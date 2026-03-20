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
		
		System.out.println("");
		
		cylinder.update(5,"hiiiiiiii");
		
		System.out.println("");
		
		boolean value1 = cylinder.update("Maruthi Koatsu Cylinder Ltd","hiiiiiiii");
		System.out.println("The name is updated:"+value1);
		
		System.out.println("");
		
		boolean value2 = cylinder.delete(8);
		System.out.println("The name is deleted:"+value2);
		
		System.out.println("");
		
		boolean value3 = cylinder.delete("Indane Gas");
		System.out.println("The name is deleted:"+value3);
	}
}