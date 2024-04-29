package interfaces.task1;

public class Ship extends Goal implements Movingable {
    private boolean military;

    Ship(int maxSpeed, boolean military) {
        super(maxSpeed);
        this.military = military;
    }

    @Override
    public void move() {
        if (getMilitary()) {
            System.out.println("Этот корабль военный, движется со скоростью " + getMaxSpeed());
        } else {
            System.out.println("Этот корабль-рефрежератор (плавающий холодильнгик), движется со скоростью "
                    + getMaxSpeed());
        }
    }

    public boolean getMilitary() {
        return military;
    }

}
