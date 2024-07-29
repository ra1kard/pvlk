package generics.task5;

import java.time.LocalDate;

public abstract class Household extends Item {

    Household(String name, int cost, LocalDate dateArrivalAtTheWarehouse, ProductItem productItem) {
        super(name, cost, dateArrivalAtTheWarehouse, productItem);
    }

}
