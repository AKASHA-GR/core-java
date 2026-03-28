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
		
	System.out.println();
	
	boolean value = tree.search("Maple Tree");
	System.out.println("The tree name is there:"+value);
	
	
	System.out.println();

	tree.update(2, "Updated Neem Tree");

	System.out.println();

	boolean value1 = tree.update("Oak Tree", "Oak Tree Updated");
	System.out.println("Updated by name: " + value1);

	System.out.println();

	boolean value2 = tree.delete(4);
	System.out.println("Deleted by index: " + value2);

	System.out.println();

	boolean value3 = tree.delete("Gulmohar");
	System.out.println("Deleted by name: " + value3);
	}
}