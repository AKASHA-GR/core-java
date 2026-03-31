class TimeClockRunner{
	public static void main(String[] args){
		TimeClock timeClock = new TimeClock();
		System.out.println(timeClock.brand);
		System.out.println(timeClock.price);
		System.out.println(timeClock.location);
		System.out.println(timeClock.brand);
		System.out.println(timeClock.brand);
		System.out.println(timeClock.brand);
		System.out.println(timeClock.brand);
		System.out.println(timeClock.brand);
		timeClock.hours();
		timeClock.time();
		timeClock.displayTime();
		
		Clock clock = new TimeClock();
		System.out.println(clock.brand);
		System.out.println(clock.price);
		System.out.println(clock.location);
		clock.hours();
		clock.time();
		
		Clock clocks = new Clock();
		System.out.println(clocks.brand);
		System.out.println(clocks.price);
		System.out.println(clocks.location);
		clocks.hours();
		clocks.time();
		
	}
}