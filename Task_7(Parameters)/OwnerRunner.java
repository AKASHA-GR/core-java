class OwnerRunner{
	public static void main(String[] args)
{
		/* this is implicit refference 
		Owner.ownerInfo("Akasha",01,"yes",35,"chitradurga");
		
		Owner.ownerInfo("Rahul", 02, "Yes", 45, "Bengaluru");

        Owner.ownerInfo("Shashank", 3, "No", 50, "Mysuru");

        Owner.ownerInfo("Manoge", 4, "Yes", 42, "Davangere");

        Owner.ownerInfo("Sagar", 5, "No", 48, "Mandya");
		*/
		
		// explicite
		String name = "Akasha GR";
		int gstNO = 8429;
		String taxPaid = "yes";
		int age = 22;
		String address = "Chiradurga";
		Owner.ownerInfo(name,gstNO,taxPaid,age,address);
		
		name = "Pratham";
	    gstNO = 8430;
	    taxPaid = "no";
		age = 23;
	    address = "Bengaluru";
		Owner.ownerInfo(name,gstNO,taxPaid,age,address);
		
		name = "Shashank";
		gstNO = 8431;
		taxPaid = "yes";
		age = 24;
		address = "Chanagiri";
		Owner.ownerInfo(name,gstNO,taxPaid,age,address);
		
	    name = "Rahul";
		gstNO = 8432;
		taxPaid = "No";
		age = 25;
		address = "Bellagavi";
		Owner.ownerInfo(name,gstNO,taxPaid,age,address);
		
		name = "Sagar";
	    gstNO = 8433;
		taxPaid = "yes";
		age = 25;
	    address = "Shivamoga";
		Owner.ownerInfo(name,gstNO,taxPaid,age,address);
}
}