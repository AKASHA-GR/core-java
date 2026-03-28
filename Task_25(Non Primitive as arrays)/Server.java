class Server{
	String[] type;
	DNS[] dns;
	
	Server(String[] type,DNS[] dns){
		this.type = type;
		this.dns = dns;
	}
	
	void display(){
		
		System.out.println("The display method is exicuting in the sever class.");
		
		
		if(this.type != null){
			System.out.println("The totle number of types of server:"+this.type.length);
			for(String type:this.type){
				System.out.println("The type of sever:"+type);
			}
		}else{
			System.out.println("The type is null.");
		}
		
		
		if(this.dns != null){
			System.out.println("The totle number of dns:"+this.dns.length);
			for(DNS dns:this.dns){
				dns.getDNS();
			}
		}else{
			System.out.println("The dns is null.");
		}
	}
}