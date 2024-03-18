package inheritance.task24;

import java.util.ArrayList;

public class Author {
    private String name;
    private String surname;
    private ArrayList<Poem> poems = new ArrayList<>();          //список поэм, написанных автором
    private ArrayList<Verse> verses = new ArrayList<>();        //список стихов, написанных авторомы


    Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Poem> getPoems() {
        return poems;
    }
    public void setPoems(Poem poems) {
        this.poems.add(poems);
    }

    public ArrayList<Verse> getVerses() {
        return verses;
    }
    public void setVerses(Verse verse) {
        this.verses.add(verse);
    }
}
