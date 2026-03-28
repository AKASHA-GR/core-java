class Packet{

	int weight;
	String packaging;
	
	
	Packet(int weight,String packaging){
		this.weight = weight;
		this.packaging = packaging;
	}
	
	void getPacket(){
		System.out.println("The paneer weight: " + this.weight);
		System.out.println("The packaging type: " + this.packaging);
	}
}