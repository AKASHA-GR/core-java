class Cloud{
	String name;
	String model;
	String storage;
	double price;
	String dataBase;
	BackupFile backupFile;
	CloudType cloudType;
	Analysis analysis;
	Deployment deployment;
	StorePlace storePlace;
	
	
	Cloud(String name,String model,String storage,double price,String dataBase,BackupFile backupFile,CloudType cloudType,Analysis analysis,Deployment deployment,StorePlace storePlace){
		this.name = name;
		this.model = model;
		this.storage = storage;
		this.price = price;
		this.dataBase = dataBase;
		this.backupFile = backupFile;
		this.cloudType = cloudType;
		this.analysis = analysis;
		this.deployment = deployment;
		this.storePlace = storePlace;
	}
	
	void getCloud(){
		System.out.println("The name of the company:" +this.name);
		System.out.println("The model of the company:" +this.model);
		System.out.println("The storage of the company:" +this.storage);
		System.out.println("The price of the company:" +this.price);
		System.out.println("The dataBase of the company:" +this.dataBase);
		
		
		if(this.backupFile != null){
			this.backupFile.getBackupFile();
		}else{
			System.out.println("The backupFile is not defined...");
		}
		
		if(this.cloudType != null){
			this.cloudType.getCloudType();
		}else{
			System.out.println("The cloudType is not defined...");
		}
		
		if(this.analysis != null){
			this.analysis.getAnalysis();
		}else{
			System.out.println("The analysis is not defined...");
		}
		
		if(this.deployment != null){
			this.deployment.getDeployment();
		}else{
			System.out.println("The deployment is not defined...");
		}
		
		if(this.storePlace != null){
			this.storePlace.getStoreplace();
		}else{
			System.out.println("The storePlace is not defined...");
		}
	}
	
}