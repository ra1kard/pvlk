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

    public void transferMoney(Integer idFromUser, Integer idToUser, Integer idFromAccount, Integer idToAccount, double amount) {
        try {
            userRepository.getUserById(idFromUser);
            userRepository.getUserById(idToUser);
            try {
                accountRepository.getAccountByNumber(idFromAccount).getBalance();   //поймать исключение без действия
                accountRepository.getAccountByNumber(idToAccount).getBalance();     //поймать исключение без действия
                try {
                    validateAmountAccount(accountRepository.getAccountByNumber(idFromAccount), amount);
                    accountRepository.getAccountByNumber(idFromAccount).withdraw(amount);
                    accountRepository.getAccountByNumber(idToAccount).deposit(amount);
                    System.out.println("Операция выполнена");
                } catch (NotEnoughAmountAccountException e) {
                    throw new NotEnoughAmountAccountException("Wrong! Amount is not enough!");
                }
            } catch (NullPointerException e) {
                System.out.println("Account not found, операция отменена");
            }
        } catch (NullPointerException e) {
            System.out.println("User not found, операция отменена");
        }
    }

    public void validateAmountAccount(Account account, Double amount) throws NotEnoughAmountAccountException {
        if ((account.getTypeAccount() == TypeAccount.DEPOSIT || account.getTypeAccount() == TypeAccount.SAVING)
                && (account.getBalance() - amount) < 0) {
            throw new NotEnoughAmountAccountException("Недостаточно средств на счете");
        } else if (account.getTypeAccount() == TypeAccount.CREDIT
                && (account.getBalance() - amount) < account.getCreditLimit()) {
            throw new NotEnoughAmountAccountException("Недостаточно средств на счете");
        }
    }

    public int refuelCar(boolean WithdrawBonus, int liters, int costForLiter, Integer idFromAccount, Integer idFromUser) {
        int res = 0;
        if (WithdrawBonus) {
            try {
                userRepository.getUserById(idFromUser);
                try {
                    accountRepository.getAccountByNumber(idFromAccount).getBalance();   //поймать исключение без действия
                    res = (int) (liters
                            * costForLiter
                            - accountRepository.getAccountByNumber(idFromAccount).spendBalanceLoyalty());
                } catch (NullPointerException e) {
                    System.out.println("Account not found, операция отменена");
                }
            } catch (NullPointerException e) {
                System.out.println("User not found, операция отменена");
            }
        } else {
            try {
                userRepository.getUserById(idFromUser);
                try {
                    accountRepository.getAccountByNumber(idFromAccount).getBalance();   //поймать исключение без действия

                    accountRepository.getAccountByNumber(idFromAccount).addBalanceLoyalty(liters, costForLiter);
                    res = liters * costForLiter;

                } catch (NullPointerException e) {
                    System.out.println("Account not found, операция отменена");
                }
            } catch (NullPointerException e) {
                System.out.println("User not found, операция отменена");
            }
        }
        return res;
    }

}
