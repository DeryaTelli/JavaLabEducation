import java.util.Comparator;

public class ColorCompare implements Comparator<Circle> {
    @Override
    public int compare(Circle a , Circle b ){
        return a.getColor().compareTo(b.getColor());
    }
}
