class CarrotHalwaRunner{
	public static void main(String[] args){
		
		String[] size = {"250gm","150gm","500gm","750gm"};
		
		
		Items[] item = new Items[3];
		item[0] = new Items("oil",150);
		item[1] = new Items("Carrot",80);
		item[2] = new Items("Sugur",50);
		
		CarrotHalwa carrot = new CarrotHalwa(size,item);
		carrot.display();
		
	}
}