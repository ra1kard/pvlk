package exception.task6;

import java.util.ArrayList;

/**
 * Счета пользователей должны храниться в классе AccountRepository
 * структуру для хранения данных выберите самостоятельно, исходя из удобства и оптимальности использования
 * - - -
 * Классы репозитории должны не только хранить данные
 * Но и обеспечивать возможность удаления, добавления, изменения, получения данных
 * Вся логика связанная с сохр данных должна располагаться именно в репозиториях
 */
public class AccountRepository {
    private ArrayList<Account> accounts;

    AccountRepository() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Account getAccountByNumber(int number) {
        for (Account account : accounts) {
            if (account.getNumber() == number) {
                return account;
            }
        }
        return null;
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

}
