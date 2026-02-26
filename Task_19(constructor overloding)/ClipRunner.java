class ClipRunner{
	public static void main(String[] args){
		
		Clip clip = new Clip();
		System.out.println("The clip type:" +clip.type);
		System.out.println("The clip meterial:" +clip.meterial);
		System.out.println("The clip color:" +clip.color);
		System.out.println("The clip price:" +clip.price);
		System.out.println("The clip type:" +clip.type);
		
		
		Clip clip1 = new Clip("Hair Clip");
		System.out.println("The clip type:" +clip1.type);
		
		
		Clip clip2 = new Clip("plastic","Black");
		System.out.println("The clip meterial:" +clip2.meterial);
		System.out.println("The clip color:" +clip2.color);
		
		Clip clip3 = new Clip("Claw Clip","plastic","Black");
		System.out.println("The clip type:" +clip3.type);
		System.out.println("The clip meterial:" +clip3.meterial);
		System.out.println("The clip color:" +clip3.color);
		
		Clip clip4 = new Clip(20);
		System.out.println("The clip price:" +clip4.price);
		
		
		
		Clip clip5 = new Clip(4);
		System.out.println("The clip quantity:" +clip5.quantity);
		
		
	}
}