package polymorphism.task32;

import java.time.LocalDate;

public class Pc extends Item {

    Pc(String name, int cost, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, Type.PC);
    }

}
