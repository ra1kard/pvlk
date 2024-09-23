package exception.task6;

public class SavingAccount extends Account {
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

    @Override
    public String toString() {
        return "Номер счета: " + getNumber()
                + ",  баланс: " + getBalance();
    }

}
