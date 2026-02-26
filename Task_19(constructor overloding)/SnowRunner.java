class SnowRunner{
	public static void main(String[] args){
		
		Snow snow = new Snow();
		System.out.println("The snow season:" +snow.season);
		System.out.println("The snow type:" +snow.type);
		System.out.println("The snow snowfallCM:" +snow.snowfallCM);
		System.out.println("The snow temparature:" +snow.temparature);
		System.out.println("The snow duration:" +snow.duration);
		
		
		Snow snow1 = new Snow("Winter","Light snow",2.5,-1.5,40);
		System.out.println("The snow season:" +snow1.season);
		System.out.println("The snow type:" +snow1.type);
		System.out.println("The snow snowfallCM:" +snow1.snowfallCM);
		System.out.println("The snow temparature:" +snow1.temparature);
		System.out.println("The snow duration:" +snow1.duration +"min");

		
		
		Snow snow2 = new Snow("Winter");
		System.out.println("The snow season:" +snow2.season);
		
		
		Snow snow3 = new Snow("Moderate snow",3.7);
		System.out.println("The snow season:" +snow3.season);
		System.out.println("The snow snowfallCM:" +snow3.snowfallCM);
		
		
		Snow snow4 = new Snow(-3.3);
		System.out.println("The snow temparature:" +snow4.temparature);
		
		Snow snow5 = new Snow(80);
		System.out.println("The snow duration:" +snow5.duration);
	}
} 