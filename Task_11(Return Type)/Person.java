/*Write below methods in Person class, validate all the parameters 
1. contactInfo method ,with name,emails,mobileNumbers,address 
2. foodDish method with name, ingredents 
3. laptop method with brand,model,ports,countriesOfWarranty Read about inference, System class
*/

class Person{
	static void contactInfo(String[] name,String[] emails,long[] mobileNumbers,String address){
		
		System.out.println("List of Contact Information:");
		
		for(int i=0;i<name.length;i++){
			System.out.println("The names:"+name[i]);
		}
		
		for(int i=0;i<emails.length;i++){
			System.out.println("The emails:" +emails[i]);
		}
		
		for(int i=0;i<mobileNumbers.length;i++){
		    System.out.println("the mobileNumbers:" +mobileNumbers[i]);
		}
		
		System.out.println("The address:" +address);
		
	}
	
	
	static void foodDish(String name,String[] ingredents){
		
		System.out.println("The name of dish:" +name);
		
		for(int i=0;i<ingredents.length;i++){
			System.out.println("The ingredents:" +ingredents[i]);
		}
	}
	
	
	
	static void laptop(String brand,String model,String[] ports,String[] countriesOfWarranty){
		
		System.out.println("The Laptop brand name:" +brand);
		System.out.println("The Laptop Modle name:" +model);
		
		for(int i=0;i<ports.length;i++){
			System.out.println("The ports:"+ports[i]);
		}
		
		for(int i=0;i<countriesOfWarranty.length;i++){
			System.out.println("The countriesOfWarranty:" +countriesOfWarranty[i]);
		}
		
		
	}
}