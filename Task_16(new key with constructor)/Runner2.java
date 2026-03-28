class Runner2{
	public static void main(String[] args){
		Bike bike = new Bike();
		Bike bike1 = new Bike();
		Bike bike2 = new Bike();
		Bike bike3 = new Bike();
		
		//01
		System.out.println("The Bike name:" +bike.name);
		System.out.println("The Bike public:"+bike.price);
		System.out.println("The Number of Gares:"+bike.gare);
		System.out.println("The bike cc is:"+bike.cc);
		
		bike.name = "Bajaj Pulsur";
		bike.price=94000;
		bike.gare=5;
		bike.cc=150;
		System.out.println("The Bike name:" +bike.name);
		System.out.println("The Bike public:"+bike.price);
		System.out.println("The Number of Gares:"+bike.gare);
		System.out.println("The bike cc is:"+bike.cc);
		
		bike.name = "Honda Shine ";
		bike.price=80000;
		bike.gare=4;
		bike.cc=120;
		System.out.println("The Bike name:" +bike.name);
		System.out.println("The Bike public:"+bike.price);
		System.out.println("The Number of Gares:"+bike.gare);
		System.out.println("The bike cc is:"+bike.cc);
		
		bike.name = " Jawa42";
		bike.price= 159000;
		bike.gare=5;
		bike.cc=220;
		System.out.println("The Bike name:" +bike.name);
		System.out.println("The Bike public:"+bike.price);
		System.out.println("The Number of Gares:"+bike.gare);
		System.out.println("The bike cc is:"+bike.cc);
		System.out.println("");
		System.out.println("");

		
		//02
		Blackboard blackboard = new Blackboard();
		System.out.println("The Blackboard name:" +blackboard.name);
		System.out.println("The Blackboard public:"+blackboard.price);
		System.out.println("The Blackboard is wooden:" +blackboard.isWood);
		System.out.println("The Blackboard length:" +blackboard.length);
		
		
		Blackboard blackboard1 = new Blackboard();
		blackboard.name = "Classic Wooden Framed Blackboard";
		blackboard.price = 800;
		blackboard.isWood=true;
		blackboard.length=120;
		System.out.println("The Blackboard name:" +blackboard.name);
		System.out.println("The Blackboard public:"+blackboard.price);
		System.out.println("The Blackboard is wooden:" +blackboard.isWood);
		System.out.println("The Blackboard length:" +blackboard.length);
		
		Blackboard blackboard3 = new Blackboard();
		blackboard.name = "Aluminium Framed Blackboard";
		blackboard.price = 2000;
		blackboard.isWood=false;
		blackboard.length=180;
		System.out.println("The Blackboard name:" +blackboard.name);
		System.out.println("The Blackboard public:"+blackboard.price);
		System.out.println("The Blackboard is wooden:" +blackboard.isWood);
		System.out.println("The Blackboard length:" +blackboard.length);
		
		Blackboard blackboard2 = new Blackboard();
		blackboard.name = "Magnetic Blackboard with Aluminium Frame";
		blackboard.price = 3000;
		blackboard.isWood=false;
		blackboard.length=150;
		System.out.println("The Blackboard name:" +blackboard.name);
		System.out.println("The Blackboard public:"+blackboard.price);
		System.out.println("The Blackboard is wooden:" +blackboard.isWood);
		System.out.println("The Blackboard length:" +blackboard.length);
		System.out.println("");
		System.out.println("");
		
		//03
		
		SmartPhone smartPhone = new SmartPhone();
		SmartPhone smartPhone1 = new SmartPhone();
		SmartPhone smartPhone2 = new SmartPhone();
		SmartPhone smartPhone3 = new SmartPhone();
		
		System.out.println("The SmartPhone name:" +smartPhone.name);
		System.out.println("The SmartPhone public:"+smartPhone.price);
		System.out.println("The SmartPhone Storage:" +smartPhone.storage);
		System.out.println("The SmartPhone is Waterproof:"+smartPhone.isWaterproof);
		
		
		smartPhone.name= "Oneplus Nord CE5";
		smartPhone.price = 24999;
		smartPhone.storage = 128;
		smartPhone.isWaterproof = true;
		System.out.println("The SmartPhone name:" +smartPhone.name);
		System.out.println("The SmartPhone public:"+smartPhone.price);
		System.out.println("The SmartPhone Storage:" +smartPhone.storage);
		System.out.println("The SmartPhone is Waterproof:"+smartPhone.isWaterproof);
		
		smartPhone.name = "Oppo K13";
		smartPhone.price = 19999;
		smartPhone.storage = 256;
		smartPhone.isWaterproof = false;
		System.out.println("The SmartPhone name:" +smartPhone.name);
		System.out.println("The SmartPhone public:"+smartPhone.price);
		System.out.println("The SmartPhone Storage:" +smartPhone.storage);
		System.out.println("The SmartPhone is Waterproof:"+smartPhone.isWaterproof);
		
		smartPhone.name = "Vivo X300";
		smartPhone.price = 75999;
		smartPhone.storage = 256;
		smartPhone.isWaterproof = true;
		System.out.println("The SmartPhone name:" +smartPhone.name);
		System.out.println("The SmartPhone public:"+smartPhone.price);
		System.out.println("The SmartPhone Storage:" +smartPhone.storage);
		System.out.println("The SmartPhone is Waterproof:"+smartPhone.isWaterproof);
		System.out.println("");
		System.out.println("");
		
		//04
		
		Laptop laptop = new Laptop();
		Laptop laptop1 = new Laptop();
		Laptop laptop2 = new Laptop();
		Laptop laptop3 = new Laptop();
		
		
		System.out.println("The Laptop name:" +laptop.name);
		System.out.println("The Laptop public:"+laptop.price);
		System.out.println("The Laptop processor:" +laptop.processor);
		System.out.println("The laptop Storage:" +laptop.storage);
		
		laptop.name = "Asus Vivobook Go 14";
		laptop.price = 34990;
		laptop.processor="Ryzon 7000";
		laptop.storage = 512;
		System.out.println("The Laptop name:" +laptop.name);
		System.out.println("The Laptop public:"+laptop.price);
		System.out.println("The Laptop processor:" +laptop.processor);
		System.out.println("The laptop Storage:" +laptop.storage);
		
		laptop.name = "Acer Aspirw Go 14";
		laptop.price = 54427;
		laptop.processor="Core i5";
		laptop.storage = 512;
		System.out.println("The Laptop name:" +laptop.name);
		System.out.println("The Laptop public:"+laptop.price);
		System.out.println("The Laptop processor:" +laptop.processor);
		System.out.println("The laptop Storage:" +laptop.storage);
		
		laptop.name = "Lenovo Ideapad Slim";
		laptop.price = 56990;
		laptop.processor="Core i5";
		laptop.storage = 1000;
		System.out.println("The Laptop name:" +laptop.name);
		System.out.println("The Laptop public:"+laptop.price);
		System.out.println("The Laptop processor:" +laptop.processor);
		System.out.println("The laptop Storage:" +laptop.storage);
		System.out.println("");
		System.out.println("");
		
		//05 
		
		SolarWaterheater solarWaterheater = new SolarWaterheater();
		SolarWaterheater solarWaterheater1 = new SolarWaterheater();
		SolarWaterheater solarWaterheater2 = new SolarWaterheater();
		SolarWaterheater solarWaterheater3 = new SolarWaterheater();
		
		solarWaterheater.companyName = "V-guard Industries Ltd";
		solarWaterheater.price = 22000;
		System.out.println("The solarWaterheater name:" +solarWaterheater.companyName);
		System.out.println("The solarWaterheater price:"+solarWaterheater.price);
		
		solarWaterheater.companyName = "Supreme solar Systems";
		solarWaterheater.price = 16000;
		System.out.println("The solarWaterheater name:" +solarWaterheater.companyName);
		System.out.println("The solarWaterheater price:"+solarWaterheater.price);
		
		solarWaterheater.companyName = "Racold Thermo Ltd";
		solarWaterheater.price = 30000;
		System.out.println("The solarWaterheater name:" +solarWaterheater.companyName);
		System.out.println("The solarWaterheater price:"+solarWaterheater.price);
		
		solarWaterheater.companyName = "Tata power Solar Systems Ltd";
		solarWaterheater.price = 38000;
		System.out.println("The solarWaterheater name:" +solarWaterheater.companyName);
		System.out.println("The solarWaterheater price:"+solarWaterheater.price);
	}
}