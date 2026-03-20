class TurbineRunner{
	public static void main(String[] atgs){
		
		String[] name = new String[10];
		Turbine turbine = new Turbine(name);
		turbine.save("Pelton Wheel Turbine");
		turbine.save("Francis Turbine");
		turbine.save("Kaplan Turbine");
		turbine.save("Turgo Turbine");
		turbine.save("Cross-Flow Turbine");
		turbine.save("Steam Turbine");
		turbine.save("Gas Turbine");
		turbine.save("Wind Turbine");
		turbine.save("Archimedes Screw Turbine");
		turbine.save("Contra-Rotating Turbine");
		
		System.out.println("");
		
		
		boolean value = turbine.search("Kaplan Turbine");
		System.out.println("The element is exist:"+value);
		
		
		System.out.println("");
		
		
		boolean value1 = turbine.update(6,"hi");
		System.out.println("The element is update:"+value1);
		
		System.out.println("");
		
		
		boolean value2 = turbine.update("Wind Turbine","hi");
		System.out.println("The element is update:"+value2);
		
		System.out.println("");
		
		boolean value3 = turbine.delete(8);
		System.out.println("The element is update:"+value3);
		
		System.out.println("");
		Turbine turbine1 = new Turbine(name);
		turbine1.delete("Turgo Turbine");
		
		
	}
}