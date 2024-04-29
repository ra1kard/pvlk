package oop_inheritance.task24;

import java.time.LocalDate;

public class LiteratoryWork {       //литературное произведение
    private String name;                //название произведения: стихотворения-поэмы и тп
    private String genre;               //жанр произведения: про любовь, войну, дружбу
    private LocalDate year;                 //год публикации произведения

    LiteratoryWork(String name, String genre, int year) {
        this.name = name;
        this.genre = genre;
        this.year = LocalDate.of(year, 1, 1);
    }

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

    public LocalDate getYear() {
        return year;
    }
    public void setYear(LocalDate year) {
        this.year = year;
    }
}
