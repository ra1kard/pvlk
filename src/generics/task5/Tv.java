package generics.task5;

import java.time.LocalDate;

public class Tv extends Electro {
    private final int inches;

    Tv(String name, int cost, int inches, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, ProductItem.TV);
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "inches='" + inches + '\'' + " " +
                "name=" + getName() + " " +
                "cost=" + getCost() + " " +
                "date=" + getDateArrivalAtTheWarehouse() + '}';
    }

}
