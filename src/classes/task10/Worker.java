package classes.task10;

import java.util.ArrayList;

public class Worker {
    private final String name;                              //имя сотрудника
    private ArrayList<Task> tasks = new ArrayList<>();      //список задач сотрудника

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTasks(Task task) {
        this.tasks.add(task);
    }

    public void deleteTask(int number) {
        int index;
        for (int i = 0; i < this.tasks.size(); i++) {
            if (this.tasks.get(i).getNumber() == number) {
                index = i;
                this.tasks.remove(index);
                System.out.println("Задача " + number + " удалена из списка задач работника");
                System.out.println();
                break;
            }
        }
    }

    public void printWorkerTasks() {
        System.out.println(name + " имеет количество задач: " + this.tasks.size());
        for (Task task : this.tasks) {
            System.out.println("сложность: " + task.getDifficult() + ", описание: " + task.getDescription());
        }
        System.out.println();
    }

    public void printMostCountDifficultTask(ArrayList<Worker> workers) {
        System.out.println("Самое большое кол-во сложных задач у сотрудника: ");
        if (workers.size() == 1) {
            System.out.println(workers.get(0).getName());
        } else {
            Worker mostWorker = null;
            int mostCountDif3 = 0;
            int mostCountDif2 = 0;
            int mostCountDif1 = 0;
            for (Worker worker : workers) {
                int countDif3 = 0;
                int countDif2 = 0;
                int countDif1 = 0;
                // взять сотрудника N и узнать кол-во задач со сложн 3, кол-во задач со сложн 2, кол-во задач со сложн 1
                for (Task task : worker.getTasks()) {       //могу тут и   " : this.task"   указать? без разницы?
                    if (task.getDifficult() == 3) {
                        countDif3++;
                    } else if (task.getDifficult() == 2) {
                        countDif2++;
                    } else if (task.getDifficult() == 1) {
                        countDif1++;
                    }
                }
                // дальше буду идти на убывание по условиям, если сложн 3 будет больше, если сложн 2 будет больше и тп
                if (countDif3 > mostCountDif3) {
                    mostCountDif3 = countDif3;
                    mostCountDif2 = countDif2;
                    mostCountDif1 = countDif1;
                    mostWorker = worker;
                } else if (countDif3 == mostCountDif3 && countDif2 > mostCountDif2) {
                    mostCountDif2 = countDif2;
                    mostCountDif1 = countDif1;
                    mostWorker = worker;
                } else if (countDif3 == mostCountDif3 && countDif2 == mostCountDif2 && countDif1 > mostCountDif1) {
                    mostCountDif1 = countDif2;
                    mostWorker = worker;
                }
            }
            System.out.println(mostWorker.getName());
            System.out.println();
        }
    }
}
