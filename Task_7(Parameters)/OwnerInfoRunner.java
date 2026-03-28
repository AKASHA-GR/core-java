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
		int gstNO = 8429484927;
		String taxPaid = "yes";
		int age = 22;
		string address = "Chiradurga"
		Owner.ownerInfo(name,gstNO,taxPaid,age,address);
}
}