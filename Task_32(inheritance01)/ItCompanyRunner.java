class ItCompanyRunner{
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.assigment();
		employee.work();
		System.out.println("");
		
		Projects projects = new Projects();
		projects.task();
		projects.work();
		System.out.println("");
		
		Departments departments = new Departments();
		departments.assign();
		departments.work();
		System.out.println("");
	}
}