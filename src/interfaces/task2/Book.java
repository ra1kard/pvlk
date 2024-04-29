package interfaces.task2;

public class Book extends Edition implements Printable {
    String author;

    Book(String name, String author) {
        super(name);
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + getName() + ", от автора: " + author);
    }

}
