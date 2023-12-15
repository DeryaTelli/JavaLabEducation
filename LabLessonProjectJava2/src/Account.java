public class Account {
    private String name;
    private double balance;

    Account(String name, double balance){
        this.balance=balance;
        this.name=name;
    }
    public void deposit(double depositAmount){
        balance+=depositAmount;
        System.out.println("New deposit:"+balance);
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}
