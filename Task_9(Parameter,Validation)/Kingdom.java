/*class Kingdom{ 

// invoke this 36 static void save(boolean king,String name,String kingdomName,String queenName,String princessName,int populationOfKingdom,String territory,int yearOfBirth,int yearOfDeath,int armySize,int yearsRuled) 
{
	//print all the argument's
 // validation 
 System.out.println("Kingdom Data is valid "); }
 */
 
 class Kingdom{
	 static void save(boolean king, String name, String kingdomName,String queenName, String princessName, int populationOfKingdom,String territory, int yearOfBirth,int yearOfDeath, int armySize, int yearsRuled){
		 
		 System.out.println("There is King in a kingdom:" +king+ "\n" +
		 "Name of the King:" +name+ "\n" + 
		 "KingdomName:" +kingdomName+ "\n" + 
		 "QueenName:" +queenName+ "\n" + 
		 "Princess Names:" +princessName+ "\n" +
		 "Population Of Kingdom:" +populationOfKingdom+ "\n" + 
		 "Territory:" +territory+ "\n" + 
		 "Year of Birth:" +yearOfBirth+ "\n" + 
		 "yearOfDeath:" +yearOfDeath+ "\n" +
		 "Army Size:" +armySize+ "\n" +
		 "Year Of Ruled:" +yearsRuled); 
		 System.out.println("");
		 
		 if(king == false){
			 System.out.println("There is no king in a kingdom, make sure king is not false");
			 return;
		 }
		 
		 
		 if(kingdomName == null){
			 System.out.println("There was not declared Kingdom Name make sure kingdomName is not null!");
			 System.out.println("----------------------------");
			 return;
			 
		 }
		 
		 
		 if(populationOfKingdom <=0){
			 System.out.println("The statement is invalid... make sure the population of kingdom is not Zero");
			 System.out.println("----------------------------");
			 return;
		 }
		 
		 
		 if(queenName == null){
			 System.out.println("There was not declared a Queen Name, make sure the Queen name is not null! ");
			 princessName = "No";
			 System.out.println("----------------------------");
			 return;
		 }
		 
		 
		 if(princessName == null){
			 System.out.println("There was not declared a princessName, make sure the princessName is not null! ");
			 System.out.println("----------------------------");
		 }
		 
		 if(territory == null){
			 System.out.println("The statement is invalid.... Make sure the territory is not null!");
			 System.out.println("----------------------------");
			 return;
		 }
		 
		 if(yearOfBirth <= 0){
			 System.out.println("The statement is invalid.... make sure the yearOfBirth is not zero");
			 System.out.println("----------------------------");
			 return;
		}
		
		
		 if(yearOfDeath <= 0){
			 System.out.println("The statement is invalid.... make sure the yearOfDeath is not zero");
			 System.out.println("----------------------------");
			 return;
		}
		
		
	    if(armySize <=0){
			System.out.println("The statement is invalid.... make sure the armySize is not Zero");
			System.out.println("----------------------------");
		}
		
		if(yearsRuled <=0){
			System.out.println("The statement is invalid.... make sure the yearsRuled is not Zero");
			System.out.println("----------------------------");
		}
		
		 
	 }
	 
	 
	// invoke this 40 static void saveArmy(int noOfSoldiers,int noOfElephants,int noOfHorses,String type,int noOfWeapons,String commanderName,boolean commanderMarried,String commanderWifeName,boolean commanderIsFather,String commanderChildName,int commanderExperience) { } 
	
	static void saveArmy(int noOfSoldiers,int noOfElephants,int noOfHorses,String type,int noOfWeapons,String commanderName,boolean commanderMarried,String commanderWifeName,boolean commanderIsFather,String commanderChildName,int commanderExperience){

	    System.out.println("");
	    System.out.println("");
		System.out.println("The number of Soldiers:" + noOfSoldiers);
		System.out.println("The number of Elephants:" + noOfElephants);
		System.out.println("The number of Horses:" + noOfHorses);
		System.out.println("The Type of soldiers:" + type);
		System.out.println("The number of Weapons:" + noOfWeapons);
		System.out.println("The Commander Name:" + commanderName);
		System.out.println("The CommanderMarried:" + commanderMarried);
		System.out.println("The Commander WifeName:" + commanderWifeName);
		System.out.println("The commanderisFather:" + commanderIsFather);
		System.out.println("The commander ChildName:" + commanderChildName);
		System.out.println("The commander Experience:" + commanderExperience);
		
		if(noOfSoldiers <=0){
			System.out.println("The statement is invalid.... make sure the noOfSoldiers is not Zero");
			System.out.println("----------------------------");
			return;
		}
		
		
		if(noOfElephants <=0){
			System.out.println("The statement is invalid.... make sure the noOfElephants is not Zero");
			System.out.println("----------------------------");
			return;
		}
		
		if(noOfHorses <=0){
			System.out.println("The statement is invalid.... make sure the noOfHorses is not Zero");
			System.out.println("----------------------------");
			return;
		}
		
		if(type ==null){
			System.out.println("The statement is invalid.... make sure the type is not null!");
			System.out.println("----------------------------");
			return;
		}
		
		if(noOfWeapons <=0){
			System.out.println("The statement is invalid.... make sure the noOfWeapons is not Zero");
			System.out.println("----------------------------");
			return;
		}
		
		if(commanderName == null){
			System.out.println("The statement is invalid.... make sure the commanderName is not null!");
			System.out.println("----------------------------");
			return;
		}
		
		if(commanderMarried == false){
				 System.out.println("There is no commanderMarried in a kingdom, make sure commanderMarried is not false");
				 System.out.println("----------------------------");
				 return;
		}
		
		if(commanderWifeName == null){
			System.out.println("The statement is invalid.... make sure the commanderWifeName is not null!");
			System.out.println("----------------------------");
			return;
		}
		
		if(commanderIsFather == false){
				 System.out.println("There is no commanderIsFather in a kingdom, make sure commanderIsFather is not false");
				 System.out.println("----------------------------");
				 return;
		}
		
		if(commanderChildName == null){
			System.out.println("The statement is invalid.... make sure the commanderChildName is not null!");
			System.out.println("----------------------------");
			return;
		}
		
		if(commanderExperience <=0){
			System.out.println("The statement is invalid.... make sure the commanderExperience is not null!");
			System.out.println("----------------------------");
			return;
		} 
	}
	
 }