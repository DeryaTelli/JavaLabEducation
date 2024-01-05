import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<Circle> circleList=new LinkedList<Circle>();
        circleList.add(new Circle(4.0,"Red"));
        circleList.add(new Circle(2.0,"Yellow"));
        circleList.add(new Circle(1.0,"Blue"));
        System.out.println("Before compare");
        ListIterator<Circle> iters=circleList.listIterator();
        while (iters.hasNext()){
            System.out.println(iters.next().toString());
        }
        System.out.println("During compare");
        Collections.sort(circleList,new RadiousCompare());
        for (Circle itemsR: circleList){
            System.out.println(itemsR.toString());
        }
        System.out.println("After radious compare");
        Collections.sort(circleList,new ColorCompare());
        for (Circle itemsC: circleList){
            System.out.println(itemsC.toString());

        }
        System.out.println("After color compare");

    }
}