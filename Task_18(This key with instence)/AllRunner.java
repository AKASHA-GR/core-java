class AllRunner{
	public static void main(String[] args){
		//1
		Bangle bangle = new Bangle("Kangan");
		System.out.println("The name of the Bangle:" +bangle.name);
		System.out.println("");
		
		//2
		Anklet anklet = new Anklet("Ghungroo");
		System.out.println("The name of the Anklet:" +anklet.typeName);
		System.out.println("");
		
		//3
		Ant ant = new Ant("Carpenter Ant","Black",7);
		System.out.println("The Ant name:" +ant.type);
		System.out.println("The color of Ant:" +ant.color);
		System.out.println("The Ant lifeSpane:" +ant.lifeSpane);
		System.out.println("");
		
		//4
		Coffee coffee = new Coffee("Arobica Roasted Coffee Beans", 820);
		System.out.println("The name of the Coffee:" +coffee.name);
		System.out.println("The price of the Coffee:$" +coffee.price);
		System.out.println("");
		
		//5
		Bucket bucket = new Bucket("Standerd", "Plastic", "Blue" ,25,145);
		System.out.println("The Type of the Bucket:" +bucket.type);
		System.out.println("The meterial of the Bucket" +bucket.meterial);
		System.out.println("The color of a meterial" +bucket.color);
		System.out.println("The capacity of a Bucket: " +bucket.capacity +"L");
		System.out.println("The price of the Bucket:" +bucket.price);
		System.out.println("");
		
		//6
		Jacket jacket = new Jacket("Adidas","Essentials",6999, 3, true);
		
		System.out.println("---- jacket Details ----");
		System.out.println("The brand name of a jacket:" +jacket.brand);
		System.out.println("The model name of a jacket:" +jacket.model);
		System.out.println("The price name of a jacket:" +jacket.price);
		System.out.println("The number of pokets in jacket:" +jacket.pockets);
		System.out.println("The brand name of a jacket:" +jacket.hadZipper);
		System.out.println("");

		//7
		Pocket pocket = new Pocket("Set-in Pockets",true,false);
		
		System.out.println("---- pocket Details ----");
		System.out.println("The type of the pocket:" +pocket.type);
		System.out.println("The pocket had Button:" +pocket.hadButton);
		System.out.println("The pocket had Zipper:" +pocket.hadZippers);
		System.out.println("");

		//8
		Cricket cricket = new Cricket(
            "India", "Virat Kohli", 18,
            60.0, 45.0,
            8, 2,
            141.6, 4.0,
            32, 3,
            8.0, 1,
            0, "25-02-2006",
            "M. Chinnaswamy Stadium",
            "India", "T20",
            180, 12
        );

		System.out.println("---- cricket Details ----");
        System.out.println("Team Name: " + cricket.teamName);
        System.out.println("Player Name: " + cricket.playerName);
        System.out.println("Jersey Number: " + cricket.jerseyNumber);
        System.out.println("Runs Scored: " + cricket.runsScored);
        System.out.println("Balls Faced: " + cricket.ballFaced);
        System.out.println("Fours: " + cricket.foursHit);
        System.out.println("Sixes: " + cricket.sixesHit);
        System.out.println("Strike Rate: " + cricket.strikeRate);
        System.out.println("Overs Bowled: " + cricket.oversBowled);
        System.out.println("Runs Conceded: " + cricket.runsConnected);
        System.out.println("Wickets: " + cricket.wicketsTaken);
        System.out.println("Economy: " + cricket.economyRate);
        System.out.println("Catches: " + cricket.catchestaken);
        System.out.println("Run Outs: " + cricket.runOuts);
        System.out.println("Match Date: " + cricket.matchDate);
        System.out.println("Stadium: " + cricket.stadiumName);
        System.out.println("Toss Winner: " + cricket.tossWinner);
        System.out.println("Match Type: " + cricket.matchType);
        System.out.println("Total Score: " + cricket.totalScore);
        System.out.println("Extras: " + cricket.extras);
		System.out.println("");
		
		//9
		Racket racket = new Racket(
		"yonex",
		"Astrox 99",
		"Bandminton",
		85.0,
		67.5,
		"G4",
		"Nylon",
		95.0,
		8999.0,
		"Black"
		);
		
		System.out.println("---- racket Details ----");
		System.out.println("The brand:" +racket.brand);
		System.out.println("The model:" +racket.model);
		System.out.println("The Sport Type:" +racket.sportType);
		System.out.println("The weight:" +racket.weight);
		System.out.println("The length:" +racket.length);
		System.out.println("The gripSize:" +racket.gripSize);
		System.out.println("The stringType:" +racket.stringType);
		System.out.println("The headSize:" +racket.headSize);
		System.out.println("The price:" +racket.price);
		System.out.println("The color:" +racket.color);
		System.out.println("");
		
		
		
		
		//10
		Helmet helmet = new Helmet("vega","Full Face",true);
		
		System.out.println("---- helmet Details ----");
		System.out.println("The brand of helmet:" +helmet.brand);
		System.out.println("The type of helmet:" +helmet.type);
		System.out.println("Is impactResistance:" +helmet.impactResistance);
		System.out.println("");
		
		
		
		//11
		Blanket blanket = new Blanket("Sleepwell","Cotton","Queen","Blue",1999.0,2.5);
		
		System.out.println("---- blanket Details ----");
		System.out.println("The Blanket brand:" +blanket.brand);
		System.out.println("The Blanket material:" +blanket.meterial);
		System.out.println("The Blanket Size:" +blanket.size);
		System.out.println("The Blanket Color:" +blanket.color);
		System.out.println("The blanket price:" +blanket.price);
		System.out.println("The blanket weight:" +blanket.weight);
		System.out.println("");
		
		
		
		//12
		Bracelet bracelet = new Bracelet("Tanishq","Gold","Yellow",25000.0,15.5,"Medium","Charm",true,"Floral","Hook","Diamond",5,true,"India","Round",18.0,2.0,"Polished",false,"1 year");
		
        System.out.println("---- bracelet Details ----");		
	    System.out.println("Brand of bracelet: " + bracelet.brand);
        System.out.println("Material of bracelet: " + bracelet.material);
        System.out.println("Color of bracelet: " + bracelet.color);
        System.out.println("Price of bracelet: " + bracelet.price);
        System.out.println("Weight of bracelet: " + bracelet.weight);
        System.out.println("Size of bracelet: " + bracelet.size);
        System.out.println("Type of bracelet: " + bracelet.type);
        System.out.println("Adjustable of bracelet: " + bracelet.adjustable);
        System.out.println("Design of bracelet: " + bracelet.design);
        System.out.println("Clasp Type of bracelet: " + bracelet.claspType);
        System.out.println("Stone Type of bracelet: " + bracelet.stoneType);
        System.out.println("Stone Count of bracelet: " + bracelet.stoneCount);
        System.out.println("Gold Plated of bracelet: " + bracelet.isGoldPlated);
        System.out.println("Origin Country bracelet: " + bracelet.originCountry);
        System.out.println("Shape of bracelet: " + bracelet.shape);
        System.out.println("Length of bracelet: " + bracelet.length);
        System.out.println("Width of bracelet: " + bracelet.width);
        System.out.println("Finish of bracelet: " + bracelet.finish);
        System.out.println("Waterpro of bracelet: " + bracelet.waterproof);
        System.out.println("Warranty of bracelet: " + bracelet.warranty);
		System.out.println("");
		
		//13
        Necklace necklace = new Necklace(
                "Malabar", "Gold", "Yellow", 55000.0, 25.5,
                "Long", "Temple", true, "Hook",
                "Ruby", 10, true, "India",
                "Round", 22.0, 3.0, "Polished",
                false, "2 Years", "Wedding"
        );

        System.out.println("---- Necklace Details ----");
        System.out.println("Brand: " + necklace.brand);
        System.out.println("Material: " + necklace.material);
        System.out.println("Color: " + necklace.color);
        System.out.println("Price: " + necklace.price);
        System.out.println("Weight: " + necklace.weight);
        System.out.println("Length Type: " + necklace.lengthType);
        System.out.println("Design: " + necklace.design);
        System.out.println("Adjustable: " + necklace.adjustable);
        System.out.println("Clasp Type: " + necklace.claspType);
        System.out.println("Stone Type: " + necklace.stoneType);
        System.out.println("Stone Count: " + necklace.stoneCount);
        System.out.println("Gold Plated: " + necklace.isGoldPlated);
        System.out.println("Origin Country: " + necklace.originCountry);
        System.out.println("Shape: " + necklace.shape);
        System.out.println("Length: " + necklace.length);
        System.out.println("Width: " + necklace.width);
        System.out.println("Finish: " + necklace.finish);
        System.out.println("Waterproof: " + necklace.waterproof);
        System.out.println("Warranty: " + necklace.warranty);
        System.out.println("Occasion: " + necklace.occasion);

        System.out.println("\n");

		//14
		ShoeLace lace = new ShoeLace(
                "Nike", "Cotton", "Black", 120.0,
                199.0, false, "Plain",
                "Sports", false, "Vietnam"
        );

        System.out.println("---- ShoeLace Details ----");
        System.out.println("Brand: " + lace.brand);
        System.out.println("Material: " + lace.material);
        System.out.println("Color: " + lace.color);
        System.out.println("Length: " + lace.length);
        System.out.println("Price: " + lace.price);
        System.out.println("Elastic: " + lace.elastic);
        System.out.println("Pattern: " + lace.pattern);
        System.out.println("Shoe Type: " + lace.shoeType);
        System.out.println("Waterproof: " + lace.waterproof);
        System.out.println("Origin Country: " + lace.originCountry);

	}
} 