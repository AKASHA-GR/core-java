class IndianArmyRunner{
	public static void main(String[] args){
		
		IndianArmy indianArmy=new IndianArmy();
		System.out.println(indianArmy.numberOfSolder);
		System.out.println(indianArmy.name);
		System.out.println(indianArmy.numberOfGun);
		indianArmy.attack();
		indianArmy.defence();
		indianArmy.protect();
		System.out.println(indianArmy.numberOfBullets);
		System.out.println(indianArmy.priceOfGuns);
		System.out.println(indianArmy.numberOfJets);
		System.out.println(indianArmy.hadSubmerien);
		System.out.println(indianArmy.misilesName);
		System.out.println("");
			
		Army army=new IndianArmy();
		System.out.println(army.numberOfSolder);
		System.out.println(army.name);
		System.out.println(army.numberOfGun);
		army.attack();
		army.defence();
		System.out.println("");

		Army armys=new Army();
        System.out.println(armys.numberOfSolder);
		System.out.println(armys.name);
		System.out.println(armys.numberOfGun);
		armys.attack();
		armys.defence();
		System.out.println("");
	}
}