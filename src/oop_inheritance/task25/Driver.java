package oop_inheritance.task25;

import java.util.ArrayList;
import java.util.Map;

public class Driver extends Worker {
    private Car car;

    Driver(String name, Car car) {
        super(name);
        this.car = car;
    }

    /**
     * заправить авто - ????
     * стоимость литра бензина 5р - ???? (1л = 5км, 2л = 10км)
     * нельзя заправить литров больше, чем есть в топливном баке - ????
     * стоимость заправка не должна превышать кол-во имеющихся средств у водителя - ????
     */
    public void refuel(int litres) {
        car.setRemainingFuel(litres);
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
            refuel(40);
        } else if (task.getDifficult() == Difficult.MIDDLE) {
            refuel(20);
        } else {
            refuel(10);
        }
        System.out.println();
    }

    public void printWorkerTasks() {
        System.out.print(super.getName() + " имеет денег " + super.getMoney() + ", ");
        System.out.println("бензина: " + car.getRemainingFuel() + " и имеет задачи: ");
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

}
