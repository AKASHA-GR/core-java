class BaloonRunner{
	public static void main(String[] args){
		AirBaloon airBaloon = new AirBaloon();
		System.out.println(airBaloon.name);
		System.out.println(airBaloon.meterials);
		System.out.println(airBaloon.numberOfBaloon);
		System.out.println(airBaloon.color);
		System.out.println(airBaloon.price);
		System.out.println(airBaloon.quality);
		System.out.println(airBaloon.quantity);
		System.out.println(airBaloon.numberOfColor);
		airBaloon.fillair();
		airBaloon.persentage();
		airBaloon.color();
		
		Baloon baloon = new AirBaloon();
		System.out.println(baloon.name);
		System.out.println(baloon.meterials);
		System.out.println(baloon.numberOfBaloon);
		baloon.fillair();
		baloon.persentage();
		
		Baloon baloons = new Baloon();
		System.out.println(baloons.name);
		System.out.println(baloons.meterials);
		System.out.println(baloons.numberOfBaloon);
		baloons.fillair();
		baloons.persentage();
	}
}