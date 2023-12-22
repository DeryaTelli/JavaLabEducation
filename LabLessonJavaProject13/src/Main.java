import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        ArrayList myAccount=new ArrayList();
        // i burada bos bir nesne down casting yapip degeri buna atadik
        BankAccount i, a1=new BankAccount(23,"d21",400);
        BankAccount b1=new BankAccount(22,"d20",600);
        BankAccount c1=new BankAccount(21,"d19",300);
        BankAccount d1=new BankAccount(20,"d18",800);
        // eger toString tanimlamazsan ana clasda adres donecektir
        myAccount.add(a1);
        myAccount.add(b1);
        myAccount.add(c1);
        myAccount.add(d1);
        Collections.sort(myAccount);
        Iterator iter=myAccount.iterator();
        while(iter.hasNext()){
            i= (BankAccount) iter.next();
            i.balanceChange(500.0);
            System.out.println(i.toString());
        }


    }
}