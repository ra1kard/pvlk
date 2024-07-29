package generics.task5;

import java.time.LocalDate;

public class WashingMachine extends Household {
    private final boolean isSlim;

    WashingMachine(String name, int cost, boolean isSlim, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, ProductItem.WASHING_MACHINE);
        this.isSlim = isSlim;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "isSlim='" + isSlim + '\'' + " " +
                "name=" + getName() + " " +
                "cost=" + getCost() + " " +
                "date=" + getDateArrivalAtTheWarehouse() + '}';
    }

}
