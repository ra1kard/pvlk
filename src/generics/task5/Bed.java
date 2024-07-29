package generics.task5;

import java.time.LocalDate;

public class Bed extends Furniture {

    Bed(String name, int cost, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, ProductItem.BED);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "name=" + getName() + " " +
                "cost=" + getCost() + " " +
                "date=" + getDateArrivalAtTheWarehouse() + '}';
    }

}
