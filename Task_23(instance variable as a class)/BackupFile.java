class BackupFile{
	String name;
	String type;
	
	BackupFile(String name,String type){
		this.name = name;
		this.type = type;
	}
	
	void getBackupFile(){
		System.out.println("The file name:"+this.name);
		System.out.println("The type name:"+this.type);
	}
}