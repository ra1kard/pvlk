package inheritance.task24;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        Author pasternak = new Author("Борис", "Пастернак");
        Author akhmatova = new Author("Анна", "Ахматова");
        Author nekrasov = new Author("Николай", "Некрасов");
        ArrayList<Author> authors = new ArrayList<>();

        pasternak.setVerses(new Verse(
                "Любить иных, тяжелый крест",
                "любовь",
                1931,
                "хорей",
                (short) 8
        ));

        pasternak.setVerses(new Verse(
                "Давай ронять слова…",
                "дружба",
                1917,
                "ямб",
                (short) 4
        ));

        akhmatova.setVerses(new Verse(
                "Тот август, как желтое пламя…",
                "война",
                1915,
                "дактиль",
                (short) 4
        ));

        akhmatova.setVerses(new Verse(
                "Я не любви твоей прошу…",
                "любовь",
                1915,
                "дактиль",
                (short) 6
        ));

        nekrasov.setVerses(new Verse(
                "Я не люблю иронии твоей…",
                "любовь",
                1855,
                "ямб",
                (short) 20
        ));

        nekrasov.setPoems(new Poem(
                "Саша",
                "любовь",
                1855,
                (short) 12
        ));

        nekrasov.setPoems(new Poem(
                "Тишина",
                "война",
                1856,
                (short) 12
        ));

        authors.add(pasternak);
        authors.add(akhmatova);
        authors.add(nekrasov);

        printAuthorsLiteratoryWorkAll(authors);
        printAuthorMoreLiteratoryWork(authors);
        printYamb(authors);
        printLove(authors);
        printWar(authors);
    }

    /**
     * печать всех авторов и их произведений
     */
    public static void printAuthorsLiteratoryWorkAll(ArrayList<Author> authors) {
        for (Author author : authors) {
            System.out.println(author.getName() + " " + author.getSurname());

            if (author.getVerses().size() != 0) {
                System.out.println("---Стихи---");
                for (Verse verse : author.getVerses()) {
                    System.out.print(verse.getName() + " //");
                    System.out.println("жанр: " + verse.getGenre() + ", "
                            + verse.getVersification() + " (" + verse.getYear() + ") ");
                }
            }

            if (author.getPoems().size() != 0) {
                System.out.println("---Поэмы---");
                for (Poem poem : author.getPoems()) {
                    System.out.print(poem.getName()  + " //");
                    System.out.println("жанр: " + poem.getGenre() + " (" + poem.getYear() + ") ");
                }
            }
            System.out.println();
        }
    }

    /**
     * печать фамилии автора, у которого больше всего произведений
     */
    public static void printAuthorMoreLiteratoryWork(ArrayList<Author> authors) {
        int tempCount = 0; 
        Author tempAuthor = null;
        
        for (Author author : authors) {
            if (author.getPoems().size() + author.getVerses().size() > tempCount) {
                tempCount = author.getPoems().size() + author.getVerses().size();
                tempAuthor = author;
            }
        }
        System.out.println("Больше всего произведений у автора: " + tempAuthor.getSurname());
        System.out.println();
    }

    /**
     * все стихотворения с ямбом
     */
    public static void printYamb(ArrayList<Author> authors) {
        for (Author author : authors) {
            for (Verse verse : author.getVerses()) {
                if (verse.getVersification().equalsIgnoreCase("ямб")) {
                    System.out.println("Стихотворение с ямбом: " + verse.getName() + " (" + author.getSurname() + ")");
                }
            }
        }
        System.out.println();
    }

    /**
     * все произведения про любовь
     */
    public static void printLove(ArrayList<Author> authors) {
        for (Author author : authors) {
            for (Verse verse : author.getVerses()) {
                if (verse.getGenre().equalsIgnoreCase("любовь")) {
                    System.out.println("Произведение про любовь: " + verse.getName() + " (" + author.getSurname() + ")");
                }
            }
            for (Poem poem : author.getPoems()) {
                if (poem.getGenre().equalsIgnoreCase("любовь")) {
                    System.out.println("Произведение про любовь: " + poem.getName() + " (" + author.getSurname() + ")");
                }
            }
        }
        System.out.println();
    }

    /**
     * инфо об авторе, у которого больше всего произведений про войну
     */
    public static void printWar(ArrayList<Author> authors) {
        int tempCount = -1;
        ArrayList<Author> tempAuthor = new ArrayList<>();

        for (Author author : authors) {
            int tempCountPoem = -1;
            int tempCountVerse = -1;

            for (Poem poem : author.getPoems()) {
                if (poem.getGenre().equalsIgnoreCase("война")) {
                    tempCountPoem++;
                }
            }
            for (Verse verse : author.getVerses()) {
                if (verse.getGenre().equalsIgnoreCase("война")) {
                    tempCountVerse++;
                }
            }

            if (tempCountPoem + tempCountVerse > tempCount) {
                tempAuthor = new ArrayList<>();
                tempAuthor.add(author);
            } else if (tempCountPoem + tempCountVerse >= tempCount) {
                tempAuthor.add(author);
            }
        }

        if (tempAuthor.size() != 0) {
            System.out.println("Больше всего произведений про войну у авторов: ");
            for (Author author : tempAuthor) {
                System.out.println(author.getSurname());
            }

            System.out.println("");
        }
    }

}
