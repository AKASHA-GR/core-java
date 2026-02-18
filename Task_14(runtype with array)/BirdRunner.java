class BirdRunner{
	public static void main(String[] args){
		String Birds = Bird.getColorByName("Falcon");
		System.out.println("The color of the bird:" +Birds);
		System.out.println("");
		
		int lifesan = Bird.getLifespanByName("Eagle");
		System.out.println("The Lifesan of the bird:" +lifesan+ " years.");
	}
}