package generics.task4;

public class Diamonds extends Treasure {
    private final int price = 100000;   //стоимость в долларах

    Diamonds(int quantity) {
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
        return "Это Бриллианты детка!";
    }

}
