package exception.task6;

import java.util.HashMap;
import java.util.Map;

public class Start {

    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        AccountRepository accountRepository = new AccountRepository();
        UserService userService = new UserService(userRepository, accountRepository);

        //TODO: id вынести в User как count++ ?
        //подразумеваем, что создаем Юзеров только через репозиторий
        userRepository.addUser(new User(1, "Kanova Katya", "79552223310"));
        userRepository.addUser(new User(2, "Danova Daria", "79552223311"));
        userRepository.addUser(new User(3, "Panov Petya", "79552223312"));
        userRepository.addUser(new User(4, "Vanov Vasya", "79552223313"));

        //подразумеваем, что создаем Счета только через репозиторий (пусть пока сразу с балансом, потом сдел изменение)
        accountRepository.addAccount(new DepositAccount(105201, 44000));
        accountRepository.addAccount(new DepositAccount(105202, 3000));
        accountRepository.addAccount(new DepositAccount(105203, 283100));
        accountRepository.addAccount(new DepositAccount(105204, 140000));

        accountRepository.addAccount(new CreditAccount(105205, 3000, 155000, 15));
        accountRepository.addAccount(new CreditAccount(105206, -113000, -115000, 27));
        accountRepository.addAccount(new CreditAccount(105207, -333000, 999000, 27));
        accountRepository.addAccount(new CreditAccount(105208, 222000, 1555000, 6));

        accountRepository.addAccount(new SavingAccount(105209, 1222000, 10));
        accountRepository.addAccount(new SavingAccount(105210, 7555000, 15));
        accountRepository.addAccount(new SavingAccount(105211, 555000, 15));
        accountRepository.addAccount(new SavingAccount(105212, 15000, 15));

        accountRepository.addAccount(new FuelLoyaltyAccount(205201, 100, 3));
        accountRepository.addAccount(new FuelLoyaltyAccount(205202, 0, 5));
        accountRepository.addAccount(new FuelLoyaltyAccount(205203, 0, 10));

        accountRepository.addAccount(new StoreFiftyLoyaltyAccount(305201, 50, 5));
        accountRepository.addAccount(new StoreFiftyLoyaltyAccount(305202, 50, 10));
        accountRepository.addAccount(new StoreFiftyLoyaltyAccount(305203, 50, 15));

        //добавим юзерам счета
        userRepository.getUserById(1).addAccount(accountRepository.getAccountByNumber(105201));
        userRepository.getUserById(1).addAccount(accountRepository.getAccountByNumber(105205));
        userRepository.getUserById(1).addAccount(accountRepository.getAccountByNumber(105209));
        userRepository.getUserById(1).addAccount(accountRepository.getAccountByNumber(205201));
        userRepository.getUserById(1).addAccount(accountRepository.getAccountByNumber(305201));

        userRepository.getUserById(3).addAccount(accountRepository.getAccountByNumber(105202));
        userRepository.getUserById(3).addAccount(accountRepository.getAccountByNumber(105206));
        userRepository.getUserById(3).addAccount(accountRepository.getAccountByNumber(105210));
        userRepository.getUserById(3).addAccount(accountRepository.getAccountByNumber(205202));
        userRepository.getUserById(3).addAccount(accountRepository.getAccountByNumber(305202));

        //выведем полную информацию по юзеру и его счетам
        /*printInfoUser(userRepository.getUserById(1));
        printInfoUser(userRepository.getUserById(3));*/

        //ИТЕРАЦИЯ 1
        //попробуем внести/снять деньги на счет НАПРЯМУЮ
        /*printInfoUser(userRepository.getUserById(1));
        accountRepository.getAccountByNumber(105201).deposit(100);
        accountRepository.getAccountByNumber(105205).withdraw(5000);
        accountRepository.getAccountByNumber(105209).withdraw(1000);
        printInfoUser(userRepository.getUserById(1));*/

        //ИТЕРАЦИЯ 2
        //попробуем перевод через Сервис от юзераА к юзеруБ (другу на счет)
        /*printInfoUser(userRepository.getUserById(1));
        printInfoUser(userRepository.getUserById(3));
        userService.transferMoney(
                105201,
                105202,
                4000
        );
        printInfoUser(userRepository.getUserById(1));
        printInfoUser(userRepository.getUserById(3));*/

        //ИТЕРАЦИЯ 3
        //попробуем перевод через Сервис со счета юзераА, на счет юзераА (свой счет)
        /*printInfoUser(userRepository.getUserById(3));
        userService.transferMoney(
                105206,
                105210,
                2000
        );
        printInfoUser(userRepository.getUserById(3));*/

        //ИТЕРАЦИЯ 4
        //пополним карту заправки и спишем
        /*printInfoUser(userRepository.getUserById(1));
        userService.refuelCar(false, 20, 59, 205201);
        printInfoUser(userRepository.getUserById(1));*/

        //ИТЕРАЦИЯ 5
        //пополним карту заправки и спишем
        printInfoUser(userRepository.getUserById(1));
        userService.buyItem(false, 250, 305201);
        printInfoUser(userRepository.getUserById(1));
    }

    public static void printInfoUser(User user) {
        System.out.println();
        System.out.println("Информация по юзеру " + user.getFullName() + ":");
        System.out.println("◦ id: " + user.getId() + ", " + user);
        System.out.println("Выведем список счетов " + user.getFullName() + ":");

        HashMap<Integer, Account> mapAccountss = new HashMap<>();
        mapAccountss.putAll(user.getMapAccounts());
        for (Map.Entry<Integer, Account> entry: mapAccountss.entrySet()) {
            System.out.println(entry.getValue().getName() + ", №"
                    + entry.getValue().getNumber() + ", баланс: "
                    + entry.getValue().getBalance());
        }

        System.out.println();
    }

}
