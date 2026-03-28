class GenderRunner{
	public static void main(String[] args){
		
		String[] genders = new String[3];
		Gender gender = new Gender(genders);
		gender.store("Male");
		gender.store("Female");
		gender.store("Transgender");
		
		
		System.out.println("Befor Sorting:");
		gender.display();
		System.out.println("");
		
		gender.sortAsc();
		System.out.println("");
		
		System.out.println("After Sorting in Asending Order:");
        gender.display();
		System.out.println("");
		
		gender.sortDesc();
		System.out.println("");
		
		System.out.println("After Sorting in Desending Order:");
        gender.display();
	}
}