import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Account a1 = new Account(1,"Kamaz","Arbuzov",1200);
        Account a2 = new Account(2,"Ulov","Kalmarov",1800);
        Account a3 = new Account(3,"Rulon","Oboev",1240);
        Account a4 = new Account(4,"Razvod","Suprugov",18700);
        Account a5 = new Account(5,"Razrez","Batonov",1800);
        Account a6 = new Account(6,"Razbor","Poletov",1800);


        BankApplication b1 = new BankApplication("Kaspi");
        BankApplication b2 = new BankApplication("Jusan");

        b1.addAccount(a1);
        b1.addAccount(a2);
        b1.addAccount(a3);

        b2.addAccount(a4);
        b2.addAccount(a5);
        b2.addAccount(a6);

        List<BankApplication> banks = new ArrayList<>();
        banks.add(b1);
        banks.add(b2);

        for(BankApplication b : banks){
            System.out.println(b.getBankData());
        }

        for(int i = 0; i < banks.size();i ++){
            for(int j =0; j < banks.size(); j ++){
                if(banks.get(i).getAverageBalance() > banks.get(j).getAverageBalance()){
                    BankApplication temp = banks.get(i);
                    banks.set(i,banks.get(j));
                    banks.set(j,temp);
                }
            }
        }

        Collections.reverse(banks);
        System.out.println();

        for(BankApplication q : banks){
            System.out.println(q.getBankData());
        }
    }
}
