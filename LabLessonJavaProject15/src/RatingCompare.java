import java.util.Comparator;

public class RatingCompare  implements Comparator<Movie> {

    @Override
    public int compare(Movie a, Movie b) {
        if(a.getRate()>b.getRate()){
            return 1;
        }else if(a.getRate()<b.getRate()){
            return -1;
        }else{
            return 0;
        }

    }
}
