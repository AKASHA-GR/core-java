class Bisket{
	
	static int getCost(String name){
		System.out.println("The Cocie Name:" +name);
		
		if(name == null){
			System.out.println("The Statement is invalid...");
			return 0;	
		}
		
		System.out.println("The Data is Valid...");
		
		if(name == "Parla-G"){
			return 5;
		}
		
		if(name == "Oreo"){
			return 10;
		}
		
		if(name == "HappyHappy"){
			return 10;
		}
		
		if(name == "Goodday"){
			return 20;
		}
		return 0;
    }
	
	static String getShap(String name){
		System.out.println("The Cookie Shap:" +name);
		
		if(name == null){
			System.out.println("The statement is invalid...");
			return null;
		}
		
		if(name == "Parla-G"){
			return "Rectangle";
		}
		
		if(name == "oreo"){
			return "Cercle";
		}
		
		if(name == "Cheska Muska"){
			return "Square";
		}
		
		if(name == "Goodday"){
			return "Cercle";
		}
		return null;
	}
	
	static String flavour(String[] name){
		System.out.println("The Cookies Flavours:" +name);
		
		if(name == null){
			System.out.println("The statement is invalid...");
			return null;
		}
		
		if(name == "Oreo"){
			String[] str = {"milky", "Dark"};
			return str;
		}
	}

}