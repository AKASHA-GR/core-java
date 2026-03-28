class MapRunner{
	public static void main(String[] args){
		Map[] maps = new Map[10];
		MapStore mapstore = new MapStore(maps);
		
		Map map = new Map("BTM",30,103,false,5,1);
		mapstore.save(map);
		
		System.out.println("");
		
		Map map1 = new Map("Molakalmuru",12,70,true,3,0);
		mapstore.save(map1);
		
		System.out.println("");
		
		Map map2 = new Map("chitradurga",80,120,true,8,2);
		mapstore.save(map2);
		
		System.out.println("");
		
		Map map3 = new Map("davanagere",98,130,true,7,4);
		mapstore.save(map3);
		
		System.out.println("");
		
		Map map4 = new Map("Shivamoga",70,90,true,6,6);
		mapstore.save(map4);
		
		System.out.println("");
		
		Map map5 = new Map("Tumakur",130,110,true,10,3);
		mapstore.save(map5);
		
		System.out.println("");
		
		Map map6 = new Map("Hasan",40,38,true,8,5);
		mapstore.save(map6);
		
		System.out.println("");
		
		Map map7 = new Map("Mysure",180,130,true,20,4);
		mapstore.save(map7);
		
		System.out.println("");
		
		Map map8 = new Map("Mandya",68,40,true,9,3);
		mapstore.save(map8);
		
		System.out.println("");
		
		Map map9 = new Map("Badami",30,40,true,8,2);
		mapstore.save(map9);
	}

}

