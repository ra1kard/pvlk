package exception.task6;

import java.util.HashMap;

public interface AccountRepositoryOperation {

    void addAccount(Account account);

    Account getAccountByNumber(int number);

    void removeAccount(Account account);

}
