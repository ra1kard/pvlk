package generics.task5;

import java.time.LocalDate;

public class Closet extends Furniture {

    Closet(String name, int cost, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, ProductItem.CLOSET);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "name=" + getName() + " " +
                "cost=" + getCost() + " " +
                "date=" + getDateArrivalAtTheWarehouse() + '}';
    }

}
