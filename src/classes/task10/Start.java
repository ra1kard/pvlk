package classes.task10;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        Worker aleksey = new Worker("Алексей");
        Worker nikolay = new Worker("Николай");
        Worker vasiliy = new Worker("Василий");
        ArrayList<Worker> workers = new ArrayList<>(List.of(aleksey, nikolay, vasiliy));

        aleksey.addTasks(new Task(1000, 3, "Заменить окна в квартире"));
        nikolay.addTasks(new Task(1001, 3, "Покраска стен в квартире"));
        vasiliy.addTasks(new Task(1002, 3, "Выравнивание пола в квартире"));
        aleksey.addTasks(new Task(1003, 2, "Установить скрытые двери в комнаты"));
        vasiliy.addTasks(new Task(1004, 2, "Заменить входную дверь в квартире"));
        vasiliy.addTasks(new Task(1005, 1, "Установить домофон"));
        vasiliy.deleteTask(1004);

        for (Worker worker : workers) {
            worker.printWorkerTasks();
        }

        workers.get(0).printMostCountDifficultTask(workers);

    }

    /**
     * перенести метод сюда
     */
    public static void printMostCountDifficultTask() {

    }

}

//  осталось:
//  1. перенести в этот класс метод printMostCountDifficultTask
//  2. метод кол-во сложных задач переделать - слишком громоздкое решение
//  3. в значениях Enum + ArrayList тасков:

    /*HashMap<Enum, String> map = new HashMap<>(Map.of(
            1, "Первое значение",
            2, "Второе значение",
            3, "Третье значение"
    )
    );*/
