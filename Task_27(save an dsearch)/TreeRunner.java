class TreeRunner{
	public static void main(String[] args){
		String[] name = new String[10];
		Tree tree = new Tree(name);
		tree.save("Oak Tree");
		tree.save("Banyan Tree");
		tree.save("Neem Tree");
		tree.save("Mangrove Tree");
		tree.save("Giant Sequoia");
		tree.save("Flowering Cherry");
		tree.save("Gulmohar");
		tree.save("Rainbow Eucalyptus");
		tree.save("Maple Tree");
		tree.save("Ashoke Tree");
		
	
	boolean value = tree.search("Maple Tree");
	System.out.println("The tree name is there:"+value);
	}
}