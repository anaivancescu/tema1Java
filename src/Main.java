public class Main {

    public static void main(String[] args) {

        Account1 b = new Account1(300,1);
        try{
        b.deposit(5);
        b.withdraw(400);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }

        Account2 a = new Account2(12.3,2,10);
        Account3 c=  new Account3(123,3,50);
//        System.out.println(b);
//        System.out.println(a);
//        System.out.println(c);

        Bank bank = new Bank("ING");
        bank.AddAccount(b);
        bank.AddAccount(a);
        bank.AddAccount(c);

        //bank.afis();
        bank.AfisDetalii(3);
        bank.AfisDetalii(2);
        bank.ModifWithdrawLimit(30);
        bank.AfisDetalii(2);
        bank.ModifMinBalance(3);
        bank.AfisDetalii(3);
    }
}
