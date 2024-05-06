package interfaces.task4;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        Human dima = new Human("Дима", "Деревопадов");
        Human oleg = new Human("Олег", "Солнцепеков");
        HomeAnimal bagirCat = new HomeAnimal("Багира");
        HomeAnimal rayDog = new HomeAnimal("Рэй");
        HomeAnimal krisMouse = new HomeAnimal("Крис");
        Plant cactus = new Plant("Кактус");
        Plant azalia = new Plant("Азалия");
        Plant chrysanthemum = new Plant("Хризантема");

        dima.setHomeAnimal(bagirCat);
        dima.setPlant(cactus);
        dima.setChair(Chair.USUAL);
        dima.setChair(Chair.KIDS);
        oleg.setHomeAnimal(rayDog);
        oleg.setHomeAnimal(krisMouse);
        oleg.setPlant(azalia);
        oleg.setPlant(chrysanthemum);
        oleg.setChair(Chair.SPORT);
        oleg.setChair(Chair.KIDS);

        ArrayList<Human> humanList = new ArrayList<>(List.of(dima, oleg));

        for (Human human : humanList) {
            human.print();
        }

        System.out.println("попробуем setAlive false для животного");
        System.out.println();
        bagirCat.setAlive(false);
        dima.print();

        System.out.println("попробуем setAlive false для растения");
        System.out.println();
        cactus.setAlive(false);
        dima.print();

        System.out.println("попробуем setAlive false для человека");
        System.out.println();
        oleg.print();
        oleg.setAlive(false);
        oleg.print();
    }

}
