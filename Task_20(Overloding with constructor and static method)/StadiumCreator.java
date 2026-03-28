class StadiumCreator{
	
	static void getStadium(){
		Stadium stadium = new Stadium();
		
		System.out.println("printing the name and price of the studium as a Null.");
		System.out.println("The name of Stadium:" +stadium.name);
		System.out.println("The Enter price of Stadium:" +stadium.price);
	}
	
	static void getStadium(String name){
		Stadium studium = new Stadium(name);
		
		System.out.println("Geting the name of studium from user.");
		System.out.println("The name of Stadium:" +studium.name);
	}
	
	static void getStadium(int price){
		Stadium studium = new Stadium(price);
		
		System.out.println("Geting the price of the studium from user.");
		System.out.println("The Enter price of Stadium:"+studium.price);
	}
	
}