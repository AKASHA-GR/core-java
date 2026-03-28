class Printer{
	String[] brand;
	PrinterType[] printerType;
	
	Printer(String[] brand,PrinterType[] printerType){
		this.brand = brand;
		this.printerType = printerType;
	}
	
	void display(){
		System.out.println("The getPrinter method is exicuting in class printer.");
		
		if(this.brand != null){
			System.out.println("The totle number of printer:"+this.brand.length);
			for(String brand:this.brand){
				System.out.println("The brand of an Printer:"+brand);
			}
			}else{
				System.out.println("The brand is null.");
		}
		
		if(this.printerType != null){
			System.out.println("The totle number of printreType:"+this.printerType.length);
			for(PrinterType printerType:this.printerType){
				printerType.getPrinterType();
			}
			}else{
				System.out.println("The printreType is null.");
		}
	}
}