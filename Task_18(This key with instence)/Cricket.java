//Declare Below classes, then declare instance variables as mentioned below. Declare one construtco.. to init all the instanve variables during creation. Create one instance for each class Bangle : 1 Anklet: 1 Coffee: 2 Ant : 3 Bucket: 5 Jacket : 5 Pocket: 3 Cricket: 20 Racket: 10 Helmet: 3 Blanket: 6 Bracelet: 20 Necklace: 20 ShoeLace: 10

class Cricket {
    String teamName;
    String playerName;
    int jerseyNumber;
    double runsScored;
    double ballFaced;
    int foursHit;
    int sixesHit;
    double strikeRate;
    double oversBowled;
    int runsConnected;
    int wicketsTaken;
    double economyRate;
    int catchestaken;
    int runOuts;
    String matchDate;
    String stadiumName;
    String tossWinner;
    String matchType;
    int totalScore;
    int extras;

    Cricket(String teamName, String playerName, int jerseyNumber,
            double runsScored, double ballFaced,
            int foursHit, int sixesHit,
            double strikeRate, double oversBowled,
            int runsConnected, int wicketsTaken,
            double economyRate, int catchestaken,
            int runOuts, String matchDate,
            String stadiumName, String tossWinner,
            String matchType, int totalScore, int extras) {

        this.teamName = teamName;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.runsScored = runsScored;
        this.ballFaced = ballFaced;
        this.foursHit = foursHit;
        this.sixesHit = sixesHit;
        this.strikeRate = strikeRate;
        this.oversBowled = oversBowled;
        this.runsConnected = runsConnected;
        this.wicketsTaken = wicketsTaken;
        this.economyRate = economyRate;
        this.catchestaken = catchestaken;
        this.runOuts = runOuts;
        this.matchDate = matchDate;
        this.stadiumName = stadiumName;
        this.tossWinner = tossWinner;
        this.matchType = matchType;
        this.totalScore = totalScore;
        this.extras = extras;
    }
}
