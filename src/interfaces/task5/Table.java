package interfaces.task5;

public class Table implements Washable {
    public String name = "Стол";
    private int meter;

    Table(int meter) {
        this.meter = meter;
    }

    @Override
    public String wash() {
        return type;
    }

    @Override
    public int getCost() {
        return meter * 250;
    }

    public int getMeter() {
        return meter;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

}
