package hashMap;

import java.util.Arrays;
import java.util.HashSet;

public class Task18_2 {
    public static void main(String[] args) {
        HashSet<Character> ruSymbols = new HashSet<>(Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё',
                'ж', 'з', 'и', 'й', 'к', 'л', 'м',
                'н', 'о', 'п', 'р', 'с', 'т', 'у',
                'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ',
                'ы', 'ь', 'э', 'ю', 'я'));

        char ch = 's';

        if (ruSymbols.contains(ch)) {
            System.out.println("успех");
        }
    }
}
