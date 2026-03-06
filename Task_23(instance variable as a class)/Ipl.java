class Ipl{
	String teamname;
	String owner;
	double price;
	String teamLeder;
	String location;
	IplSize iplsize;
	Kit kit;
	Bat bat;
	Area area;
	Sensor sensor;
	
	Ipl(String teamname,String owner,double price,String teamLeder,String location,IplSize iplsize,Kit kit,Bat bat,Area area,Sensor sensor){
		this.teamname = teamname;
		this.owner = owner;
		this.price = price;
		this.teamLeder = teamLeder;
		this.location = location;
		this.iplsize = iplsize;
		this.kit = kit;
		this.bat = bat;
		this.area = area;
		this.sensor = sensor;
	}
	
	void getIpl(){
		System.out.println("The TeamName :" +this.teamname);
		System.out.println("The owner :" +this.owner);
		System.out.println("The price :" +this.price);
		System.out.println("The teamLeder :" +this.teamLeder);
		System.out.println("The location :" +this.location);
	}
	
}