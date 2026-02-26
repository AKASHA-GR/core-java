class KeyBoardRunner{
	public static void main(String[] args){
		
		//01
		KeyBoard keyboard = new KeyBoard();
		
		System.out.println("The keyboard brand:" + keyboard.brand);
		System.out.println("The keyboard model:" + keyboard.model);
		System.out.println("The keyboard color:" + keyboard.color);
		System.out.println("The keyboard numberOfKeys:" + keyboard.numberOfKeys +"keys");
		System.out.println("The keyboard price:$" + keyboard.price);
		
		
		KeyBoard keyboard1 = new KeyBoard("Logitech");
		System.out.println("The keyboard brand:" +keyboard1.brand);
		
		
		KeyBoard keyboard2 = new KeyBoard("Logitech","K380s Pebble Key2");
		System.out.println("The keyboard brand:" +keyboard2.brand);
		System.out.println("The keyboard model:" +keyboard2.model);
		
		
		KeyBoard keyboard3 = new KeyBoard("K380s Pebble Key2",1299.0);
		System.out.println("The keyboard model:" +keyboard3.model);
		System.out.println("The keyboard price:" +keyboard3.price);
		
		
		KeyBoard keyboard4 = new KeyBoard("Tonal White",80);
		System.out.println("The keyboard color:" +keyboard4.color);
		System.out.println("The keyboard key numbers:" +keyboard4.numberOfKeys);
		
		
		KeyBoard keyboard5 = new KeyBoard(80,1299);
		System.out.println("The keyboard key numbers:" +keyboard5.numberOfKeys);
		System.out.println("The keyboard price:" + keyboard5.price);
		System.out.println("");
		
	}
}