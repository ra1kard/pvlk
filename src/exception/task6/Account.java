package exception.task6;

public abstract class Account implements AccountOperation {
    private final int number;
    private double balance;
    private String name;
    private TypeAccount typeAccount;
    private double creditLimit;

    Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
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

    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

}
