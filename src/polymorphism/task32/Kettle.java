package polymorphism.task32;

import java.time.LocalDate;

//чайник
public class Kettle extends Item {

    Kettle(String name, int cost, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, Type.KETTLE);
    }

}
