package classes.task10;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        Worker aleksey = new Worker("Алексей");
        Worker nikolay = new Worker("Николай");
        Worker vasiliy = new Worker("Василий");
        ArrayList<Worker> workers = new ArrayList<>(List.of(aleksey, nikolay, vasiliy));

        Task task1000 = new Task(1000, 3, "Заменить окна в квартире");
        Task task1001 = new Task(1001, 3, "Покраска стен в квартире");
        Task task1002 = new Task(1002, 3, "Выравнивание пола в квартире");
        Task task1003 = new Task(1003, 2, "Установить скрытые двери в комнаты");
        Task task1004 = new Task(1004, 2, "Заменить входную дверь в квартире");
        Task task1005 = new Task(1005, 1, "Установить домофон");

        aleksey.setTasks(task1000);
        nikolay.setTasks(task1001);
        vasiliy.setTasks(task1002);
        aleksey.setTasks(task1003);
        vasiliy.setTasks(task1004);
        vasiliy.setTasks(task1005);

        //вывод всех задач сотрудников
        for (Worker worker : workers) {
            worker.printWorkerTasks(worker.getName());
        }

        //вывод работника с самым большим кол-вом сложных задач
        workers.get(0).printMostCountDifficultTask(workers);    //не понял как мне иначе/лучше отсюда вызвать метод?
                                                                //как выше не мог сделать iter, т.к. надо спис передать

        vasiliy.deleteTask(task1004);
        //вывод всех задач сотрудников
        for (Worker worker : workers) {
            worker.printWorkerTasks(worker.getName());
        }

        //вывод работника с самым большим кол-вом сложных задач
        workers.get(0).printMostCountDifficultTask(workers);
    }

}
