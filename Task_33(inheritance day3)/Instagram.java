class Instagram extends Reel{
	
	Instagram(){
		super("Chaitra",108,110);
	}
	
	Instagram(String name,int likes,int views){
		super(name,likes,views);
	}
	
	Instagram(int likes,int views){
		super("Amrutra",likes,views);
	}
}