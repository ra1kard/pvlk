package inheritance.task24;

public class Poem extends LiteratoryWork {  //поэмы
    private Short quantityPage;             //количество страниц

    Poem(String name, String genre, Short year, Short quantityPage) {
        super.setName(name);
        super.setGenre(genre);
        super.setYear(year);
        this.quantityPage = quantityPage;
    }

    public Short getQuantityPage() {
        return quantityPage;
    }
}
