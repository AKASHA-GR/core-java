class UnivercityRunner{
	public static void main(String[] args){
		
		String name = "Global Academy of Engineering";
		String[] course = Univercity.getCoursesByCollegeName(name);
		//System.out.println("The College Courses list" +course);
		System.out.println("The College Courses list:");
		if(name!= null){
			for(int index=0;index<course.length;index++){
			    System.out.println("  >>> " +course[index]);
		}
		}else{
			System.out.println("The name is not defined.");
		}
		
	}
}