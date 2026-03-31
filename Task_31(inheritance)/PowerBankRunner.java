class PowerBankRunner{
	public static void main(String[] args){
		PowerBankChoice powerBankChoice = new PowerBankChoice();
		System.out.println(powerBankChoice.brand);
		System.out.println(powerBankChoice.price);
		System.out.println(powerBankChoice.model);
		System.out.println(powerBankChoice.weight);
		System.out.println(powerBankChoice.length);
		System.out.println(powerBankChoice.color);
		System.out.println(powerBankChoice.originCountry);
		System.out.println(powerBankChoice.totleGST);
		powerBankChoice.percentage();
		powerBankChoice.connnector();
		powerBankChoice.powerBank();
		
		PowerBank powerBank = new PowerBankChoice();
		System.out.println(powerBank.brand);
		System.out.println(powerBank.price);
		System.out.println(powerBank.model);
		powerBankChoice.percentage();
		powerBankChoice.connnector();
		
		
		PowerBank powerBanks = new powerBankChoice();
		System.out.println(powerBanks.brand);
		System.out.println(powerBanks.price);
		System.out.println(powerBanks.model);
		powerBanks.percentage();
		powerBanks.connnector();
		
	}
}