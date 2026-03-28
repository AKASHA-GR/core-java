class SwapTwoNumber{
	int a;
	int b;
	
	SwapTwoNumber(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	void swap(){
		System.out.println("Befor Swap:");
		System.out.println("a ="+this.a);
		System.out.println("b ="+this.b);
		
		this.a = this.a + this.b;
        this.b = this.a - this.b;
        this.a = this.a - this.b;
		
		System.out.println("After Swap:");
		System.out.println("a ="+this.a);
		System.out.println("b ="+this.b);
		
	}
	
	
}