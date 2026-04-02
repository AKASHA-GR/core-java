class InstagramRunner{
	public static void main(String[] args){
		Instagram instagram = new Instagram();
		System.out.println("The reel owner:"+instagram.name);
		System.out.println("The number of likes:"+instagram.likes);
		System.out.println("The number  of views:"+instagram.views);
		System.out.println("");
		
		Instagram instagram1 = new Instagram("Priya",180,200);
		System.out.println("The reel owner:"+instagram1.name);
		System.out.println("The number of likes:"+instagram1.likes);
		System.out.println("The number  of views:"+instagram1.views);
		System.out.println("");
		
		Instagram instagram2 = new Instagram(210,380);
		System.out.println("The reel owner:"+instagram2.name);
		System.out.println("The number of likes:"+instagram2.likes);
		System.out.println("The number  of views:"+instagram2.views);
		System.out.println("");
	}
}