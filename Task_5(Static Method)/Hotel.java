/*1. Declare Hotel class, write methods to store and print 
 a.storeUtensils 
 b. storeStaffs
 c. storeHotelInfo 
 d. storeMenu
 */
 
class Hotel{
	static void storeUtensils(){
		//declare variables
		String utensilsName="Plates";
		System.out.println("1.utensilsName:" + utensilsName);
		
		utensilsName="Spoons";
		System.out.println("2.utensilsName:" + utensilsName);
		
		utensilsName="Glasses";
		System.out.println("3.utensilsName:" + utensilsName);
		
		utensilsName="Knives";
		System.out.println("4.utensilsName:" + utensilsName);
		
		utensilsName="Bowls";
		System.out.println("5.utensilsName:" + utensilsName);
		
	}
	
	static void storeStaffs(){
		//declare a Variable
		String staffsName="Manager";
		System.out.println("1.staffsName:" + staffsName);
		
		staffsName="Chef";
		System.out.println("2.staffsName:" + staffsName);
		
		staffsName="Waiter";
		System.out.println("3.staffsName:" + staffsName);
		
		staffsName="Cleaner";
		System.out.println("4.staffsName:" + staffsName);
		
		staffsName="Security";
		System.out.println("5.staffsName:" + staffsName);
	}
	
	static void storeHotelInfo(){
		//declare a variables
		String hotelName="Mandya Hotel";
		System.out.println("1.Hotel Name:" + hotelName);
		
		String hotelLocation="Bengaluru";
		System.out.println("2.hotelLocation:" + hotelLocation);
		
		String hotelOwnerName="Akasha G R";
		System.out.println("3.HotelOner Name:" + hotelOwnerName);
		
		String hotelEmailId="akashmlk@gmail.com";
		System.out.println("5.Hotel EmailID:" + hotelEmailId);
		
		String hotelRoomType="Single,double,Deluxe,Suite";
		System.out.println("6.Hotel Roomtype:" + hotelRoomType);
		
		String hotelCheckInTime="start at when you want";
		System.out.println("7.Hotel Check in time:" + hotelCheckInTime);
		
		String hotelCheckOutTime="Aftter 24 hourse or How many Days you are bocked";
		System.out.println("8.Hotel CheckOutTime:" + hotelCheckOutTime);
		
		String hotelRating="9.Coustomer Openion";
		System.out.println("9.Hotel Rating:" + hotelRating);
		
		int hotelNumberOfRooms=25;
		System.out.println("10.Numberof roooms:" + hotelNumberOfRooms);
		
		long hotelContactNumber=9353220519l;
		System.out.println("4.Hotel Contact Number:" + hotelContactNumber);
	}
	
	static void storeMenu(){
		//declare a variables
		String hotelMenu="Idli";
		System.out.println("Hotel Menu:");
		System.out.println("1." + hotelMenu);
		
		hotelMenu="Dosa";
		System.out.println("2." + hotelMenu);
		
		hotelMenu="Vada";
		System.out.println("3." + hotelMenu);
		
		hotelMenu="Poori";
		System.out.println("4." + hotelMenu);
		
		hotelMenu="Veg Meals";
		System.out.println("5." + hotelMenu);
		
		hotelMenu="Fried Rice";
		System.out.println("6." + hotelMenu);
		
		hotelMenu="Paneer Butter Masala";
		System.out.println("7." + hotelMenu);
		
		hotelMenu="Chicken Biriyani";
		System.out.println("8." + hotelMenu);
		
		hotelMenu="Tea";
		System.out.println("9." + hotelMenu);
		
		hotelMenu="Coffee";
		System.out.println("10." + hotelMenu);
	}
}