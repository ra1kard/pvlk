package interfaces.task5;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        CleaningCompany moon4 = new CleaningCompany("КлинЛаб");

        Room room1 = new Room(20, LevelPollution.MIDDLE);
        Room room2 = new Room(15, LevelPollution.HARD);
        Cabinet cabinet1 = new Cabinet(10, LevelPollution.EASY);
        Cabinet cabinet2 = new Cabinet(10, LevelPollution.MIDDLE);
        ArrayList<Cleanupable> arrayListClean = new ArrayList<>(List.of(room1, room2, cabinet1, cabinet2));

        Window window1 = new Window(15, true, 4, 4);
        Window window2 = new Window(15, false, 4, 6);
        Cookware cookware = new Cookware();
        Table table = new Table(2);
        Door door = new Door();
        ArrayList<Washable> arrayListWash = new ArrayList<>(List.of(window1, window2, cookware, table, door));

        /*System.out.println(moon4.cleanupItem(room1));
        System.out.println(moon4.cleanupItem(room2));
        System.out.println(moon4.cleanupItem(cabinet1));
        System.out.println(moon4.cleanupItem(cabinet2));
        System.out.println();
        System.out.println(moon4.washItem(window1));
        System.out.println(moon4.washItem(window2));
        System.out.println(moon4.washItem(cookware));
        System.out.println(moon4.washItem(table));
        System.out.println(moon4.washItem(door));
        System.out.println();*/

        moon4.order(arrayListClean, arrayListWash);
    }

}
