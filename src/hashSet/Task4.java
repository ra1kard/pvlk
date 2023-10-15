package hashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Task4 {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<>(Arrays.asList("Germany", "France", "Italy", "Belgium"));
        System.out.println(states);
        int count = 0;

        for (String state : states) {
            count++;
            if (count == states.size() / 2 || count == states.size() / 2 + 1) {
                System.out.println(state);
            }
        }
    }
}
