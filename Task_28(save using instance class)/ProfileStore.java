class ProfileStore{
	 Profile[] profile;
	 int curentIndex = 0;
	 
	 ProfileStore(Profile[] profile){
		 this.profile = profile;
	 }
	 
	 void save(Profile profile){
		 System.out.println("The save is exicuting on class profileStore.");
		 
		 int indexSize = this.profile.length -1;
		 System.out.println("The curent value is stored in index:"+this.curentIndex);
		 
		 if(profile != null && this.profile != null){
			 if(curentIndex <= indexSize){
				 this.profile[curentIndex] = profile;
				 profile.printInfo();
				 curentIndex++;
				 System.out.println("The next value is stored in index:"+this.curentIndex);
			 }
		 }
	 }
}