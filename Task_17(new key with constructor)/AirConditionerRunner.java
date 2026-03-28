class AirConditionerRunner{
	public static void main(String[] args){
		
		AirConditioner airConditioner = new AirConditioner();
		
		airConditioner.brand = "LG";
		airConditioner.model = "LS-Q18YNZA";
		airConditioner.price = 45000;
		airConditioner.type = "Split AC";
		airConditioner.weight =30;
		airConditioner.colors = new String[] {"White","Cement White","red","Blue"};
		airConditioner.warranty = 2;
		airConditioner.working = "Uses Dual Inverter Compressor Technology.";
        
		System.out.println("The AirConditioner brand:" +airConditioner.brand);
		System.out.println("The AirConditioner model:" +airConditioner.model);
		System.out.println("The AirConditioner price:" +airConditioner.price);
		System.out.println("The AirConditioner type:" +airConditioner.type);
		System.out.println("The AirConditioner weight:" +airConditioner.weight);
		for(int i=0; i < airConditioner.colors.length; i++){
			System.out.println("The colors of AC:" +airConditioner.colors[i]);
		}
		System.out.println("The warranty in year:" +airConditioner.warranty);
		System.out.println("The working:" +airConditioner.working);
	
	System.out.println("");
	

		AirConditioner airConditioner1 = new AirConditioner();
		
		airConditioner1.brand = "Daikin";
		airConditioner1.model = "FTKF50TV";
		airConditioner1.price = 42000;
		airConditioner1.type = "Split AC";
		airConditioner1.weight =28;
		airConditioner1.colors = new String[] {"White","Cement White","red","Blue"};
		airConditioner1.warranty = 1;
		airConditioner1.working = "Uses Dual Inverter Compressor Technology.";
        
		System.out.println("The AirConditioner brand:" +airConditioner1.brand);
		System.out.println("The AirConditioner model:" +airConditioner1.model);
		System.out.println("The AirConditioner price:" +airConditioner1.price);
		System.out.println("The AirConditioner type:" +airConditioner1.type);
		System.out.println("The AirConditioner weight:" +airConditioner1.weight);
		for(int i=0; i < airConditioner.colors.length; i++){
			System.out.println("The colors of AC:" +airConditioner1.colors[i]);
		}
		System.out.println("The warranty in year:" +airConditioner1.warranty);
		System.out.println("The working:" +airConditioner1.working);



	
	}
}