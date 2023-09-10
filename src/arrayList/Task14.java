package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        /*
        Дана коллекция строк, содержащая имена и фамилии студентов.
        Пользователь вводим имя студента.
        Вывести в консоль сколько существует студентов с указанным именем.
         */
        ArrayList<String> list = new ArrayList<>(List.of(
                "Иван Иванов", "Василий Ласточкин", "Анастасия Чулкова",
                "Николай Киселёв", "Анна Семёнова", "Мария Захарова",
                "Елена Горбунова", "Иван Андриенко", "Анна Головкина"
                ));
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

        System.out.println((count > 0) ? count : "Указанного студента нет в списке");
    }
}
