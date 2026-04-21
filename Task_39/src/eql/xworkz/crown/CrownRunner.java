package eql.xworkz.crown;

public class CrownRunner {
    public static void main(String[] args) {
        Crown crown =new Crown("Gold",3.2,4.3);

        QueenCrown queenCrown = new QueenCrown("Gold",3.2,4.3,33);

        CrownInfo crownInfo = new CrownInfo();
        crownInfo.crownInfo(queenCrown);

    }
}
