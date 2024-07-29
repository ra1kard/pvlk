package generics.task5;

import java.time.LocalDate;

public abstract class Item {
    private final String name;                          //название товара
    private int cost;                                   //стоимость товара
    private LocalDate dateArrivalAtTheWarehouse;        //дата прибытия на склад
    private final ProductItem productItem;              //наименование вида товара

    Item(String name, int cost, LocalDate dateArrivalAtTheWarehouse, ProductItem productItem) {
        this.name = name;
        this.cost = cost;
        this.dateArrivalAtTheWarehouse = dateArrivalAtTheWarehouse;
        this.productItem = productItem;
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

    public ProductItem getProductItem() {
        return productItem;
    }

}
