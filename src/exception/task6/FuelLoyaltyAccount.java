package exception.task6;

public class FuelLoyaltyAccount extends Account {
    private final TypeAccount typeAccount = TypeAccount.FUEL;

    FuelLoyaltyAccount(int number, double balance, int percentPlus) {
        super(number, balance, percentPlus);
    }

    @Override
    public String getName() {
        return "◦ КартаЛЗаправк счет";
    }

    @Override
    public String toString() {
        return "Номер счета: " + getNumber()
                + ",  баланс: " + getBalance();
    }

    @Override
    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

}
