package classes.task11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Worker {
    private final String name;                                              //имя сотрудника
    private HashMap<Enum, ArrayList<Task>> tasks = new HashMap<>(Map.of(    //список задач сотр СТАЛ в виде МАПЫ
            Difficult.EASY__, new ArrayList<>(),
            Difficult.MIDDLE, new ArrayList<>(),
            Difficult.HARD__, new ArrayList<>())
    );

    Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashMap<Enum, ArrayList<Task>> getTasks() {
        return tasks;
    }
    public void setTasks(Task task) {
        if (task.getDifficult() == Difficult.EASY__) {
            tasks.get(Difficult.EASY__).add(task);      //Получение значения по ключу (get), то
        } else if (task.getDifficult() == Difficult.MIDDLE) {
            tasks.get(Difficult.MIDDLE).add(task);
        } else {
            tasks.get(Difficult.HARD__).add(task);      //берем мап, по ключу доступ к значению = list.add
        }
    }

    public void deleteTask(int number) {
        for (Map.Entry<Enum, ArrayList<Task>> entry : tasks.entrySet()) {               //заходим в мап
            int count = 0;
            //entry.getValue() - это просто arraylist, в котором (таск1 таск2 таск3)
            for (Task task : entry.getValue()) {                                        //заходим в arraylist
                count++;
                if (task.getNumber() == number) {
                    entry.getValue().remove(task);
                    break;
                }
            }
        }
    }

    public void printWorkerTasks() {
        System.out.println(name + " имеет задачи: ");
        for (Map.Entry<Enum, ArrayList<Task>> entry : tasks.entrySet()) {
            System.out.println("------Сложностью " + entry.getKey().name() + " количество: " + entry.getValue().size());
            int count = 0;
            for (Task task : entry.getValue()) {
                count++;
                System.out.println(count + ". " + task.getNumber() + " " + task.getDescription());
            }
        }
        System.out.println();
    }
}
