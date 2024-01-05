import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args)
    {
        LinkedList<Book> bookList=new LinkedList<Book>();
        bookList.add(new Book("Şeytan Tozu", 300.0));
        bookList.add(new Book("Bir Zanaatla Beklenmedik Karşılaşma", 556.76));
        bookList.add(new Book("Dönüşüm", 103.0));
        bookList.add(new Book("Genetik Komplo", 230.99));
        System.out.println("Before compare");
        Iterator<Book> iters=bookList.iterator();
        while(iters.hasNext()){
            System.out.println(iters.next().toString());
        }
        System.out.println("During compare");
        Collections.sort(bookList);
        for (Book compare:bookList){
            System.out.println(compare.toString());
        }
        System.out.println("After total price compare");

    }
}