package oop_inheritance.task25;

import java.util.ArrayList;
import java.util.Map;

public class Loader extends Worker {
    private int stamina;          //выносливость, цел число оставшейся выносливости грузчика

    Loader(String name, int stamina) {
        super(name);
        this.stamina = stamina;
    }

    /**
     * уменьшает кол-во выносливости - ОК
     * в зависимости от заданного кол-во разгружаемого товара - ОК
     * разгрузить один товар - потратить 5 выносливости - ОК
     */
    public void load(int countLoad) {
        this.stamina = stamina - countLoad * 5;
    }

    public void printWorkerTasks() {
        System.out.print(super.getName() + " имеет денег " + super.getMoney() + ", ");
        System.out.println("выносливости: " + stamina + " и имеет задачи: ");
        for (Map.Entry<Difficult, ArrayList<Task>> entry : super.getTasks().entrySet()) {
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
        int index = -1;
        for (Difficult difficultCurrent : super.getTasks().keySet()) {
            if (super.getTasks().get(difficultCurrent).contains(task)) {
                index = super.getTasks().get(difficultCurrent).indexOf(task);              //найдем индекс в листе
                super.getTasks().get(difficultCurrent).get(index).setStatus(Status.DONE);  //берем значение и меняем поле статус
                System.out.println(getName() + " " + "выполнил задачу:");
                System.out.println(task.getNumber() + " " + task.getStatus() + " " + task.getDescription());
                super.setMoney(super.getMoney() + super.getTasks().get(difficultCurrent).get(index).getCost());
                super.getTasks().get(difficultCurrent).remove(index);
                break;
            }
        }
        if (index == -1) {
            System.out.println("Задача " + task.getNumber() +
                    " не может быть выполнена, не найдена в списке у Рабочего");
        }
        if (task.getDifficult() == Difficult.HARD__) {
            load(10);
        } else if (task.getDifficult() == Difficult.MIDDLE) {
            load(6);
        } else {
            load(3);
        }
        System.out.println();
    }

}
