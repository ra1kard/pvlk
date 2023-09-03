package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Илья Хомичев", "Захар Игнатов", "Эльдар Рязанов"));
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        System.out.println(list.contains(str) ? "Сотрудник есть в списке" : "Сотрудник отсутствует в списке");
    }
}
