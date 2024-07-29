package generics.task5;

import java.time.LocalDate;

public abstract class Electro extends Item {

    Electro(String name, int cost, LocalDate dateArrivalAtTheWarehouse, ProductItem productItem) {
        super(name, cost, dateArrivalAtTheWarehouse, productItem);
    }

}
