package exception.task6;

public interface AccountRepositoryOperation {

    void addAccount(Account account);

    Account getAccountByNumber(int number);

    void removeAccount(Account account);

}
