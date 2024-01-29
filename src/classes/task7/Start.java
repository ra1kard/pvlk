package classes.task7;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        Human stanislav = new Human("Stanislav", "Ivanov", 32, 800);
        Human boris = new Human("Boris", "Korolev", 36, 1200);
        Human konstantin = new Human("Konstantin", "Marev", 31, 300);
        Human gleb = new Human("Gleb", "Larev", 34, 2400);

        stanislav.addFriend(boris);                             //добавим друга
        printFriendsList(stanislav, stanislav.getFriend());     //посмотрим список друзей

        stanislav.addFriend(konstantin);                        //добавим друга
        printFriendsList(stanislav, stanislav.getFriend());     //посмотрим список друзей

        stanislav.addFriend(gleb);                              //добавим друга
        printFriendsList(stanislav, stanislav.getFriend());     //посмотрим список друзей

        //самый богатый друг
        System.out.println(richest(stanislav.getFriend()).getName() + " - самый богатый друг");
        System.out.println();

        stanislav.delFriend(richest(stanislav.getFriend()));    //удалим самого богатого

        printFriendsList(stanislav, stanislav.getFriend());     //посмотрим список друзей

        //самый молодой друг
        System.out.println(youngest(stanislav.getFriend()).getName() + " - самый молодой друг");
        System.out.println();

        //прибавим год самому молодому
        youngest(stanislav.getFriend()).setAge(youngest(stanislav.getFriend()).getAge() + 1);

        printFriendsList(stanislav, stanislav.getFriend());     //посмотрим список друзей
    }

    public static void printFriendsList(Human human, ArrayList<Human> humanFriendsList) {
        System.out.println("Список друзей " + human.getName() + " " + human.getSurname() + ":"
        );
        for (Human h : humanFriendsList) {
            System.out.println(h.getName() + " " + h.getSurname() + " " + h.getAge() + " " + h.getMoney());
        }
        System.out.println();
    }

    public static Human richest(ArrayList<Human> humanFriendsList) {
        Human humanRichest = null;
        int money = 0;
        if (humanFriendsList.size() != 0) {
            money = humanFriendsList.get(0).getMoney();
        }
        for (Human h : humanFriendsList) {
            if (h.getMoney() > money) {
                humanRichest = h;
            }
        }
        return humanRichest;
    }

    public static Human youngest(ArrayList<Human> humanFriendsList) {
        Human youngest = null;
        int young = Integer.MAX_VALUE;
        for (Human h : humanFriendsList) {
            if (h.getAge() < young) {
                youngest = h;
            }
        }
        return youngest;
    }

}
