class Profile{
	String name;
	String dob;
	String gender;
	int age;
	String education;
	boolean hadJob;
	
	Profile(String name,String dob,String gender,int age,String education,boolean hadJob){
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.age = age;
		this.education = education;
		this.hadJob = hadJob;
	}
	
	
	void printInfo(){
		System.out.println("The printInfo is exicutnig in Profile.");
		System.out.println("The name:"+name);
		System.out.println("The dob:"+dob);
		System.out.println("The gender:"+gender);
		System.out.println("The age:"+age);
		System.out.println("The education:"+education);
		System.out.println("The hadJob:"+hadJob);
	}
	
}