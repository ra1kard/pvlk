package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Молоко", "Сметана", "Хлеб",
                "Кетчуп", "Майонез", "Конфеты"));

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        if (list.contains(str)) {
            System.out.println(str + " есть в наличии");
        } else {
            System.out.println(str + " отсутствует");
        }
    }
}
//вариант рабочий относительно задания, но в нем не учитывается регистр
