package polymorphism.task32;

import java.time.LocalDate;

public class Tv extends Item {
    Tv(String name, int cost, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, Type.TV);
    }

}
