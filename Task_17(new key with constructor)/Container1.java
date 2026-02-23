class Container1{
	public static void main(String[] args){
		
		cont("Akaza",20, 78, 3);

		
	}
	
	static void cont(String name,int age,int marks, int day){
		
		
		if(name == "Akaza"){
		System.out.println("my name is" +name);
		}
		
		
		
		if(age >= 18){
			System.out.println("i am 18, i got a voting rights.");
		}else{
			System.out.println("i am not 18, i do not have voting rights.");
		}
		


        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }



        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }	
	
}