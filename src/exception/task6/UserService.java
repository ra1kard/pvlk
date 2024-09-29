package exception.task6;

import org.w3c.dom.ls.LSOutput;

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

    public void transferMoney(User fromUser, User ToUser, Account fromAccount, Account toAccount, double amount) {
        try {
            userRepository.getUserById(fromUser.getId());
            userRepository.getUserById(ToUser.getId());

            try {
                fromAccount.getBalance();   //чтобы не совершать отм действия из-за вероятного отс toAcc запросим баланс
                toAccount.getBalance();
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println("Операция выполнена");
            } catch (NullPointerException e) {
                System.out.println("Account not found, операция отменена");
            }

        } catch (NullPointerException e) {
            System.out.println("User not found, операция отменена");
        }

        //validateUserExists(user);

    }

    /*public void validateUserExists(User user) throws UserNotFoundException {
        if () {
            throw new UserNotFoundException("Пользователь НЕ НАЙДЕН");
        }
    }*/

}
