class Sensor{
	String typeOfSensor;
	
	Sensor(String typeOfSensor){
		this.typeOfSensor = typeOfSensor;
	}
	
	void getSensor(){
		System.out.println("The typeOfSensor:" +this.typeOfSensor);
	}
}