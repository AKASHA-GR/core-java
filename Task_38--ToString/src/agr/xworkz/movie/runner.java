package agr.xworkz.movie;

public class runner {
    public static void main(String[] args) {
        Name name = new Name("KGF");
        double[] rating = {6.7,7.8,8.8,8.9,9.5,9.9};

        Movie movie = new Movie(name,"21-12-2018",Size.GB,rating,false);
        System.out.println(movie.toString());
        movie.actorInfo();
        movie.movieInfo();
        System.out.println();

        KGF kgf = new KGF(name,"21-12-2018",Size.GB,rating,false,60,250);
        kgf.actorInfo();
        kgf.movieInfo();
        System.out.println(kgf.toString());
    }
}
