package interfaces.task4;

public class Plant implements Aliveable {
    private String name;
    private boolean alive = true;

    Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isAlive() {
        return alive;
    }

    @Override
    public void setAlive(boolean value) {
        this.alive = value;
    }

    public void print() {
        System.out.println("Название растения: " + name);
    }

}
