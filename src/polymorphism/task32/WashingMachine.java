package polymorphism.task32;

import java.time.LocalDate;

public class WashingMachine extends Item {

    WashingMachine(String name, int cost, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, Type.WASHING_MACHINE);
    }

}
