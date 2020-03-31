import java.util.ArrayList;
import java.util.List;

public class Bank {
    String name;
    List<Account1> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts= new ArrayList<>();
    }
    public void AddAccount(Account1 x){
        this.accounts.add(x);
    }
    public void afis(){

        for(int i =0; i< accounts.size();i++){
            System.out.println(this.accounts.get(i)+" ");
        }
        System.out.println();
    }
    public void AfisDetalii(int x){
        for(int i=0;i<accounts.size();i++){
           // x=this.accounts.get(i).getAccNumber();
            if(x==this.accounts.get(i).getAccNumber())
                //x=this.accounts.get(i).getAccNumber();
            System.out.println(accounts.get(i));
        }

    }
    public  void ModifWithdrawLimit(int x){
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i) instanceof Account2){
                ((Account2)accounts.get(i)).setWithdrawLimit(x);
            }
        }

    }
    public void ModifMinBalance(int x){
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i) instanceof Account3){
                ((Account3)accounts.get(i)).setMinBalance(x);
            }
        }

    }
}
