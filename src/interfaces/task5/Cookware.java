package interfaces.task5;

public class Cookware implements Washable {         //кухонная посуда
    public String name = "Кух.посуда";

    @Override
    public String wash() {
        return type;
    }

    @Override
    public int getCost() {
        return 1000;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

}
