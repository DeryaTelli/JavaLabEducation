import java.util.ArrayList;
import java.util.Iterator;

public class Main {
      static void switchPair(ArrayList list1){
        int temp = list1.size();
        String a;
        if(temp%2==0){
            for(int i=0; i<temp;i+=2) {
                a=list1.get(i + 1).toString();
                list1.set(i+1,list1.get(i).toString());
                list1.set(i,a);
            }
        }else{
            for(int i=0; i<temp-1;i+=2) {
                a=list1.get(i + 1).toString();
                list1.set(i+1,list1.get(i).toString());
                list1.set(i,a);
            }
        }

    }
    public static void main(String[] args) {

       // Main mainInstance = new Main();
        ArrayList  list=new ArrayList();
        list.add("score");
        list.add("and");
        list.add("seven");
        list.add("years");
        list.add("ago");
        // switchpair methodu sinif seviyesinde oldugu icin static yapmam gerekiyor
        // eger static yapmazsam program onu nesne seviyesi olarak algilar ve hata verir bunu duzeltmek icinde
        // ya switch pair methodunu static yapmaliyim yada mainden nesne olusturup cagirmaliyim methodumu 
        //mainInstance.switchPair(list);
        switchPair(list);
        Iterator iter =list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }


    }

}


