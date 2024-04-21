package polymorphism.task32;

import java.time.LocalDate;

public class Tv extends Item {
    private int inches;

    Tv(String name, int cost, int inches, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, Type.TV);
        this.inches = inches;
    }

}
