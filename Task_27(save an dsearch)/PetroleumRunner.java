class PetroleumRunner{
	public static void main(String[] args){
		String[] name = new String[10];
		Petroleum petroleum = new Petroleum(name);
		petroleum.save("Gasoline ");
		petroleum.save("Diesel Fuel");
		petroleum.save("Liquefied Petroleum Gas");
		petroleum.save("Jet Fuel");
		petroleum.save("Kerosene");
		petroleum.save("Asphalt");
		petroleum.save("Lubricating Oils/Greases");
		petroleum.save("Paraffin Wax");
		petroleum.save("Petrochemical Feedstocks");
		petroleum.save("Petroleum Coke");
		
		System.out.println("");
		
		
		boolean value = petroleum.search("Jet Fuel");
		System.out.println("The item in an array:"+value);
	}
}