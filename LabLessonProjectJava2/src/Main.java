import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account a1=new Account("Mihriban sokroya", 10001);
        Account a2 = new Account("Derya",6000);
        System.out.println( "Name: "+a1.getName()+" balance: "+a1.getBalance());
        System.out.println("Name: "+a2.getName()+"  balance: "+a2.getBalance());
        a1.setName("Sokroya Mihri");
        System.out.println("Name: "+a1.getName()+" balance: "+a1.getBalance());
        a1.setBalance(2.0);
        System.out.println("name:"+a1.getName()+" balanca"+a1.getBalance());
        Scanner input= new Scanner(System.in);
        System.out.print("Enter deposit amount for account:");
        double depositAmount=input.nextDouble();
        a1.deposit(depositAmount);





    }
}