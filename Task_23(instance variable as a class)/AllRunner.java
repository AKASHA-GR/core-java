class AllRunner{
	public static void main(String... args){
		
		Price price = new Price(1200,29);
		Sound sound = new Sound("tin tin tin...");
		BellTime bellTime = new BellTime("12:00","Digital Clock");
		Frequency frequency = new Frequency(50,"Medium");
		FindPlace findPlace = new FindPlace("Schools");
		
		Bell bell = new Bell("Electronic Bell","Silver",true,2.5,8,price,sound,bellTime,frequency,findPlace);
		bell.getBell();
		System.out.println("");
		
		
		Fish fish = new Fish("Betta","egg-layer");
		Plant plant = new Plant("Anubias barteri","Rhizome type");
		Quantity quanlity = new Quantity(30,true);
		AquaStone aquaStone = new AquaStone("Seiryu","hardens water");
		AquaSize aquaSize = new AquaSize("30 X 18 X 16");
		
		Aquarium aquarium = new Aquarium("AquaEI","Glass","Cude",6000,true,fish,plant,quanlity,aquaStone,aquaSize);
		aquarium.getAquarium();
		System.out.println("");
		
		
		BackupFile backupFile = new BackupFile("Exel",".exl");
		CloudType cloudType = new CloudType("Private type");
		Analysis analysis = new Analysis("Homeprice Prediction","2");
		Deployment deployment = new Deployment("web app");
		StorePlace storePlace = new StorePlace("America");
		
		Cloud cloud = new Cloud("AWS","Paas","10",35000,"Mysql",backupFile,cloudType,analysis,deployment,storePlace);
		cloud.getCloud();
		System.out.println("");
		
		
		Rating rating = new Rating(4);
		SpaType spaType = new SpaType("Mineral Springs Spa");
		SpaLocation spaLocation = new SpaLocation("Bengaluru");
		ItemsCount itemsCount = new ItemsCount(5);
		ShopTime shopTime = new ShopTime("12:00");
		
		Spa spa = new Spa("Gazzo","Chiti","chiti@gmail.com",2389578493L,50000,rating,spaType,spaLocation,itemsCount,shopTime);
		spa.getSpa();
		System.out.println("");
		
		
		
		History history = new History("China");
		Year year = new Year(2735);
		Quality quality = new Quality("Good");
		Size size = new Size("10 GM");
		Aproved aproved = new Aproved("Yes");
		
		Tea tea = new Tea("Green tea","Karnataka","Helgth",80.00,4,history,year,quality,size,aproved);
		tea.getTea();
		System.out.println("");
		
		
		
		Weight weight = new Weight(800);
		Rgb rgb = new Rgb("Red");
		Color color = new Color("White");
		Button button = new Button(210);
		Wire wire = new Wire(true);
		
		Mouse mouse = new Mouse("Logitech","Logitech G304",4.8,2399,2,weight,rgb,color,button,wire);
		mouse.getMouse();
		System.out.println("");
		
		
		Extension extension = new Extension(".html");
		Create create = new Create("4/3/2026");
		Modification modification = new Modification("4/4/2026");
		OpSystem opSystem = new OpSystem("Windows");
		Folder folder = new Folder("Fitness traker");
		
		File file = new File("Web Technology","C drive","Web",10,true,extension,create,modification,opSystem,folder);
		file.getFile();
		System.out.println("");
		
		
		
		Lifespan lifespan = new Lifespan(14,18);
		Reast reast = new Reast(20);
		Run run = new Run(80);
		LionColor lioncolor = new LionColor("White");
		Nails nails = new Nails(20);
		
		Lion lion = new Lion("Cat family",8,39000,250,4,lifespan,reast,run,lioncolor,nails);
		lion.getLion();
		System.out.println("");
		
		
		Invented invented = new Invented(1820);
		Material material = new Material("Metal");
		Current current = new Current(true);
		Magnet magnet = new Magnet(2);
		Shape shape = new Shape("Cylinder");
		Motor motor = new Motor("Dc motor","Generic","100 RPM Single Shaft Straight BO Motor",60.00,30.00,invented,material,current,magnet,shape);
		motor.getMotor();
		System.out.println("");
		
		
		
		Salary salary = new Salary(80000);
		Type type = new Type("Pessonal coach");
		Job job = new Job("Triner for specific Field");
		Field field = new Field("Sports Field");
		Qualification qualification = new Qualification("BE....");
		
		Coach coach = new Coach("Nagendrappa","Ballary",35,68.00,5.9,salary,type,job,field,qualification);
		coach.getCoach();
		System.out.println("");
		
		
		
		
		
		IplSize iplSize = new IplSize(11);
		Kit kit = new Kit("Protectd kit");
		Bat bat = new Bat(1.4);
		Area area = new Area("Bengaluru");
		Sensor sensor = new Sensor("Wether sensor");
		Ipl ipl = new Ipl("RCB","United Spirits Limited ",1235,"Rajat Patidar","Bengaluru",iplSize,kit,bat,area,sensor);
		ipl.getIpl();
		
	}
}