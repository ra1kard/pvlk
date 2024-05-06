package interfaces.task4;

public class HomeAnimal implements Aliveable {
    private String name;
    private boolean alive = true;

    HomeAnimal(String name) {
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
        System.out.println("Имя животного:" + name);
    }

}
