import java.util.ArrayList;
import java.util.Collections;

public class Main  {
    public static void main(String[] args)
    {
        ArrayList<Movie> list= new ArrayList<>();
        list.add(new Movie("Force Awakens",8.3,2015));
        list.add(new Movie("Game of Thrones",9.0,2020));
        list.add(new Movie("Empire Strikes Back",8.8,1980));
        list.add(new Movie("The Witcher",9.8,2020));
        Collections.sort(list); // karsilastirmada yili kullanacak
        System.out.println("Movies after sorting:");
        for(Movie moviesY: list){
            System.out.println(moviesY.toString());
        }
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list,ratingCompare);
        for(Movie moviesR: list){
            System.out.println(moviesR.toString());
        }
        System.out.println("Sorted by name:");
        NameCompare nameCompare=new NameCompare();
        Collections.sort(list,nameCompare);
        for (Movie movieN: list ){
            System.out.println(movieN.toString());
        }

    }
}