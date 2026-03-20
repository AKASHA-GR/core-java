class SingerRunner{
	public static void main(String[] args){
		
		String[] name = new String[10];
		Singer singer = new Singer(name);
		singer.save("S.P. Balasubrahmanyam");
		singer.save("Sonu Nigam");
		singer.save("S.Janaki");
		singer.save("Shreya Ghoshal");
		singer.save("Rajesh Krishnan");
		singer.save("Vijay Prakash");
		singer.save("Chandan Shetty");
		singer.save("Anuradha Bhat");
		singer.save("KS Chithra");
		singer.save("Sanjith Hegde");
		
		System.out.println("");
		
		boolean value = singer.search("Vijay Prakash");
		System.out.println("The singer name is there:"+value);
		
		
        System.out.println();

        singer.update(3, "Updated Singer");

        System.out.println();

        boolean value1 = singer.update("Sonu Nigam", "Sonu Nigam Updated");
        System.out.println("Updated by name: " + value1);

        System.out.println();

        boolean value2 = singer.delete(6);
        System.out.println("Deleted by index: " + value2);

        System.out.println();

        boolean value3 = singer.delete("Rajesh Krishnan");
        System.out.println("Deleted by name: " + value3);
	}
}