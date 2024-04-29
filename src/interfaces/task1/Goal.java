package interfaces.task1;

public abstract class Goal {
    private int maxSpeed;

    Goal(int speed) {
        this.maxSpeed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}
