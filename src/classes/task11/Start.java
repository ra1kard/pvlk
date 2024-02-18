package classes.task11;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        Worker aleksey = new Worker("Алексей");
        Worker nikolay = new Worker("Николай");
        Worker vasiliy = new Worker("Василий");
        ArrayList<Worker> workers = new ArrayList<>(List.of(aleksey, nikolay, vasiliy));

        aleksey.setTasks(new Task(1000, Difficult.MIDDLE, "Заменить окна в квартире"));
        aleksey.setTasks(new Task(1001, Difficult.HARD__, "Покраска стен в квартире"));
        vasiliy.setTasks(new Task(1002, Difficult.HARD__, "Выравнивание пола в квартире"));
        nikolay.setTasks(new Task(1003, Difficult.HARD__, "Установить скрытые двери в комнаты"));
        vasiliy.setTasks(new Task(1004, Difficult.MIDDLE, "Заменить входную дверь в квартире"));
        vasiliy.setTasks(new Task(1005, Difficult.EASY__, "Установить домофон"));
        vasiliy.deleteTask(1004);

        for (Worker worker : workers) {
            worker.printWorkerTasks();
        }

        printMostCountDifficultTask(workers);
    }

    public static void printMostCountDifficultTask(ArrayList<Worker> workers) {
        System.out.println("Самое большое кол-во сложных задач у сотрудника: ");
        Worker workerHasMostDiffTasks = null;
        int mostCount = 0;

        for (Worker worker : workers) {
            //сначала сверим количество hard задач
            if (
                    countDif(worker, Difficult.HARD__) > mostCount) {
                mostCount = countDif(worker, Difficult.HARD__);
                workerHasMostDiffTasks = worker;
            } else if (
                    countDif(worker, Difficult.HARD__) == mostCount &&
                    countDif(worker, Difficult.MIDDLE) > mostCount) {
                mostCount = countDif(worker, Difficult.MIDDLE);
                workerHasMostDiffTasks = worker;
            } else if (
                    countDif(worker, Difficult.HARD__) == mostCount &&
                    countDif(worker, Difficult.MIDDLE) == mostCount &&
                    countDif(worker, Difficult.EASY__) > mostCount) {
                mostCount = countDif(worker, Difficult.EASY__);
                workerHasMostDiffTasks = worker;
            }
        }
        if (workerHasMostDiffTasks != null) {
            System.out.println(workerHasMostDiffTasks.getName());
        }
    }

    public static int countDif(Worker worker, Difficult difficult) {
        return worker.getTasks().get(difficult).size();
    }

}

//  осталось:
//  1+ перенести в этот класс метод printMostCountDifficultTask
//  2+ метод кол-во сложных задач переделать - слишком громоздкое решение
//  3+ в значениях Enum + ArrayList тасков:
    /*
    HashMap<Enum, String> map = new HashMap<>(Map.of(
            1, "Первое значение",
            2, "Второе значение",
            3, "Третье значение"
    )
    );*/