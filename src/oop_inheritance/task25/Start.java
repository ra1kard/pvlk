package oop_inheritance.task25;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        /*Worker aleksey = new Worker("Алексей");
        Worker nikolay = new Worker("Николай");
        Worker vasiliy = new Worker("Василий");
        ArrayList<Worker> workers = new ArrayList<>(List.of(aleksey, nikolay, vasiliy));

        aleksey.setTasks(new Task(1000, Difficult.MIDDLE, "Заменить окна в квартире"));
        nikolay.setTasks(new Task(1001, Difficult.HARD__, "Покраска стен в квартире"));
        nikolay.setTasks(new Task(1002, Difficult.HARD__, "Выравнивание пола в квартире"));
        nikolay.setTasks(new Task(1003, Difficult.HARD__, "Установить скрытые двери в комнаты"));
        vasiliy.setTasks(new Task(1004, Difficult.MIDDLE, "Заменить входную дверь в квартире"));
        vasiliy.setTasks(new Task(1005, Difficult.EASY__, "Установить домофоннн"));
        vasiliy.deleteTask(1004);

        //выполнение задачи:
        Task taskTemp = new Task(1006, Difficult.EASY__, "Установить плинтуса");
        nikolay.setTasks(taskTemp);
        for (Worker worker : workers) {
            worker.printWorkerTasks();
        }
        vasiliy.complete(taskTemp);
        nikolay.complete(taskTemp);

        //печать сводной информации
        for (Worker worker : workers) {
            worker.printWorkerTasks();
        }

        printMostCountDifficultTask(workers);
        printMostCostTasks(workers);
        whoWorkerWithoutTasks(workers);*/



        Driver ronaldo = new Driver("Роналду", new Car(Brand.BUGATTI, 100, 90, 20));
        Driver messi = new Driver("Месси", new Car(Brand.FORD, 100, 70, 10));
        Driver kroos = new Driver("Кроос", new Car(Brand.VOLKSWAGEN, 100, 40, 110));
        Loader beckham = new Loader("Бекхем", 60);
        Loader zidan = new Loader("Зидан", 80);
        Loader figo = new Loader("Фигу", 100);

        ArrayList<Driver> drivers = new ArrayList<>(List.of(ronaldo, messi, kroos));
        ArrayList<Loader> loaders = new ArrayList<>(List.of(beckham, zidan, figo));

        ronaldo.setTasks(new Task(2000, Difficult.HARD__, "Отвезти сб Португалии в Китай"));
        messi.setTasks(new Task(2001, Difficult.MIDDLE, "Отвезти сб Аргентины в США"));
        kroos.setTasks(new Task(2002, Difficult.EASY__, "Отвезти сб Германии в Польшу"));
        beckham.setTasks(new Task(2003, Difficult.HARD__, "Разгрузить новые штанги"));
        zidan.setTasks(new Task(2004, Difficult.MIDDLE, "Разгрузить сетки и мячи"));
        figo.setTasks(new Task(2005, Difficult.EASY__, "Разгрузить форму"));




        //печать сводной информации Водители
        for (Driver driver : drivers) {
            driver.printWorkerTasks();
        }

        //совершая определенное действие (завершая задачу) ВОДИТЕЛЬ вынужден заправлять авто
        ronaldo.complete(ronaldo.getTasks().get(Difficult.HARD__).get(0));
        messi.complete(messi.getTasks().get(Difficult.MIDDLE).get(0));
        kroos.complete(kroos.getTasks().get(Difficult.EASY__).get(0));

        //печать сводной информации Водители
        for (Driver driver : drivers) {
            driver.printWorkerTasks();
        }





        /*//печать сводной информации Грузчики
        for (Loader loader : loaders) {
            loader.printWorkerTasks();
        }

        //совершая определенное действие (завершая задачу) ГРУЗЧИК теряет выносливость
        beckham.complete(beckham.getTasks().get(Difficult.HARD__).get(0));
        zidan.complete(zidan.getTasks().get(Difficult.MIDDLE).get(0));
        figo.complete(figo.getTasks().get(Difficult.EASY__).get(0));

        //печать сводной информации Грузчики
        for (Loader loader : loaders) {
            loader.printWorkerTasks();
        }*/

    }

    public static void printMostCountDifficultTask(ArrayList<Worker> workers) {
        System.out.print("Самое большое кол-во сложных задач у сотрудника: ");
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
    
    public static void printMostCostTasks(ArrayList<Worker> workers) {
        int cost = 0;
        Worker workerMostCost = null;
        for (Worker worker : workers) {
            if (worker.getCostAllTask() > cost) {
                cost = worker.getCostAllTask();
                workerMostCost = worker;
            }
        }
        assert workerMostCost != null;
        System.out.println("Рабочий с наибольшей стоимостью задач: " + workerMostCost.getName());
        System.out.println();
    }

    public static void whoWorkerWithoutTasks(ArrayList<Worker> workers) {
        ArrayList<Worker> workersWithoutTasks = new ArrayList<>();
        for (Worker worker : workers) {
            int count = 0;
            for (Difficult difficultCurrent : worker.getTasks().keySet()) {
                if (worker.getTasks().get(difficultCurrent).size() != 0) {
                    count++;
                }
            }
            if (count == 0) {
                workersWithoutTasks.add(worker);
            }
        }
        if (workersWithoutTasks.size() > 0) {
            System.out.println("Список сотрудников без задач:");
            for (Worker workersWithoutTask : workersWithoutTasks) {
                System.out.println(workersWithoutTask.getName());
            }
        } else {
            System.out.println("Сотрудников без задач не нашлось");
        }
        System.out.println();
    }

}
