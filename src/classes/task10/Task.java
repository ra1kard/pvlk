package classes.task10;

public class Task {
    private int difficult;          //сложность задачи  1 легкий, 2 средний, 3 сложный
    private String description;     //описание задачи
    private final int number;       //номер задачи

    Task(int number, int difficult, String description) {
        this.difficult = difficult;
        this.description = description;
        this.number = number;
    }

    public int getDifficult() {
        return difficult;
    }
    public void setDifficult(int difficult) {
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

