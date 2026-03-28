class Festival{
	String name;
	String state;
	String date;
	String religion;
	String nation;
	String session;
	
	Festival(String name,String state,String date,String religion,String nation,String session){
		this.name = name;
		this.state = state;
		this.date = date;
		this.religion = religion;
		this.nation = nation;
		this.session = session;
	}
	
	
	void printInfo(){
		System.out.println("The printInfo exicuting in class Festival.");
		System.out.println("The name of festival:"+this.name);
		System.out.println("The state:"+this.state);
		System.out.println("The date:"+this.date);
		System.out.println("The religion:"+this.religion);
		System.out.println("The nation:"+this.nation);
		System.out.println("The session:"+this.session);
	}
	
}