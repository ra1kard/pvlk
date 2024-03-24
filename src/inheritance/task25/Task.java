package inheritance.task25;

public class Task {
    private Difficult difficult;    //сложность задачи  1 легкий, 2 средний, 3 сложный
    private String description;     //описание задачи
    private final int number;       //номер задачи
    private int cost;               //стоимость привязана к сложн: для изи 3, middle 8, hard 13 SP (с гет, без сеттера)
    private Status status;          //статус задачи

    Task(int number, Difficult difficult, String description) {
        this.difficult = difficult;
        this.description = description;
        this.number = number;
        this.status = Status.OPEN;
        if (difficult == Difficult.HARD__) {
            cost = 130;
        } else if (difficult == Difficult.MIDDLE) {
            cost = 80;
        } else {
            cost = 30;
        }
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

    public int getCost() {
        return cost;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

}
