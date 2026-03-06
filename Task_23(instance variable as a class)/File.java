class File{
	String name;
	String location;
	String type;
	double size;
	boolean isopen;
	Extension extension;
	Create create;
	Modification modification;
	OpSystem opSystem;
	Folder folder;
	
	File(String name,String location,String type,double size,boolean isopen,Extension extension,Create create,Modification modification,OpSystem opSystem,Folder folder){
		this.name = name;
		this.location = location;
		this.type = type;
		this.size = size;
		this.isopen = isopen;
		this.extension = extension;
		this.create = create;
		this.modification = modification;
		this.opSystem = opSystem;
		this.folder = folder;
	}
	
	void getFile(){
		System.out.println("The name of file:"+this.name);
		System.out.println("The location of file:"+this.location);
		System.out.println("The type of file:"+this.type);
		System.out.println("The size of file:"+this.size);
		System.out.println("The isopen of file:"+this.isopen);
	}
}