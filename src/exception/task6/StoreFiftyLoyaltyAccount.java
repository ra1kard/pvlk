package exception.task6;

public class StoreFiftyLoyaltyAccount extends Account {
    private int discount;
    private final TypeAccount typeAccount = TypeAccount.STORE;

    StoreFiftyLoyaltyAccount(int number, double balance, int discount) {
        super(number, balance);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String getName() {
        return "◦ КартаЛМагазин счет";
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
