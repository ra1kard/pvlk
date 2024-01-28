package classes.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Grass grassArea1 = new Grass(50);
        Grass grassArea2 = new Grass(30);
        Herbivore rabbit = new Herbivore("Rabbit", 4, 10);    //зайцы 4кг
        Herbivore panda = new Herbivore("Panda", 90, 40);    //панды 70-120кг
        Herbivore horse = new Herbivore("Horse", 800, 90);   //лошади 700-1000кг
        List<Herbivore> animals = new ArrayList<>(List.of(rabbit, panda, horse));

        // 1. несколько раз покормить всех животных
        for (Herbivore herbivore : animals) {
            herbivore.eat(grassArea1);
        }

        // представим, что прошло рандомно 1-3 дней (за 1 день животные голодают на 10)
        dayLast(animals);

        // 2. вывести список самых голодных животных
        hungriest(animals);

        // 3. вывести тех животных, которые сыты
        full(animals);

        // 4. накормить определенный вид животных
        eatTypeAnimals(animals, grassArea1);
    }

    public static void dayLast(List<Herbivore> list) {
        Random random = new Random();
        int rnd = random.nextInt(3) + 1;
        System.out.println("Кол-во прошедших дней: " + rnd);
        for (int i = 0; i < rnd; i++) {
            for (Herbivore herbivore : list) {
                herbivore.setSatiety(herbivore.getSatiety()-10);
            }
        }
        for (Herbivore herbivore : list) {
            System.out.print(herbivore.getName() + ": ");
            System.out.println(herbivore.getSatiety() + " satiety сытость животного");
        }
        System.out.println();
    }

    public static void hungriest(List<Herbivore> list) {
        int min = list.get(0).getSatiety();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getSatiety() < min) {
                min = list.get(i).getSatiety();
            }
        }
        System.out.println("Cамые голодные животные: ");
        for (Herbivore herbivore : list) {
            if (herbivore.getSatiety() == min) {
                System.out.println(herbivore.getName());
            }
        }
        System.out.println();
    }

    public static void full(List<Herbivore> list) {
        System.out.println("Сытые животные: ");
        for (Herbivore herbivore : list) {
            if (herbivore.getSatiety() >= 50) {
                System.out.println(herbivore.getName());
            }
        }
        System.out.println();
    }

    public static void eatTypeAnimals(List<Herbivore> list, Grass grass) {
        System.out.println("Введите какой вид травоядных животных хотите накормить:");
        System.out.println("1 - малый размер, 2 - средний размер, 3 - большой размер");
        Scanner console = new Scanner(System.in);
        new Scanner(System.in);
        int x = console.nextInt();
        System.out.println();
        if (x >= 1 && x <= 3) {
            for (Herbivore herbivore : list) {
                if (herbivore.getKind() == x) {
                    herbivore.eat(grass);
                }
            }
        }
    }

}
