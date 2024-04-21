package polymorphism.task32;

import java.time.LocalDate;

public class Kettle extends Item {
    private boolean differentTemp;

    Kettle(String name, int cost, boolean differentTemp, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, Type.KETTLE);
        this.differentTemp = differentTemp;
    }

}
