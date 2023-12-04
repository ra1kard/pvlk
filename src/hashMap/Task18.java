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
                if (!(arrayStr[0].charAt(j) >= 'a' && arrayStr[0].charAt(j) <= 'z')) {
                    System.out.println("Строка не прошла валидацию: первое слово должно быть английским");
                    strCorrect = false;
                    break;
                }
            }
            if (!(arrayStr[1].charAt(0) == 45)) {
                System.out.println("Строка не прошла валидацию: не указано тире");
                break;
            }
            int count = 2;
            while (count < arrayStr.length) {
                for (int k = 0; k < arrayStr[count].length(); k++) {
                    if (!strCorrect || !(ruSymbols.contains(arrayStr[count].charAt(k)))) {
                    //if (!strCorrect || !(arrayStr[0].charAt(k) >= 'а' && arrayStr[0].charAt(k) <= 'я')) {
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

//вопросы:
//1. почему во втором случае   strCorrect = false    is never used не пойму
//2. как проверить на русские символы? весь инет перерыл, получается как с англ символами по ascii не получается
//   сделал втупую указав весь алфавит в hashSet...

//orange - оранжевый, рыжий, апельсин
//проще взять: пробел тире пробел и сплитовать
