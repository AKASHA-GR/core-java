class PrinterRunner{
	public static void main(String... args){
		
		String[] brand = new String[3];
		brand[0] = "Epson";
		brand[1] = "Hp";
		brand[2] = "Canon";
		
		PrinterType printerType1 = new PrinterType("Color printer",21999.0);
		PrinterType printerType2 = new PrinterType("Laser printer",180000.0);
		PrinterType printerType3 = new PrinterType("Digital Inkjet",850000.0);
		
		PrinterType[] printerType  = new PrinterType[3];
		printerType[0] = printerType1;
		printerType[1] = printerType2;
		printerType[2] = printerType3;
		
		
		Printer printer = new Printer(brand,printerType);
		printer.display();
		
	}
}