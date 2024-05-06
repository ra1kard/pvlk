package interfaces.task2;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        Printable p1 = new Book("Тысяча сияющих солнц", "Халед Хосени");
        Printable p2 = new Book("Странное путешествие мистера Долдри", "Марк Леви");
        Printable p3 = new Magazine("Семь дней", true);
        Printable p4 = new Magazine("Men's health", false);
        Book p5 = new Book("Похетитель теней", "Марк Леви");

        ArrayList<Printable> arrayList = new ArrayList<>(List.of(p1, p2, p3, p4, p5));

        for (Printable p : arrayList) {
            doPrint(p);
        }

        System.out.println();

        for (Printable p : arrayList) {
            if (p instanceof Book) {
                doPrint(p);
            }
        }
    }

    public static void doPrint(Printable printable) {
        printable.print();
    }

    /**
     * Выводит информацию только о книгах, хранящихся в объекте Printable (используйте instanceof)
     */
    public static void doPrintPrintable(Printable printable) {

    }

}
