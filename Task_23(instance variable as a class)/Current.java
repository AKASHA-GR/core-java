class Current{
	boolean currentReq;
	
	Current(boolean currentReq){
		this.currentReq = currentReq;
	}
	
	void getCurrent(){
		System.out.println("The current Required:"+this.currentReq);
	}
}