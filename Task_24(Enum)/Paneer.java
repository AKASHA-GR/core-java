class Paneer{

	String brand;
	Packet packet;
	PaneerType paneertype;
	
	
	Paneer(String brand, Packet packet, PaneerType PaneerType){
		this.brand = brand;
		this.packet = packet;
		this.paneertype = paneertype;
	}
	
	void printInfo(){
		System.out.println("The paneer brand: " + this.brand);
		
		if(this.packet != null){
			this.packet.getPacket();
		}else{
			System.out.println("The packet is null.");
		}
		
		System.out.println("The paneer type: " + this.ptype);
	}
}