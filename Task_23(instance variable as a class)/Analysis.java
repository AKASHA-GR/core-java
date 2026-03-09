class Analysis{
	String dataSetname;
	String size;
	
	Analysis(String dataSetname,String size){
		this.dataSetname = dataSetname;
		this.size = size;
	}
	
	void getAnalysis(){
		System.out.println("The dataSetname:"+this.dataSetname);
		System.out.println("The size:"+this.size);
	}
}