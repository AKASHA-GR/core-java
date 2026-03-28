class BrokerRunner{
	public static void main(String... args){
		
		String[] name = {"Sammer","Kumar","Arfath","vinod"};
		
		House[] house = new House[3];
		house[0] = new House("Sobha Dream Acres",5000);
		house[1] = new House("Prestige Lakeside Habitat",10000);
		house[2] = new House("Provident Park Square",25000);
		
		
		Broker broker = new Broker(name,house);
		broker.display();
		
	}
}