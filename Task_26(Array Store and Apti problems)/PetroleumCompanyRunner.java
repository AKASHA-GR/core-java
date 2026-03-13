class PetroleumCompanyRunner{
	
	public static void main(String[] args){
	
	String[] names = new String[5];
	PetroleumCompany petroleumCompany = new PetroleumCompany(names);
	System.out.println("");
	
	petroleumCompany.save("Indian Oil Corporation");
	petroleumCompany.save("Bharat Petroleum");
	petroleumCompany.save("Hindustan Petroleum");
	petroleumCompany.save("Oil and Natural Gas Corporation");
	petroleumCompany.save("Reliance Industries");
}
}