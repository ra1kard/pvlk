package interfaces.example5;

public class Journal {
    private String name;

    String getName() {
        return name;
    }

    Journal(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}
