package exception.task6;

public class DepositAccount extends Account implements AccountOperation {
    private boolean active = false;

    DepositAccount(int number, double balance) {
        super(number, balance);
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String getName() {
        return "◦ Депозитный счет";
    }

    //метод внесения денег на счет
    /*@Override
    public void deposit(double amount) {

    }*/

    /*//метод снятия денег со счета
    @Override
    public void withdraw(double amount) {

    }*/

    /*//метод получения текущего баланса счета
    @Override
    public double getBalance() {

    }*/

    @Override
    public String toString() {
        return "Номер счета: " + getNumber()
                + ",  баланс: " + getBalance();
    }

}
