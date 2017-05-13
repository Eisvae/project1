/**
 *
 * @author Abbi
 */
public class Savings extends Account {
    
    Savings(int accountId, double initialDeposit){
        super(accountId);
        this.setBalance (initialDeposit);
    }
    
    @Override
    public AccountType getAccountType() {
        return AccountType.Savings;
    }
}

