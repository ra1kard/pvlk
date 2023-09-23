package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("привет", "пока"));
        Scanner console = new Scanner(System.in);
        String strUser = console.nextLine();
        boolean rsl = false;

        for (String s : list) {
            if (s.equalsIgnoreCase(strUser)) {
                rsl = true;
                break;
            }
        }

        System.out.println(rsl);
    }
}
