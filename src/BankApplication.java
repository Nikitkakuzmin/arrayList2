import  java.util.ArrayList;
import java.util.List;

public class BankApplication {

    String name;
    List<Account> accounts = new ArrayList();

    public BankApplication(String name) {
        this.name = name;
    }

    public  void addAccount(Account a){
        accounts.add(a);

    }

    public void removeAccount(int i){
        accounts.remove(i);
    }

    public Account getMaxAccount(){
        Account max = accounts.get(0);
        for(Account a : accounts){
            if(max.getBalance() < a.getBalance()){
                max = a;
            }
        }
        return max;
    }

    double getAverageBalance(){
        double aver = getTotalBalance();
        return aver/accounts.size();

    }

     public double getTotalBalance(){
        double sum = 0;
        for(Account a : accounts){
            sum += a.getBalance();
        }
        return sum;
    }

    int totalAccounts(){
        return  accounts.size();
    }

    String getBankData(){
        return name + " " + accounts.size() + " " + getTotalBalance() + " " + getAverageBalance();
    }
}
