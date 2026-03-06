class BellTime{
	String time;
	String clockName;
	
	BellTime(String time,String clockName){
		this.time = time;
		this.clockName = clockName;
	}
	
	void getBellTime(){
		System.out.println("The Bell time:" +this.time);
		System.out.println("The Clock name:" +this.clockName);
	}
}