class GermanShepherdInfoRunner{
	public static void main(String[] args){
		GermanShepherdInfo germanShepherdInfo = new GermanShepherdInfo();
		System.out.println("The germanShepherd name:"+germanShepherdInfo.name);
		System.out.println("The germanShepherd age:"+germanShepherdInfo.age);
		System.out.println("The germanShepherd price:"+germanShepherdInfo.price);
		System.out.println("");
		
		GermanShepherdInfo germanShepherdInfo1 = new GermanShepherdInfo("ram",7,76000);
		System.out.println("The germanShepherd name:"+germanShepherdInfo1.name);
		System.out.println("The germanShepherd age:"+germanShepherdInfo1.age);
		System.out.println("The germanShepherd price:"+germanShepherdInfo1.price);
		System.out.println("");
		
		GermanShepherdInfo germanShepherdInfo2 = new GermanShepherdInfo("Raghu",80000);
		System.out.println("The germanShepherd name:"+germanShepherdInfo2.name);
		System.out.println("The germanShepherd age:"+germanShepherdInfo2.age);
		System.out.println("The germanShepherd price:"+germanShepherdInfo2.price);
		System.out.println("");
	}
}