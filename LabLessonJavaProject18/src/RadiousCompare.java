import java.util.Comparator;

public class RadiousCompare implements Comparator <Circle>{
    @Override
    public int compare(Circle a , Circle b){
        if(a.getRadious()>b.getRadious())
            return 1;
        else if (a.getRadious()<b.getRadious()){
            return -1;
        }else{
            return 0;
        }
    }
}
