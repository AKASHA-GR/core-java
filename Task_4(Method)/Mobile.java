//1.Declare a Mobile class , declare 10 static methods . Print message inside each method. Invoke these 10 methods from main method

class Mobile{
	
	//01
	static void call(){
		System.out.println("Calling from Mobile");
	}
	//02
	static void message(){
		System.out.println("Sending a massage");
	}
	//03
	static void blutooth(){
		System.out.println("Turnon the blutooth");
	}
	//04
	static void music(){
		System.out.println("Play a music");
	}
	//05
	static void camara(){
		System.out.println("Opening a camara");
	}
	//06
	static void wifi(){
		System.out.println("Turnoff a wifi");
	}
	//07
	static void gps(){
		System.out.println("Oparating gps");
	}
	//08
	static void calculator(){
		System.out.println("Performing Arthematic Oparations");
	}
	//09
	static void brows(){
		System.out.println("Serching on internet");
	}
	//10
	static void play(){
		System.out.println("plaing games");
	}
	
	
	public static void main(String[] args){
	System.out.println("Fetures of mobile:");
	Mobile.call();
	Mobile.message();
	Mobile.blutooth();
	Mobile.music();
	Mobile.camara();
	Mobile.wifi();
	Mobile.gps();
	Mobile.calculator();
	Mobile.brows();
	Mobile.play();
	
  }
}