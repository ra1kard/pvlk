package oop_polymorphism.task32;

import java.time.LocalDate;

public class WashingMachine extends Item {
    private boolean isSlim;

    WashingMachine(String name, int cost, boolean isSlim, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, Type.WASHING_MACHINE);
        this.isSlim = isSlim;
    }

}
