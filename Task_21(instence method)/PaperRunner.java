class PaperRunner{
	public static void main(String[] args){
		
		Paper paper1 = new Paper("JK Copier","A4","White","Wood Pulp","Matte","Smooth","Printing","India",
        29.7,21.0,0.10,500,250.00,98.5,75,500,200,12,false,false);
		paper1.page();
		System.out.println();
		
		Paper paper2 = new Paper("Classmate","A4","White","Recycled","Matte","Smooth","Printing","India",
        29.7,21.0,0.11,520,270.00,97.0,80,500,150,12,true,false);
		paper2.page();
		System.out.println();
		
		Paper paper3 = new Paper("Navneet","A3","White","Wood Pulp","Matte","Smooth","Drawing","India",
        42.0,29.7,0.12,1000,480.00,96.5,100,250,80,24,false,false);
		paper3.page();
		System.out.println();
		
		Paper paper5 = new Paper("ITC Paperkraft","A4","White","Wood Pulp","Glossy","Smooth","Printing","India",
        29.7,21.0,0.10,500,300.00,99.0,75,500,120,12,false,false);
		paper5.page();
		System.out.println();
		
		Paper paper4 = new Paper("Bilt Matrix","A4","White","Recycled","Matte","Smooth","Office Use","India",
        29.7,21.0,0.09,480,240.00,95.0,70,500,300,12,true,false);
		paper4.page();
		System.out.println();
		
		Paper paper6 = new Paper("Century","Cardstock","Cream","Wood Pulp","Matte","Rough","Craft","India",
        30.0,22.0,0.25,700,550.00,94.0,200,100,60,24,false,false);
		paper6.page();
		System.out.println();
		
		Paper paper7 = new Paper("Oddy","A4","White","Wood Pulp","Matte","Smooth","Printing","India",
        29.7,21.0,0.10,500,230.00,96.0,75,500,180,12,false,false);
		paper7.page();
		System.out.println();
		
		Paper paper8 = new Paper("PaperOne","A4","White","Wood Pulp","Glossy","Smooth","High Quality Printing","Indonesia",
        29.7,21.0,0.10,500,320.00,100.0,80,500,90,12,false,false);
		paper8.page();
		System.out.println();
		
		Paper paper9 = new Paper("Kokuyo","A4","White","Recycled","Matte","Smooth","Office Use","Japan",
        29.7,21.0,0.11,510,350.00,97.5,75,500,70,18,true,false);
		paper9.page();
		System.out.println();
		
		Paper paper10 = new Paper("HP","A4","White","Wood Pulp","Matte","Smooth","Laser Printing","USA",
        29.7,21.0,0.10,500,400.00,99.5,80,500,60,24,false,false);
		paper10.page();
		System.out.println();
		
	}
}