package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Молоко", "Сметана", "Хлеб",
                "Кетчуп", "Майонез", "Конфеты"));

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        boolean available = false;

        for (String s : list) {
            if (s.equalsIgnoreCase(str)) {      //правильнее что с чем сравнивать? или без разницы?
                available = true;
                break;
            }
        }

        System.out.println(available ? str + " есть в наличии" : str + " отсутствует");
    }
}
