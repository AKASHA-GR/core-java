package eql.xworkz.crown;

public class CrownInfo {
    public void crownInfo(Crown crown){
        System.out.println(crown.weight);
        System.out.println(crown.height);
        System.out.println(crown.material);

        if(crown instanceof QueenCrown){
            QueenCrown queenCrown = (QueenCrown) crown;
            System.out.println(queenCrown.numberOfDiamond);
        }



    }
}
