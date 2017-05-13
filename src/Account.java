
import java.io.Serializable;

/**
 *
 * @author Abbi
 */
public abstract class Account  implements Serializable{
    private double balance = 0;
    private int accountNumber;
    
    Account(int accountId){
        accountNumber = accountId;
    }
    
    public abstract AccountType getAccountType();
    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    
    void setAccountNumber(int accountNumber) {
this.accountNumber = accountNumber;
    }

    @Override
    public String toString(){
        return "Account Type: " + getAccountType() + " Account\n" +
                "Account Number: " + this.getAccountNumber() + "\n" +
                "Balance: £" + this.getBalance() + "\n";
}
}
