public class BankAccount implements Comparable<BankAccount> {

    int accountNo;
    String holderName;
    double balance;
    BankAccount(int accountNo,String holderName,double balance){
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void balanceChange(double amount){
        this.balance-=amount;
    }

    //
    @Override
    public String toString(){
        return "name:"+this.holderName+" new balance:"+this.balance;
    }

    @Override
    public int compareTo(BankAccount o) {
        return this.holderName.compareTo(o.holderName);
    }
}
