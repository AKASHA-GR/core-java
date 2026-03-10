class CalendarRunner{
	public static void main(String... args){
		
		Months months1 = new Months("January");
		Calendar calendar1 = new Calender(25,months1,Weeks.SUNDAY);
		calendar1.printInfo();
		
		Months months2 = new Months("December");
		Calendar calendar2 = new Calender(20,months2,Weeks.WEDNESDAY);
		calendar2.printInfo();
		
		Months months3 = new Months("March");
		Weeks weeks1 = Weeks.THURSDAY;
		Calendar calendar3 = new Calender(25,months3,weeks1);
		calendar3.printInfo();
		
		Months months4 = new Months("May");
		Weeks weeks2 = Weeks.SATURDAY;
		Calendar calendar4 = new Calender(20,months4,weeks2);
		calendar4.printInfo();
	}
}