package inheritance.task24;

public class LiteratoryWork {       //литературное произведение
    private String name;                //название произведения: стихотворения-поэмы и тп
    private String genre;               //жанр произведения: про любовь, войну, дружбу
    private Short year;                 //год публикации произведения

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Short getYear() {
        return year;
    }
    public void setYear(Short year) {
        this.year = year;
    }
}
