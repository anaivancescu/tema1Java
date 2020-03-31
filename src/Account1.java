public class Account1 {
    private double balance;
    private int accNumber;

    public Account1(double balance, int accNumber) {
        this.balance = balance;
        this.accNumber = accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }
    public void deposit(double sum){
        if(sum<0)
            throw new IllegalArgumentException("---ATENTIE! Suma trebuie sa fie pozitiva!");
        this.balance+=sum;
    }
    public void withdraw(double sum){
        if(sum>this.balance)
            throw new IllegalArgumentException("---ATENTIE! Suma depaseste balance ul!");
        this.balance-=sum;
    }
    public String toString(){
        return "balance: "+ balance + "; accNumber: "+accNumber;
    }

}
