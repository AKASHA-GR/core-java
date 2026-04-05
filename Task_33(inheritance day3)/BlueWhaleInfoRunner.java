class BlueWhaleInfoRunner{
	public static void main(String[] args){
		BlueWhaleInfo blueWhaleInfo = new BlueWhaleInfo();
		System.out.println("The blueWhale age:"+blueWhaleInfo.age);
		System.out.println("The blueWhale location:"+blueWhaleInfo.location);
		System.out.println("It isDangerous:"+blueWhaleInfo.isDangerous);
		System.out.println("");
		
		BlueWhaleInfo blueWhaleInfo1 = new BlueWhaleInfo(22,"Pecific Ocean");
		System.out.println("The blueWhale age:"+blueWhaleInfo1.age);
		System.out.println("The blueWhale location:"+blueWhaleInfo1.location);
		System.out.println("It isDangerous:"+blueWhaleInfo1.isDangerous);
		System.out.println("");
		
		BlueWhaleInfo blueWhaleInfo2 = new BlueWhaleInfo(20,"India ocean",false);
		System.out.println("The blueWhale age:"+blueWhaleInfo2.age);
		System.out.println("The blueWhale location:"+blueWhaleInfo2.location);
		System.out.println("It isDangerous:"+blueWhaleInfo2.isDangerous);
		System.out.println("");
	}
}