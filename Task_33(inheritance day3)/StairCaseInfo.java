class StairCaseInfo extends StairCase{
	StairCaseInfo(){
		super("Straight Stairs",18,"wood");
	}
	
	StairCaseInfo(String type,int steps,String materials){
		super(type,steps,materials);
	}
	
	StairCaseInfo(int steps){
		super("U shape Stair",steps,"Iron");
	}
}