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
		
	}
}