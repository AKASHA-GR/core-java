class CourtRunner{
	public static void main(String... args){
		
		Type type1 = new Type("Criminal.....");
		Court court1 = new Court(193,type1,State.KARNATAKA);
		court1.printInfo();
		
		Type type2 = new Type("Civil.....");
		Court court2 = new Court(131,type2,State.KERALA);
		court2.printInfo();
		
		Type type3 = new Type("Family.....");
		State state1 = State.TAMILNADU;
		Court court3 = new Court(1198,type3,state1);
		court3.printInfo();
		
		Type type4 = new Type("Civil.....");
		State state2 = State.ANDHRA;
		Court court4 = new Court(187,type4,state2);
		court4.printInfo();
	}
}