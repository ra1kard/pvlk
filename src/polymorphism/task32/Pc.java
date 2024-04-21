package polymorphism.task32;

import java.time.LocalDate;

public class Pc extends Item {
    private String proc;

    Pc(String name, int cost, String proc, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, Type.PC);
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
