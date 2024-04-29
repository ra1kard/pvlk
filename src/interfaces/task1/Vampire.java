package interfaces.task1;

public class Vampire extends Goal implements Movingable {
    private String name;

    Vampire(int maxSpeed, String name) {
        super(maxSpeed);
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(getName() + " - вампир, движется со скоростью " + getMaxSpeed()
                + ", быстрее военных кораблей!");
    }

    public String getName() {
        return name;
    }

}
