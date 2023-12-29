import java.util.Comparator;

public class NameCompare  implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.compareTo(o2);
    }
}
