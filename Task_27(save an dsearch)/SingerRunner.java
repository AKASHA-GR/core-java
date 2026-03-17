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
	}
}