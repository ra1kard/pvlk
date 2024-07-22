package generics.task4;

public class Gold extends Treasure {
    private final int price = 10000;   //стоимость в долларах

    Gold(int quantity) {
        super(quantity);
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    int getSumMoney() {
        return super.quantity * price;
    }

    @Override
    public String toString() {
        return "Это Золото детка!";
    }

}
