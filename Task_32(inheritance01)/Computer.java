class Computer{
	void install(Browser ninMakka){
		System.out.println("The chrom browser is instaling.....");
		ninMakka.open();
		
		if(ninMakka instanceof ChromBrowser){
			ChromBrowser chrom = (ChromBrowser)ninMakka;
			chrom.fastOpen();
		}
		
		if(ninMakka instanceof MobileChromBrowser){
			MobileChromBrowser mobilChrom = (MobileChromBrowser)ninMakka;
			mobilChrom.offline();
		}
	}
}