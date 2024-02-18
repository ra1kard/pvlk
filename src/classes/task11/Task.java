package classes.task11;

public class Task {
    private Difficult difficult;    //сложность задачи  1 легкий, 2 средний, 3 сложный
    private String description;     //описание задачи
    private final int number;       //номер задачи

    Task(int number, Difficult difficult, String description) {
        this.difficult = difficult;
        this.description = description;
        this.number = number;
    }

    public Difficult getDifficult() {
        return difficult;
    }
    public void setDifficult(Difficult difficult) {
        this.difficult = difficult;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

}
