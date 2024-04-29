package interfaces.task1;

public class Human extends Goal implements Movingable {
    private String name;

    Human(int maxSpeed, String name) {
        super(maxSpeed);
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(getName() + " - человек, движется со скоростью " + getMaxSpeed());
    }

    public String getName() {
        return name;
    }

}
