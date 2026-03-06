class Coach{
	String name;
	String location;
	int age;
	double weight;
	double height;
	Salary salary;
	Type type;
	Job job;
	Field field;
	Qualification qualification;
	
	Coach(String name,String location,int age,double weight,double height,Salary salary,Type type,Job job,Field field,Qualification qualification){
		this.name = name;
		this.location = location;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salary;
		this.type = type;
		this.job = job;
		this.field = field;
		this.qualification = qualification;

		
	}
	
	void getCoach(){
		System.out.println("The name of the coach:"+this.name);
		System.out.println("The location of the coach:"+this.location);
		System.out.println("The age of the coach:"+this.age);
		System.out.println("The weight of the coach:"+this.weight);
		System.out.println("The height of the coach:"+this.height);
	}
}