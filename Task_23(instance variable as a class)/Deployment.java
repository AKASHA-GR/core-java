class Deployment{
	String websitename;
	
	Deployment(String websitename){
		this.websitename = websitename;
	}
	
	void getDeployment(){
		System.out.println("The deployed websitename:" +this.websitename);
	}
}