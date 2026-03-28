class EmployeeRunner{
	public static void main(String[] args){
		
		String name = "Akasha G R";
		int age = 22;
		boolean hieard = true;
		
		Employee.employeeInfo(name,age,hieard);
		
		name = "infosis";
		boolean it= true;
		int noOfEmployees = 25000;
		
		Employee.companyInfo(name,it,noOfEmployees);
		
		
        name = "Shanker";
		age = 20;
		hieard = false;
	    
		Employee.employeeInfo(name,age,hieard);
		
		name = "Tata";
	    it = false;
		noOfEmployees = 38000;
		
		Employee.companyInfo(name,it,noOfEmployees);
	}
}