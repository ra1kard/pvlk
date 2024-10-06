package exception.task6;

public abstract class Account implements AccountOperation {
    private final int number;
    private double balance;
    private String name;
    private TypeAccount typeAccount;
    private double creditLimit;
    private int percentPlus;

    Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    Account(int number, double balance, int percentPlus) {
        this.number = number;
        this.balance = balance;
        this.percentPlus = percentPlus;
    }

    public double getPercentPlus() {
        return percentPlus;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public double spendBalanceLoyalty() {
        double res = balance;
        this.balance = 0;
        return res;
    }

    public void addBalanceLoyalty(int liters, int costForLiter) {
        this.balance += liters * costForLiter * percentPlus / 100.0;
    }

    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

}
