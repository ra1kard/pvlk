package interfaces.task2;

public class Magazine extends Edition implements Printable {
    boolean isSheduledTV;

    Magazine(String name, boolean sheduledTV) {
        super(name);
        this.isSheduledTV = sheduledTV;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + getName() + ", наличие ТВ передач: " + isSheduledTV);
    }

    public boolean isSheduledTV() {
        return isSheduledTV;
    }

}
