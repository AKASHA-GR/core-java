class PrinterType{
	String type;
	double price;
	
	PrinterType(String type,double price){
		this.type = type;
		this.price = price;
	}
	
	void getPrinterType(){
		System.out.println("The Printer Type:"+this.type);
		System.out.println("The Printer Price:"+this.price);
	}
}