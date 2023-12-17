package method;

import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("доход", "мясо", "мадам"));
        //ArrayList<String> list = new ArrayList<>(List.of("сало", "мыло", "око"));
        //ArrayList<String> list = new ArrayList<>(List.of("Крупицы", "кровь", "морковь"));
        ArrayList<String> listNew = new ArrayList<>();
        int indexMax = -1;
        int countLetter = 0;

        for (int i = 0; i < list.size(); i++) {
            if (biggerLetterA(list.get(i)) > 0 && biggerLetterA(list.get(i)) > countLetter) {
                indexMax = i;
                countLetter = biggerLetterA(list.get(i));
            }
        }
        if (indexMax > -1) {
            listNew.add(list.get(indexMax));
        }
        System.out.println(listNew);
    }

    public static int biggerLetterA(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (ch == 'а') {
                count++;
            }
        }
        return count;
    }
}
