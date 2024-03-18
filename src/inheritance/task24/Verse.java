package inheritance.task24;

public class Verse extends LiteratoryWork { //стихи
    private String versification;           //стихосложение (хорей, ямб, дактиль и тд)
    private Short quantityQuatrain;         //количество четверостиший

    Verse(String name, String genre, Short year, String versification, Short quantityQuatrain) {
        super.setName(name);
        super.setGenre(genre);
        super.setYear(year);
        this.versification = versification;
        this.quantityQuatrain = quantityQuatrain;
    }

    public String getVersification() {
        return versification;
    }

    public Short getQuantityQuatrain() {
        return quantityQuatrain;
    }
}
