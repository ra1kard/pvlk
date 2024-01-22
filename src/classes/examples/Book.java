package classes.examples;

public class Book {
    public String name;
    public String author;
    public int year;

    Book() {
        this.name = "неизвестно";
        this.author = "неизвестно";
        this.year = 0;
    }

    Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void Info() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", name, author, year);
    }
}
