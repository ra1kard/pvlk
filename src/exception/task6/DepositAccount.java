package exception.task6;

public class DepositAccount extends Account {
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
        return "◦ Депозитный    счет";
    }

    @Override
    public String toString() {
        return "Номер счета: " + getNumber()
                + ",  баланс: " + getBalance();
    }

}
