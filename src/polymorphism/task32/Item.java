package polymorphism.task32;

import java.time.LocalDate;

public abstract class Item {
    private String name;                                //название товара
    private int cost;                                   //стоимость товара
    private LocalDate dateArrivalAtTheWarehouse;        //дата прибытия на склад
    private Type type;                                  //вид товара

    Item(String name, int cost, LocalDate dateArrivalAtTheWarehouse, Type type) {
        this.name = name;
        this.cost = cost;
        this.dateArrivalAtTheWarehouse = dateArrivalAtTheWarehouse;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public LocalDate getDateArrivalAtTheWarehouse() {
        return dateArrivalAtTheWarehouse;
    }

    public Type getType() {
        return type;
    }

}
