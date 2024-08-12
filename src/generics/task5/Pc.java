package generics.task5;

import java.time.LocalDate;

public class Pc extends Electro {
    private final String proc;

    Pc(String name, int cost, String proc, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, ProductItem.PC);
        this.proc = proc;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "proc='" + proc + '\'' + " " +
                "name=" + getName() + " " +
                "cost=" + getCost() + " " +
                "date=" + getDateArrivalAtTheWarehouse() + '}';
    }

}
