class ScannerRunner{
	public static void main(String[] args){
		
		String[] type = new String[3];
		type[0] = "3D Scanners";
		type[1] = "Drum Scanners";
		type[2] = "Photo Scanners";
		
		
		Brand[] brand = new Brand[3];
		brand[0] = new Brand("Epson Perfection V39/V39 II",10000);
		brand[1] = new Brand("Canon LiDE 300",6000);
		brand[2] = new Brand("Epson Perfection V600",30000);
		
		
		Scanner scanner = new Scanner(type,brand);
		scanner.display();
		
	}
}