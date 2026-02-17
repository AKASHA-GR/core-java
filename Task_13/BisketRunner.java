class BisketRunner{
	public static void main(String[] args){
		
		int cost = Bisket.getCost("Parla-G");
		System.out.println("The Cost:" +cost);
		
		String shap = Bisket.getShap("oreo");
		System.out.println("The Shap:" +shap);
		
		String name = "oreo";
		String[] flawour = Bisket.flavour(name);
		System.out.println("The List:" +flawour);
	}
}