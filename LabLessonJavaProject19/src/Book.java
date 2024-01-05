import java.util.Comparator;

public class Book implements Comparable<Book> {
    String name;
    double price;
    Book(String name, double price){
        this.name=name;
        this.price=price;
    }
    public double totalPrice(){
        return price+(0.8*price);
    }

    @Override
    public int compareTo(Book a){
        if(totalPrice()>a.totalPrice()) return 1;
        else if(totalPrice()<a.totalPrice()) return -1;
        else return 0;
    }
    @Override
    public String toString(){
        return "Book of name: "+name+" price: "+totalPrice();
    }
}
