class ButterInfoRunner{
	public static void main(String[] args){
		ButterInfo butterInfo = new ButterInfo();
		System.out.println("The Butter quantity in grams:"+butterInfo.quantity);
		System.out.println("The butter Price:"+butterInfo.price);
		System.out.println("The brand:"+butterInfo.brand);
		System.out.println();
		
		ButterInfo butterInfo1 = new ButterInfo(1.0,1800,"Pathanjali");
		System.out.println("The Butter quantity in grams:"+butterInfo1.quantity);
		System.out.println("The butter Price:"+butterInfo1.price);
		System.out.println("The brand:"+butterInfo1.brand);
		System.out.println();
		
		ButterInfo butterInfo2 = new ButterInfo(800,"GRB");
		System.out.println("The Butter quantity in grams:"+butterInfo2.quantity);
		System.out.println("The butter Price:"+butterInfo2.price);
		System.out.println("The brand:"+butterInfo2.brand);
		System.out.println();
	}
}