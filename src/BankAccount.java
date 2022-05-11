public class BankAccount {
    double balance;
    public BankAccount(){}
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void Deposit(double Amount){
        this.balance = this.balance + Amount;
    }
    public void Withdraw(double Amount){
        this.balance = this.balance - Amount;
    }
    public void PrintBalance(){
        System.out.println(this.balance);
    }
    public void Transfer()
    public static void main(String[] args) {
    }
}
