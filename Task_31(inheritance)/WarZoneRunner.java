class WarZoneRunner{
	public static void main(String[] args){
		WarZone warZone = new WarZone();
		System.out.println(warZone.numberOfWar);
		System.out.println(warZone.year);
		System.out.println(warZone.date);
		warZone.destroed();
		warZone.defended();
		warZone.nation();
		System.out.println(warZone.numberOfOrganization);
		System.out.println(warZone.numberOfOrganization);
		System.out.println(warZone.time);
		System.out.println(warZone.spendAmount);
		System.out.println(warZone.totleLoss);
		
		War war = new WarZone();
		System.out.println(war.numberOfWar);
		System.out.println(war.year);
		System.out.println(war.date);
		war.destroed();
		war.defended();
		
		War wars = new War();
		System.out.println(wars.numberOfWar);
		System.out.println(wars.year);
		System.out.println(wars.date);
		wars.destroed();
		wars.defended();
		
	}
}