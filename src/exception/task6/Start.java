package exception.task6;

public class Start {

    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        AccountRepository accountRepository = new AccountRepository();
        UserService userService = new UserService(userRepository, accountRepository);

        //подразумеваем, что создаем Юзеров только через репозиторий
        userRepository.addUser(new User(1, "Kanova Katya", "79552223310"));
        userRepository.addUser(new User(2, "Danova Daria", "79552223311"));
        userRepository.addUser(new User(3, "Panov Petya", "79552223312"));
        userRepository.addUser(new User(4, "Vanov Vasya", "79552223313"));

        //подразумеваем, что создаем Счета только через репозиторий (пусть пока сразу с балансом, потом сдел изменение)
        accountRepository.addAccount(new DepositAccount(105201, 44000));
        accountRepository.addAccount(new DepositAccount(105202, 55000));
        accountRepository.addAccount(new DepositAccount(105203, 283100));
        accountRepository.addAccount(new DepositAccount(105204, 140000));
        accountRepository.addAccount(new CreditAccount(105205, -15000, 155000, 15));
        accountRepository.addAccount(new CreditAccount(105206, -155000, 99000, 27));
        accountRepository.addAccount(new CreditAccount(105207, -333000, 999000, 27));
        accountRepository.addAccount(new CreditAccount(105208, 222000, 1555000, 6));
        accountRepository.addAccount(new SavingAccount(105209, 1222000, 10));
        accountRepository.addAccount(new SavingAccount(105210, 7555000, 15));
        accountRepository.addAccount(new SavingAccount(105211, 555000, 15));
        accountRepository.addAccount(new SavingAccount(105212, 15000, 15));

        //добавим юзерам счета
        userRepository.getUserByName("Kanova Katya").addAccount(accountRepository.getAccountByNumber(105201));
        userRepository.getUserByName("Kanova Katya").addAccount(accountRepository.getAccountByNumber(105205));
        userRepository.getUserByName("Kanova Katya").addAccount(accountRepository.getAccountByNumber(105209));
        userRepository.getUserById(3).addAccount(accountRepository.getAccountByNumber(105202));
        userRepository.getUserById(3).addAccount(accountRepository.getAccountByNumber(105210));

        //выведем полную информацию по юзеру и его счетам
        printInfoUser(userRepository.getUserByName("Kanova Katya"));    //также можно в репо найти по id, телефону
        printInfoUser(userRepository.getUserByName("Panov Petya"));

        /*//ИТЕРАЦИЯ 1
        //попробуем внести/снять деньги на счет НАПРЯМУЮ
        accountRepository.getAccountByNumber(105201).deposit(100);
        accountRepository.getAccountByNumber(105205).withdraw(5000);
        accountRepository.getAccountByNumber(105210).withdraw(1000);

        //выведем полную информацию по юзеру и его счетам
        printInfoUser(userRepository.getUserByName("Kanova Katya"));
        printInfoUser(userRepository.getUserByName("Panov Petya"));*/

        //ИТЕРАЦИЯ 2
        //попробуем перевод через Сервис от юзераА к юзеруБ (другу на счет)
        userService.transferMoney(
                userRepository.getUserByPhone("79552223310"),
                accountRepository.getAccountByNumber(105201),
                userRepository.getUserByPhone("79552223312"),
                accountRepository.getAccountByNumber(105202),
                4000
        );

        //выведем полную информацию по юзеру и его счетам
        printInfoUser(userRepository.getUserByName("Kanova Katya"));
        printInfoUser(userRepository.getUserByName("Panov Petya"));

        /*//ИТЕРАЦИЯ 3
        //попробуем перевод через Сервис со счета юзераА, на счет юзераА (свой счет)
        userService.transferMoneyToYourAccount(
                userRepository.getUserByPhone("79552223312"),
                accountRepository.getAccountByNumber(105202),
                accountRepository.getAccountByNumber(105210),
                3000
        );

        //выведем полную информацию по юзеру и его счетам
        printInfoUser(userRepository.getUserByName("Kanova Katya"));
        printInfoUser(userRepository.getUserByName("Panov Petya"));*/
    }

    public static void printInfoUser(User user) {
        System.out.println("Информация по юзеру " + user.getFullName() + ":");
        System.out.println("◦ " + user);
        System.out.println("Выведем список счетов " + user.getFullName() + ":");
        for (Account account : user.getAccountList()) {
            System.out.println(account.getName() + ", №" + account.getNumber() + ", баланс: " + account.getBalance());
        }
        System.out.println();
    }

}
