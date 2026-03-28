class Seats{
	int totaleSeats;
	String houses;
	
	
	Seats(int totaleSeats,String houses){
		this.totaleSeats = totaleSeats;
		this.houses = houses;
	}
	
	void getSeats(){
		System.out.println("The totaleSeats:"+this.totaleSeats);
		System.out.println("The houses:"+this.houses);
	}
}