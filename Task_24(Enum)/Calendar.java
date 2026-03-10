class Calendar{
	double price;
	Months months;
	Weeks weeks;
	
	Calender(double price,Weeks weeks,Months months){
		this.price = price;
		this.weeks = weeks;
		this.months = months;
	}
	
	void printInfo(){
		System.out.println("The price of calender:"+this.price);
		System.out.println("The month of calender:"+this.months);
		
		if(this.weeks != null){
			this.weeks.getWeeks();
		}
	}
}