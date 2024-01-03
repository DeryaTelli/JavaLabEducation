import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Student a1=new Student(100,20,"derya");
        Student a2=new Student(100,20,"derya");
        Student a3=a1;
        // eger datalara gore eistlik yapilmasini istersem student kalsinda equals methodunu kullanmam gerekecektir
        // yani a1.equals(a2) yaparsam datalari kontrol edecek ve same dondurecektir degeri
        if(a1.equals(a2)){
            System.out.println("same");
            // a1==a3 ayni cikicaktir cunku adresleri ayni yerdedir
        }else{
            System.out.println("not same"); // a1==a2 degildir cunku referans yani adresleri farkkli yerdedir
            // onlarin verilerine degil adreslerine baktigi icin same degildir
        }

        ArrayList<Student> list =new ArrayList<Student>();
        list.add(new Student(100,20,"derya"));
        list.add(new Student(200,31,"ali"));
        list.add(new Student(400,10,"erya"));
        System.out.println("-----------Student Age Order ----------------");
        Collections.sort(list);
        for(Student items:list){
            System.out.println(items.toString());
        }
        System.out.println("-----------Student Name Order ----------------");
        Collections.sort(list,new NameCompare());
        for(Student Nitems: list){
            System.out.println(Nitems.toString());
        }
        System.out.println("---------- Student No Order-----------------");
        Collections.sort(list,new NoCompare());
        for(Student NoItems:list){
            System.out.println(NoItems.toString());
        }

    }
}