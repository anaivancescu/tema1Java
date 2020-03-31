public class Account3 extends Account1{
    private double minBalance;

    public Account3(double balance, int accNumber, double minBalance) {
        super(balance, accNumber);
        this.minBalance = minBalance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
    public String toString(){
        return  super.toString() + "; minBalance:  " + minBalance+";";
    }
}
