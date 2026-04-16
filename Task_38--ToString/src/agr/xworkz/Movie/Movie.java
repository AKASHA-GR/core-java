package agr.xworkz.Movie;

import java.util.Arrays;

public class Movie {
    Name name;
    String releaseDate;
    Size size;
    double[] rating;
    boolean hasoskar;

    public Movie(Name name, String releaseDate, Size size, double[] rating, boolean hasoskar) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.size = size;
        this.rating = rating;
        this.hasoskar = hasoskar;
    }

    public void movieInfo(){
        System.out.println("The movie have action,comedy and etc");
    }

    public void actorInfo(){
        System.out.println("How many actors are acted in this move.");
    }

    @Override
    public String toString() {
        return "Name:"+name+",Release Date:"+releaseDate+",Size:"+size+"Rating:"+ Arrays.toString(rating)+",Has Oscar:"+hasoskar;
    }
}
