package interfaces.task5;

public class Door implements Washable {
    public String name = "Дверь";

    @Override
    public String wash() {
        return type;
    }

    @Override
    public int getCost() {
        return 500;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

}
