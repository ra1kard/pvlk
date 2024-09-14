package exception.task6;

public class SavingAccount extends Account implements AccountOperation {
    private boolean active = false;
    private double percentPlus;

    public SavingAccount(int number, double balance, double percentPlus) {
        super(number, balance);
        this.active = true;
        this.percentPlus = percentPlus;
    }

    public boolean isActive() {
        return active;
    }

    public double getPercentPlus() {
        return percentPlus;
    }

    @Override
    public String getName() {
        return "◦ Накопительный счет";
    }

    /*//метод внесения денег на счет
    @Override
    public void deposit(double amount) {

    }*/

    /*//метод снятия денег со счета
    @Override
    public void withdraw(double amount) {

    }*/

    /*//метод получения текущего баланса счета
    @Override
    public void getBalance() {

    }*/

    @Override
    public String toString() {
        return "Номер счета: " + getNumber()
                + ",  баланс: " + getBalance();
    }

}
