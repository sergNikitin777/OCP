package ethuware.stest2.test10;

interface Account{
    public default String getId(){
        return "0000";
    }
}

interface PremiumAccount extends Account{
    public String getId();
}

public class BankAccount implements Account{
    public static void main(String[] args) {
        Account acct = new BankAccount();
        System.out.println(acct.getId());
    }
}