package exception.task6;

public class CreditAccount extends Account {
    private boolean active = false;
    private double creditLimit;
    private double percentCredit;

    CreditAccount(int number, double balance, double creditLimit, double percentCredit) {
        super(number, balance);
        this.active = true;
        this.creditLimit = creditLimit;
        this.percentCredit = percentCredit;
    }

    public boolean isActive() {
        return active;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getPercentCredit() {
        return percentCredit;
    }

    @Override
    public String getName() {
        return "◦ Кредитный     счет";
    }

    @Override
    public String toString() {
        return "Номер счета: " + getNumber()
                + ",  баланс: " + getBalance();
    }

}
