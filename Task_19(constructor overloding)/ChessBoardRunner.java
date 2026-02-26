class ChessBoardRunner{
	public static void main(String[] args){
		
		ChessBoard chessBoard = new ChessBoard();
		System.out.println("The chessBoard material:" +chessBoard.material);
		System.out.println("The chessBoard colorPattern:" +chessBoard.colorPattern);
		System.out.println("The chessBoard price:" +chessBoard.price);
		System.out.println("The chessBoard brardSize:" +chessBoard.boardSize);
		System.out.println("The chessBoard weightKG:" +chessBoard.weightKG);
		
		
		ChessBoard chessBoard1 = new ChessBoard("Wood");
		System.out.println("The chessBoard material:" +chessBoard1.material);
		
		ChessBoard chessBoard2 = new ChessBoard("Plastic","Black & white");
		System.out.println("The chessBoard material:" +chessBoard2.material);
		System.out.println("The chessBoard colorPattern:" +chessBoard2.colorPattern);
		
		ChessBoard chessBoard3 = new ChessBoard(2999);
		System.out.println("The chessBoard price:" +chessBoard3.price);
		
		ChessBoard chessBoard4 = new ChessBoard(8);
		System.out.println("The chessBoard brardSize:" +chessBoard4.boardSize);
		
		ChessBoard chessBoard5 = new ChessBoard("Wood",1.8);
		System.out.println("The chessBoard material:" +chessBoard1.material);
		System.out.println("The chessBoard weightKG:" +chessBoard5.weightKG);
	}
}