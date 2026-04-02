class ProgramsRunner{
	public static void main(String[] args){
		Programs programs = new Programs();
		System.out.println("The Stage type:"+programs.type);
		System.out.println("The Stage cost:"+programs.cost);
		System.out.println("The number of lights require:"+programs.numberOflights);
		System.out.println("");
		
		Programs programs1 = new Programs("Arena Stage",80000.0,127);
		System.out.println("The Stage type:"+programs1.type);
		System.out.println("The Stage cost:"+programs1.cost);
		System.out.println("The number of lights require:"+programs1.numberOflights);
		System.out.println("");
		
		Programs programs2 = new Programs(5500);
		System.out.println("The Stage Type:"+programs2.type);
		System.out.println("The Stage cost:"+programs2.cost);
		System.out.println("The number of lights require:"+programs2.numberOflights);
		
	}
}