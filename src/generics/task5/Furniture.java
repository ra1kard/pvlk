package generics.task5;

import java.time.LocalDate;

public abstract class Furniture extends Item {

    Furniture(String name, int cost, LocalDate dateArrivalAtTheWarehouse, ProductItem productItem) {
        super(name, cost, dateArrivalAtTheWarehouse, productItem);
    }

}
