  
class Account {
    private int accountID;
    private String holderName;
    protected double balance;

     public Account(int accountID, String holderName, double balance) {
        this.accountID = (accountID >= 100 && accountID <= 999) ? accountID : -1;
        this.holderName = holderName;
        this.balance = (balance >= 0) ? balance : 0;
    }

     public void setAccountBalance() {
        System.out.println("Account Balance: " + this.balance);
    }
     public double credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

     public int getAccountID() {
        return accountID;
    }

     public String getHolderName() {
        return holderName;
    }
}

 class VIPAccount extends Account {
    
     public VIPAccount(int accountID, String holderName, double balance) {
        super(accountID, holderName, balance);
    }

     @Override
    public void setAccountBalance() {
        if (balance >= -10000) {
            System.out.println("VIP Account Balance: " + balance);
        } else {
            System.out.println("Error: Balance is less than -10000.");
        }
    }
}
public class BankSystem {
    public static void main(String[] args) {
         Account account = new Account(123, "John Doe", 500);
        account.setAccountBalance();
        System.out.println("Depositing 200...");
        account.credit(200);
        account.setAccountBalance();

         VIPAccount vipAccount = new VIPAccount(456, "Jane Doe", 1000);
        vipAccount.setAccountBalance();
        System.out.println("Depositing 500...");
        vipAccount.credit(500);
        vipAccount.setAccountBalance();

         vipAccount.balance = -5000;
        vipAccount.setAccountBalance();
    }
}