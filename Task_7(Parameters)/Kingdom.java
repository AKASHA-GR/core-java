/*class Kingdom{ 

// invoke this 36 static void save(boolean king,String name,String kingdomName,String queenName,String princessName,int populationOfKingdom,String territory,int yearOfBirth,int yearOfDeath,int armySize,int yearsRuled) 
{
	//print all the argument's
 // validation 
 System.out.println("Kingdom Data is valid "); }
 */
 
 class Kingdom{
	 static void save(boolean king, String name, String kingdomName,Syring queenName, String princessName, int populationOfKingdom,String territory, int yearOfBirth,int yearOfDeath, int armySize, int yearsRuled){
		 
		 System.out.println("There is King in a kingdom:" +king+ "Name of the King:" +name+ "KingdomName:" +kingdomName+ 
		 "QueenName:" +queenName+ "Princess Names:" +princessName+ "Population Of Kingdom:" +populationOfKingdom+ "Territory:" +territory+ "Year of Birth:" +yearOfBirth+ "yearOfDeath:" +yearOfDeath+ "Army Size:" +armySize+
		 "Year Of Ruled:" +yearsRuled); 
		 
		 if(king == false){
			 System.out.println("There is no king in a kingdom, make sure king is not false");
			 return;
		 }
		 
		 if(populationOfKingdom == null){
			 Systm.out.println("The statement is invaled... make sure the population of kingdom is not null");
			 return;
		 }
		 
	 }
 }