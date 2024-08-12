package generics.task5;

import java.time.LocalDate;

public class Kettle extends Household {
    private final boolean differentTemp;

    Kettle(String name, int cost, boolean differentTemp, LocalDate dateArrivalAtTheWarehouse) {
        super(name, cost, dateArrivalAtTheWarehouse, ProductItem.KETTLE);
        this.differentTemp = differentTemp;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "differentTemp='" + differentTemp + '\'' + " " +
                "name=" + getName() + " " +
                "cost=" + getCost() + " " +
                "date=" + getDateArrivalAtTheWarehouse() + '}';
    }

}
