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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Weight weight = new Weight(800);
		Rgb rgb = new Rgb("Red");
		Color color = new Color();
		Button button = new Button();
		Wire wire = new Wire();
		
		Mouse mouse = new Mouse("Logitech","Logitech G304",4.8,2399,2,weight,rgb,color,button,wire);
		mouse.getMouse();
		weight.getWeight();
		rgb.getRgb();
		System.out.println("");
		
		
		Extension extension = new Extension();
		Create create = new Create("4/3/2026");
		Modification modification = new Modification();
		OpSystem opSystem = new OpSystem("Windows");
		Folder folder = new Folder();
		
		File file = new File("Web Technology","C drive","Web",10,true,extension,create,modification,opSystem,folder);
		file.getFile();
		create.getFileDate();
		opSystem.getFileOpSystem();
		System.out.println("");
		
		
		Lifespan lifespan = new Lifespan(14,18);
		Reast reast = new Reast(20);
		Run run = new Run();
		LionColor lioncolor = new LionColor();
		Nails nails = new Nails();
		
		Lion lion = new Lion("Cat family",8,39000,250,4,lifespan,reast,run,lioncolor,nails);
		lion.getLion();
		lifespan.getLifespan();
		reast.getReast();
		System.out.println("");
		
		
		Invented invented = new Invented(1820);
		Material material = new Material("Metal");
		Current current = new Current();
		Magnet magnet = new Magnet();
		Shape shape = new Shape();
		Motor motor = new Motor("Dc motor","Generic","100 RPM Single Shaft Straight BO Motor",60.00,30.00,invented,material,current,magnet,shape);
		motor.getMotor();
		invented.getInvented();
		material.getMaterial();
		System.out.println("");
		
		
		Salary salary = new Salary(80000);
		Type type = new Type("Pessonal coach");
		Job job = new Job();
		Field field = new Field();
		Qualification qualification = new Qualification();
		
		Coach coach = new Coach("Nagendrappa","Ballary",35,68.00,5.9,salary,type,job,field,qualification);
		coach.getCoach();
		salary.getSalary();
		type.getType();
		System.out.println("");
		
		
		History history = new History("China");
		Year year = new Year(2735);
		Quality quality = new Quality();
		Size size = new Size();
		Aproved aproved = new Aproved();
		
		Tea tea = new Tea("Green tea","Karnataka","Helgth",80.00,4,history,year,quality,size,aproved);
		tea.getTea();
		history.getHistory();
		year.getYear();
		System.out.println("");
		
		
		IplSize iplSize = new IplSize();
		Kit kit = new Kit();
		Bat bat = new Bat(1.4);
		Area area = new Area();
		Sensor sensor = new Sensor("Wether sensor");
		Ipl ipl = new Ipl("RCB","United Spirits Limited ",1235,"Rajat Patidar","Bengaluru",iplSize,kit,bat,area,sensor);
		ipl.getIpl();
		bat.getBat();
		sensor.getSensor();
		
	}
}