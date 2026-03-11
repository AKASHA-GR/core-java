class DNS{
	String name;
	String ipAddres;
	
	DNS(String name,String ipAddres){
		this.name = name;
		this.ipAddres = ipAddres;
	}
	
	void getDNS(){
		System.out.println("The name of Dns:"+this.name);
		System.out.println("Teh ipAddres of Dns:"+this.ipAddres);
	}
}