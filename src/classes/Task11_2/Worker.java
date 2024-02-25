package classes.Task11_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Worker {
    private final String name;                                                      //имя сотрудника
    private int money = 0;                                                          //личные денежные средства
    private HashMap<Difficult, ArrayList<Task>> tasks = new HashMap<>(Map.of(       //список задач сотр СТАЛ в виде МАПЫ
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

    public HashMap<Difficult, ArrayList<Task>> getTasks() {
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
        for (Map.Entry<Difficult, ArrayList<Task>> entry : tasks.entrySet()) {               //заходим в мап
            int count = 0;
            //entry.getValue() - это просто arraylist, в котором (таск1 таск2 таск3)
            for (Task task : entry.getValue()) {                                        //заходим в arraylist
                count++;
                if (task.getNumber() == number) {
                    entry.getValue().remove(task);
                    System.out.println("Задача " + number + " удалена из списка задач работника");
                    System.out.println();
                    break;
                }
            }
        }
    }

    public int getCostAllTask() {
        int sum = 0;
        for (Map.Entry<Difficult, ArrayList<Task>> entry : tasks.entrySet()) {
            for (Task task : entry.getValue()) {                                        //заходим в arraylist
                sum += task.getCost();
            }
        }
        return sum;
    }

    public void printWorkerTasks() {
        System.out.println(name + " имеет денег " + money + " и имеет задачи: ");
        for (Map.Entry<Difficult, ArrayList<Task>> entry : tasks.entrySet()) {
            System.out.println("------Сложностью " + entry.getKey().name() + " количество: " + entry.getValue().size());
            int count = 0;
            for (Task task : entry.getValue()) {
                count++;
                System.out.println(count + ". " +
                                task.getNumber() + " " +
                                task.getStatus().name() + " " +
                                task.getDescription());
            }
        }
        System.out.println("Стоимость всех задач: " + getCostAllTask());
        System.out.println();
    }

    //worker теперь способен заверашть определенную задачу - завершение конкретной работы
    public void complete(Task task) {
        int index;
        if (tasks.get(Difficult.EASY__).contains(task)) {
            index = tasks.get(Difficult.EASY__).indexOf(task);              //найдем индекс в листе
            tasks.get(Difficult.EASY__).get(index).setStatus(Status.DONE);  //берем значение и меняем поле статус
            System.out.println(getName() + " " + "выполнил EASY__ задачу:");
            System.out.println(task.getNumber() + " " + task.getStatus() + " " + task.getDescription());
            money += tasks.get(Difficult.EASY__).get(index).getCost();
            tasks.get(Difficult.EASY__).remove(index);
        } else if (tasks.get(Difficult.MIDDLE).contains(task)) {
            index = tasks.get(Difficult.MIDDLE).indexOf(task);              //найдем индекс в листе
            tasks.get(Difficult.MIDDLE).get(index).setStatus(Status.DONE);  //берем значение и меняем поле статус
            System.out.println(getName() + " " + "выполнил MIDDLE задачу:");
            System.out.println(task.getNumber() + " " + task.getStatus() + " " + task.getDescription());
            money += tasks.get(Difficult.MIDDLE).get(index).getCost();
            tasks.get(Difficult.MIDDLE).remove(index);
        } else if (tasks.get(Difficult.HARD__).contains(task)) {
            index = tasks.get(Difficult.HARD__).indexOf(task);              //найдем индекс в листе
            tasks.get(Difficult.HARD__).get(index).setStatus(Status.DONE);  //берем значение и меняем поле статус
            System.out.println(getName() + " " + "выполнил HARD__ задачу:");
            System.out.println(task.getNumber() + " " + task.getStatus() + " " + task.getDescription());
            money += tasks.get(Difficult.HARD__).get(index).getCost();
            tasks.get(Difficult.HARD__).remove(index);
        } else {
            System.out.println("Задача " + task.getNumber() +
                    " не может быть выполнена, не найдена в списке у Рабочего");
        }
        System.out.println();
        //можно через цикл сократить еще код, перебирая ключ и значение, ключ и значение...
    }

}
//доделать:
// 1. сomplete переделать в цикл норм
// 2. убрать вывод из методов? (опционально, можно для след задач это взять за правило)
// 3. доделать остальные условия
