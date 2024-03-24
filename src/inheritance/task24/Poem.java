package inheritance.task24;

public class Poem extends LiteratoryWork {  //поэмы
    private Short quantityPage;             //количество страниц

    Poem(String name, String genre, int year, Short quantityPage) {
        super(name, genre, year);
        this.quantityPage = quantityPage;
    }

    public Short getQuantityPage() {
        return quantityPage;
    }
}
