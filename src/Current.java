/**
 *
 * @author Abbi
 */
public class Current extends Account {
    
    Current(int accountId, double initialDeposit){
        super(accountId);
        this.setBalance (initialDeposit);
        }


    @Override
    public AccountType getAccountType() {
        return AccountType.Current;
    }
}
