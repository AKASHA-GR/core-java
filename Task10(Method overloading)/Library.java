class Library{
	
	static void book(String libraryName, String type){
	
	System.out.println("The Name of the library:" +libraryName);
	System.out.println("The Type of the library:" +type);
	
		if(libraryName == null){
			System.out.println("The Statement is invalid... Make sure the libraryName is not null");
			return;
		}
		
		if(type == null){
			System.out.println("The Statement is invalid... Make sure the typeis not null");
			return;
		}
	
	
    }
  
    static void book(int noOfBook,String location,int noOfStaff){
		
		System.out.println("The Totle Number of Books:" +noOfBook);
		System.out.println("The location of Library:" +location);
		System.out.println("The Totle number of Staffs:" +noOfStaff);
		
		
		if(noOfBook <=0){
			System.out.println("The Statement is invalid... make sure the noOfBook is not null");
			return;
		}
		
		if(location == null){
			System.out.println("The Statement is invalid... Make sure the location is not null");
			return;
		}
		
		if(noOfStaff <=0){
			System.out.println("The Statement is invalid... make sure the noOfStaff is not null");
			return;
		}
		
	}
	
	static void book(float rating){
		
		System.out.println("The Rating of library:" + rating);
		
		if(rating <=0){
			System.out.println("The Statement is invalid... make sure the rating is not null");
			return;
		}
	}
}