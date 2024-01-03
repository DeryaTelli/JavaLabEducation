import java.util.Comparator;

public class NoCompare implements Comparator<Student> {

    @Override
    public int compare(Student a , Student b){
        if(a.sNo>b.sNo)
            return 1;
        else if(a.sNo<b.sNo)
            return -1;
        else
            return 0;
    }
}
