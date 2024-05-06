package interfaces.example5;

public class Program {

    public static void main(String[] args) {
        Printable printable = createPrintable("Foreign Affairs", false);
        printable.print();

        read(new Book("Java for impatients", "Cay Horstmann"));
        read(new Journal("Java Dayly News"));
    }

    static void read(Printable p) {
        p.print();
    }

    static Printable createPrintable(String name, boolean option) {
        if (option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }

}
