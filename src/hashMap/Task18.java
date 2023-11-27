package hashMap;

import java.util.*;

public class Task18 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        HashSet<Character> ruSymbols = new HashSet<>(Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё',
                'ж', 'з', 'и', 'й', 'к', 'л', 'м',
                'н', 'о', 'п', 'р', 'с', 'т', 'у',
                'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ',
                'ы', 'ь', 'э', 'ю', 'я'));

        Scanner console = new Scanner(System.in);
        System.out.println("Введите кол-во вводимых значений");
        int countInput = console.nextInt();     //кол-во вводимых значений
        console = new Scanner(System.in);       //проинициализируем еще раз

        for (int i = 0; i < countInput; i++) {
            ArrayList<String> arrayValues = new ArrayList<>();
            System.out.println("Введите строку в формате: engWord - ruWord, ruWord");
            String str = console.nextLine();    //вызовем столько раз, сколько указали ранее
            str = str.replace(",", "");
            str = str.toLowerCase();
            String[] arrayStr = str.split(" ");
            boolean strCorrect = true;

            //1. выполнить проверку
            for (int j = 0; j < arrayStr[0].length(); j++) {
                if (!(arrayStr[0].charAt(j) >= 97 && arrayStr[0].charAt(j) <= 122)) {
                    System.out.println("Строка не прошла валидацию: первое слово должно быть английским");
                    strCorrect = false;
                    break;
                }
            }
            if (!strCorrect || !(arrayStr[1].charAt(0) == 45)) {
                System.out.println("Строка не прошла валидацию: не указано тире");
                strCorrect = false;
                break;
            }
            int count = 2;
            while (count < arrayStr.length) {
                for (int k = 0; k < arrayStr[count].length(); k++) {
                    if (!strCorrect || !(ruSymbols.contains(arrayStr[count].charAt(k)))) {
                        System.out.println("Строка не прошла валидацию: третье и последующие слова должно быть русскими");
                        strCorrect = false;
                        break;
                    }
                }
                count++;
            }

            //2. затем первые - положить в key, третий и далее - положить в value текущего ключа
            if (strCorrect) {
                for (int j = 2; j < arrayStr.length; j++) {
                    arrayValues.add(arrayStr[j]);
                }
                map.put(arrayStr[0], arrayValues);
            }

        }

        System.out.println(map);
    }
}

//почему во втором случае   strCorrect = false    is never used не пойму
