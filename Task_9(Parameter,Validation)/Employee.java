//Declare your own class , declare two methods with 3 parameters and invoke it two times

class Employee{
	static void employeeInfo(String name,int age,boolean hierd){
		
		System.out.println("The name of employee:" +name);
		System.out.println("The Age of an Employee:" +age);
		System.out.println("The Employee is working:" + hierd);
		System.out.println("");
		
		if(name == null){
			System.out.println("The statement is invalid... Make sure the name is not null!");
			return;
		}
		
		if(age <=0){
			System.out.println("The statement is invalid... Make sure the age is not Zero!");
			return;
		}
		
		if(hierd == false){
			System.out.println("The statement is invalid... Make sure the hierd is not false");
			return;
		}
			
		
	}
	
	static void companyInfo(String name, boolean it, int noOfEmployees){
		
		System.out.println("The Name of company:" +name);
		System.out.println("The company is IT:" + it);
		System.out.println("The number of Employee working:" +noOfEmployees);
		System.out.println("");
		
		if(name == null){
			System.out.println("The statement is invalid... Make sure the name is not null!");
			return;
		}
		
		if(it == false){
			System.out.println("The statement is invalid... Make sure the it is not false");
			return;
		}
		
		if(noOfEmployees <=0){
			System.out.println("The statement is invalid... Make sure the noOfEmployees is not Zero!");
			return;
		}
	}
}