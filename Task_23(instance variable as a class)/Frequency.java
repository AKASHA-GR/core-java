class Frequency{
	double frequencyInHz;
	String frequencyLevel;
	
	Frequency(double frequencyInHz,String frequencyLevel){
		this.frequencyInHz = frequencyInHz;
		this.frequencyLevel = frequencyLevel;
	}
	
	void getFrequency(){
		System.out.println("The frequencyInHz of bell:" +this.frequencyInHz);
		System.out.println("The frequencyLevel of bell:" +this.frequencyLevel);
	}
}