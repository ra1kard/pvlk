package interfaces.task1;

public class Bird extends Goal implements Movingable {
    private String type;

    Bird(int maxSpeed, String type) {
        super(maxSpeed);
        this.type = type;
    }

    @Override
    public void move() {
        System.out.println(getType() + " - птица, движется со скоростью " + getMaxSpeed());
    }

    public String getType() {
        return type;
    }

}
