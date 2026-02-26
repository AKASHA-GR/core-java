class UmbrellaRunner{
	public static void main(String[] args){
		
		Umbrella umbrella = new Umbrella();
		System.out.println("The umbrella brand:" +umbrella.brand);
		System.out.println("The umbrella color:" +umbrella.color);
		System.out.println("The umbrella automatic:" +umbrella.automatic);
		System.out.println("The umbrella windproof:" +umbrella.windproof);
		System.out.println("The umbrella ribsCount:" +umbrella.ribsCount);
		
		
		Umbrella umbrella1 = new Umbrella("PopyUmb","Black",true,true,8);
        System.out.println("The umbrella brand:" +umbrella1.brand);
		System.out.println("The umbrella color:" +umbrella1.color);
		System.out.println("The umbrella automatic:" +umbrella1.automatic);
		System.out.println("The umbrella windproof:" +umbrella1.windproof);
		System.out.println("The umbrella ribsCount:" +umbrella1.ribsCount);
		
		
		Umbrella umbrella2 =new Umbrella("PopyUmb","Black");
		System.out.println("The umbrella brand:" +umbrella2.brand);
		System.out.println("The umbrella color:" +umbrella2.color);
		
		
		Umbrella umbrella3 = new Umbrella("Black",true);
		System.out.println("The umbrella color:" +umbrella.color);
		System.out.println("The umbrella automatic:" +umbrella.automatic);
		
		
		Umbrella umbrella4 = new Umbrella(true,true);
		System.out.println("The umbrella automatic:" +umbrella4.automatic);
		System.out.println("The umbrella windproof:" +umbrella4.windproof);
		
		Umbrella umbrella5 = new Umbrella(true,8);
		System.out.println("The Umbrella windproof:" +umbrella5.windproof);
		System.out.println("The Umbrella ribsCount:" +umbrella5.ribsCount);
	}
} 