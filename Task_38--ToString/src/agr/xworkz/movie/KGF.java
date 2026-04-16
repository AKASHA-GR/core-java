package agr.xworkz.movie;

public class KGF extends Movie{
    double budget;
    double profit;

    public KGF(Name name, String releaseDate, Size size, double[] rating, boolean hasoskar, double budget, double profit) {
        super(name, releaseDate, size, rating, hasoskar);
        this.budget = budget;
        this.profit = profit;
    }

    @Override
    public void actorInfo() {
        super.actorInfo();
    }

    @Override
    public void movieInfo() {
        super.movieInfo();
    }

    @Override
    public String toString() {
        return "Budget:"+budget+",Profit:"+profit;
    }
}
