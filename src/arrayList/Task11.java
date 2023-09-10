package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
        Дана коллекция, в которой хранятся машины разных марок.
        Пользователь вводит марку автомобиля, который его интересует.
        Необходимо вывести количество автомобилей заданной марки.
         */
        ArrayList<String> list = new ArrayList<>(List.of("Lexus", "Honda", "Chevrolet", "Chevrolet Niva", "Toyota"));
        Scanner console = new Scanner(System.in);
        String strUser = console.nextLine();
        strUser = strUser.toLowerCase();
        int count = 0;

        for (String s : list) {
            s = s.toLowerCase();
            if (s.contains(strUser)) {
                count++;
            }
        }

        System.out.println(count + " - количество автомобилей заданной марки");
    }
}
