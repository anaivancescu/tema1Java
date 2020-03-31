public class Account2 extends Account1 {
    private double withdrawLimit;

    public Account2(double balance, int accNumber, double withdrawLimit) {
        super(balance, accNumber);
        this.withdrawLimit = withdrawLimit;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

   public String toString(){
        return  super.toString() + "; withdrawLimit:  " + withdrawLimit+";";
    }
}
