package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Илья Хомичев", "Захар Игнатов", "Эльдар Рязанов"));
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        if (list.contains(str)) {
            System.out.println("Сотрудник есть в списке");
        } else {
            System.out.println("Сотрудник отсутствует в списке");
        }
    }
}
