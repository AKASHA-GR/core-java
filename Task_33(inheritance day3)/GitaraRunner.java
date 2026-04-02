class GitaraRunner{
	public static void main(String[] args){
		Gitara gitara = new Gitara();
		System.out.println("Gitara Type:"+gitara.type);
		System.out.println("Gitara price:" +gitara.price);
		System.out.println("String quantity:"+gitara.quantity);
		System.out.println("");
		
		Gitara gitara1 = new Gitara(4000.0);
		System.out.println("Gitara Type:"+gitara1.type);
		System.out.println("Gitaran price:"+gitara1.price);
		System.out.println("String quantity:"+gitara1.quantity);
		System.out.println("");
		
		Gitara gitara2 = new Gitara(5800.0,4);
		System.out.println("Gitara Type:"+gitara2.type);
		System.out.println("Gitara price:"+gitara2.price);
		System.out.println("String quantity:"+gitara2.quantity);
	}
}