class ScooterRunner{
	public static void main(String[] args){
		String[] name = new String[10];
		Scooter scooter = new Scooter(name);
		scooter.save("Honda Activa 6G");
		scooter.save("Suzuki Access 125");
		scooter.save("TVS NTORQ 125");
		scooter.save("TVS Jupiter 125/110");
		scooter.save("Yamaha RayZR 125 Fi Hybrid");
		scooter.save("Ather Rizta S");
		scooter.save("TVS iQube");
		scooter.save("Suzuki Burgman Street 125");
		scooter.save("Honda Dio");
		scooter.save("Ola S1 Pro");
		
		System.out.println("");
		
		boolean value = scooter.search("TVS iQube");
		System.out.println("The name is in an array: "+value);
		
		
		System.out.println();

        scooter.update(2, "Updated NTORQ");

        System.out.println();

        boolean value1 = scooter.update("Honda Dio", "Honda Dio 125");
        System.out.println("Updated by name: " + value1);

        System.out.println();

        boolean value2 = scooter.delete(5);
        System.out.println("Deleted by index: " + value2);

        System.out.println();

        boolean value3 = scooter.delete("Suzuki Access 125");
        System.out.println("Deleted by name: " + value3);
}
}