package interfaces.example2;

public class Journal implements Printable {
    private String name;

    String getName(){
        return name;
    }

    Journal(String name){
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}
