package exception.task6;

/**
 * 🟠 Вся логика связ с возм или невозм вып операций, ген или обр исключений
 * ✅ при этом в классе сервисе не должно храниться инф о счетах и пользователях,
 * ✅ а вместо этого должны существовать поля UserRepository и AccountRepository
 * 🟠 именно сервис занимается управлением логикой взаимодействия с пользователями и их счетами
 */
public class UserService {
    private UserRepository userRepository;
    private AccountRepository accountRepository;

    UserService(UserRepository userRepository, AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

    public void transferMoney(User fromUser, Account fromAccount, User toUser, Account toAccount, double amount) {
        //представим, что мы проверили по № телефона есть счет from и to, полученные данные корректны
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    public void transferMoneyToYourAccount(User user, Account fromAccount, Account toAccount, double amount) {
        //представим, что мы проверили по № телефона есть счет from и to, полученные данные корректны
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

}
