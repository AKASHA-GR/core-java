class HammerRunner{
	public static void main(String[] args){
		
		String[] material = {"Silver","Metale","Wood","iron"};
		
		HammerType[] hammerType = new HammerType[3];
		hammerType[0] = new HammerType("Claw Hammer",2);
		hammerType[1] = new HammerType("Framing Hammer",2.5);
		hammerType[2] = new HammerType("Ball-Pein Hammer",2.8);
		
		Hammer hammer = new Hammer(material,hammerType);
		hammer.display();
		
	}
}