class PawnRunner{
	public static void main(String[] args){
		
		Pawn pawn = new Pawn();
		System.out.println("The pieceName:" +pawn.pieceName);
		System.out.println("The position:" +pawn.position);
		System.out.println("The isFirstMove:" +pawn.isFirstMove);
		System.out.println("The isCaptured:" +pawn.isCaptured);
		System.out.println("The points:" +pawn.points);
		
		
		Pawn pawn1 = new Pawn("Pawn");
		System.out.println("The pieceName:" +pawn1.pieceName);
		
		
		Pawn pawn2 = new Pawn("E2",true);
		System.out.println("The position:" +pawn2.position);
		System.out.println("The isFirstMove:" +pawn2.isFirstMove);
		
		
		Pawn pawn3 = new Pawn(false);
		System.out.println("The isCaptured:" +pawn3.isCaptured);
		
		Pawn pawn4 = new Pawn(1);
		System.out.println("The points:" +pawn4.points);
		
		Pawn pawn5 = new Pawn("Pawn",true);
		System.out.println("The pieceName:" +pawn5.pieceName);
		System.out.println("The isCaptured:" +pawn5.isCaptured);
		System.out.println("The points:" +pawn5.points);
		
	}

}