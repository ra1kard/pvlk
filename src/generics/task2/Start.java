package generics.task2;

import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {
        Snake snake1 = new Snake("snake1", 1);
        Snake snake2 = new Snake("snake2", 2);
        Snake snake3 = new Snake("snake3", 3);
        Dolphin dolphin1 = new Dolphin("dolphin1", 1);
        Dolphin dolphin2 = new Dolphin("dolphin2", 2);
        Dolphin dolphin3 = new Dolphin("dolphin3", 3);
        Dolphin dolphin4 = new Dolphin("dolphin4", 4);
        Bear bear1 = new Bear("bear1", 1);
        Bear bear2 = new Bear("bear2", 2);

        ArrayList<String> arrayList = new ArrayList<>();
        Cage<Snake> cage1 = new Cage(2, 11);
        Cage<Dolphin> cage2 = new Cage(3, 12);
        Cage<Bear> cage3 = new Cage(1, 13);
        Cage<Dolphin> cage4 = new Cage(10, 14);

        /**
         * Показ общего функционала (добавление удаление из клетки)
         */
        System.out.println("------------Показ общего функционала (добавление-удаление из клетки)------------");
        System.out.println();
        cage1.addAnimal(snake1);
        //cage1.addAnimal(dolphin1); //сразу ошибка на уровне компиляции, у нас уже cage1 исп тип "змея", а не "дельфин"
        cage1.addAnimal(snake2);
        cage1.addAnimal(snake3);
        cage1.printAnimalsAdded();

        cage2.addAnimal(dolphin1);
        cage2.addAnimal(dolphin2);
        cage2.addAnimal(dolphin3);
        cage2.addAnimal(dolphin4);
        cage2.printAnimalsAdded();

        System.out.println("самый молодой возраст у " + cage2.getYoungestAnimal().getName()
                + " = " + cage2.getYoungestAnimal().getAge());
        System.out.println("самый большой возраст у " + cage2.getOldestAnimal().getName()
                + " = " + cage2.getOldestAnimal().getAge());
        System.out.println();

        cage2.takeOutAnimal("dolphin2");
        cage2.printAnimalsAdded();

        cage3.addAnimal(bear1);
        cage3.addAnimal(bear2);
        cage3.printAnimalsAdded();

        cage4.printAnimalsAdded();
        cage2.transferAnimal("dolphin3", cage4);
        cage2.printAnimalsAdded();
        cage4.printAnimalsAdded();

        cage2.transferAnimal("dolphin1", cage4);
        cage2.printAnimalsAdded();
        cage4.printAnimalsAdded();

        /**
         * В двух разных клетках поменять местами самое старое и самое молодое животное
         */
        System.out.println("------------В двух разных клетках поменять местами самое старое и самое молодое животное------------");
        System.out.println();
        Cage<Snake> cage20 = new Cage(3, 20);
        Cage<Dolphin> cage30 = new Cage(3, 30);
        Cage<Bear> cage40 = new Cage(3, 40);
        Cage<Snake> cage50 = new Cage(3, 50);

        Snake snake101 = new Snake("snake101", 1);
        Snake snake102 = new Snake("snake102", 2);
        Snake snake103 = new Snake("snake103", 3);
        Snake snake104 = new Snake("snake104", 4);

        cage20.addAnimal(snake101);
        cage20.addAnimal(snake102);
        cage50.addAnimal(snake103);
        cage50.addAnimal(snake104);

        cage20.printAnimalsAdded();
        cage30.printAnimalsAdded();
        cage40.printAnimalsAdded();
        cage50.printAnimalsAdded();

        changeAnimalYoungestAndOldest(cage20, cage50);
    }

    public static void changeAnimalYoungestAndOldest(Cage cage1, Cage cage2) {
        System.out.println("---Смена местами самого молодого и самого старого---");
        cage1.printAnimalsAdded();
        cage2.printAnimalsAdded();
        cage1.transferAnimal(cage1.getYoungestAnimal().getName(), cage2);
        cage2.transferAnimal(cage2.getOldestAnimal().getName(), cage1);
        cage1.printAnimalsAdded();
        cage2.printAnimalsAdded();
    }

}
