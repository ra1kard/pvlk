package exception.task6;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Счета пользователей должны храниться в классе AccountRepository
 * структуру для хранения данных выберите самостоятельно, исходя из удобства и оптимальности использования
 * - - -
 * Классы репозитории должны не только хранить данные
 * Но и обеспечивать возможность удаления, добавления, изменения, получения данных
 * Вся логика связанная с сохр данных должна располагаться именно в репозиториях
 */
public class AccountRepository implements AccountRepositoryOperation {
    private HashMap<Integer, Account> mapAccounts;

    AccountRepository() {
        mapAccounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        mapAccounts.put(account.getNumber(), account);
    }

    public Account getAccountByNumber(int number) {
        return mapAccounts.get(number);
    }

    public void removeAccount(Account account) {
        mapAccounts.remove(account.getNumber());
    }

    /*public boolean isAccountExists(Account account) {

    }*/

}
