class BatteryRunner{
	public static void main(String[] arge){
		
		Battery battery = new Battery();
		System.out.println("The battery brand:" +battery.brand);
		System.out.println("The battery chemistry:" +battery.chemistry);
		System.out.println("The battery voltage:" +battery.voltage);
		System.out.println("The battery capacitymAh:" +battery.capacitymAh);
		System.out.println("The battery rechargeble:" +battery.rechargeble);
		
		Battery battery1 = new Battery(Duracell);
		System.out.println("The battery brand:" +battery1.brand);
		
		
		Battery battery2 = new Battery("Alkaline",1.5);
		System.out.println("The battery chemistry:" +battery2.chemistry);
		System.out.println("The battery voltage:" +battery2.voltage);
		
		
		Battery battery3 = new Battery(2500);
		System.out.println("The battery capacitymAh:" +battery3.capacitymAh);
		
		
		Battery battery4 = new Battery(false);
		System.out.println("The battery rechargeble:" +battery4.rechargeble);
		
		
		Battery battery1 = new Battery(1.2,1000,true);
		System.out.println("The battery voltage:" +battery5.voltage);
		System.out.println("The battery capacitymAh:" +battery5.capacitymAh);
		System.out.println("The battery rechargeble:" +battery5.rechargeble);
		
	}
}