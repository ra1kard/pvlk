package classes.task2;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person());
        list.add(new Person("Станислав", "Иванов", 32));
        list.add(new Person("Кристина", "Крутова", 35));
        list.add(new Person("Афродита", "Поподопулос", 46));
        list.add(new Person("Настасья", "Креймер", 27));

        youngest(list);
        System.out.println("Самый молодой - " + list.get(youngest(list)).getSurname());

        System.out.println("Самый старый - " + list.get(oldest(list)).getSurname());

        System.out.println("У кого фамилии на \"К\": ");
        for (Person person : surnameK(list)) {
            System.out.println(person.getSurname());
        }

        list.get(1).move(10500);
        list.get(2).talk("всех приветствую, меня зовут - " + list.get(2).getName());
    }

    //самый молодой
    public static int youngest(ArrayList<Person> list) {
        int youngest = Integer.MAX_VALUE;
        int youngestIndex = 0;
        /*for (Person person : list) {
            if (person.getAge() < youngest) {
                youngest = person.getAge();
            }
        }*/
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() < youngest) {
                youngest = list.get(i).getAge();
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    //самый старый
    public static int oldest(ArrayList<Person> list) {
        int oldest = list.get(0).getAge();
        int oldestIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() > oldest) {
                oldest = list.get(i).getAge();
                oldestIndex = i;
            }
        }
        return oldestIndex;
    }

    //все люди с фамилией на букву "К"
    public static List<Person> surnameK(ArrayList<Person> list) {
        ArrayList<Person> listSurnameK = new ArrayList<>();

        for (Person person : list) {
            if (person.getSurname().charAt(0) == 'К') {
                listSurnameK.add(person);
            }
        }

        return listSurnameK;
    }

}
