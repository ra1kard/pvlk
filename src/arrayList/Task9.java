package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String longest = "";

        while (!str.equalsIgnoreCase("stop")) {
            list.add(str);
            str = console.nextLine();
        }

        for (String s : list) {
            longest = s.length() > longest.length() ? s : longest;
        }

        System.out.println(longest + " " + longest.length());
    }
}
