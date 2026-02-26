class RineRunner{
	public static void main(String[] args){
		
		Rine rine = new Rine();
		System.out.println("The rine season:" +rine.season);
		System.out.println("The rine location:" +rine.location);
		System.out.println("The rine duration:" +rine.duration);
		System.out.println("The rine with thunder:" +rine.thunder);
		System.out.println("The temparature of rine:" +rine.temperature);
		
		
		Rine rine1 = new Rine("Monsoon","Bengaluru",30,true,24.5);
		System.out.println("The rine season:" +rine1.season);
		System.out.println("The rine location:" +rine1.location);
		System.out.println("The rine duration:" +rine1.duration +"min");
		System.out.println("The rine with thunder:" +rine1.thunder);
		System.out.println("The temparature of rine:" +rine1.temperature);
		
		
		Rine rine2 = new Rine("Monsoon");
		System.out.println("The rine season:" +rine2.season);
		
		
		Rine rine3 = new Rine("Bengaluru",30);
		System.out.println("The rine location:" +rine3.location);
		System.out.println("The rine duration:" +rine3.duration);
		
		
		Rine rine4 = new Rine(true);
		System.out.println("The rine with thunder:" +rine4.thunder);
		
		
		Rine rine5 = new Rine(24.5);
		System.out.println("The rine temparature:" +rine5.temperature);		
	}
}