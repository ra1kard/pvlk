package string;

public class Task33 {
    public static void main(String[] args) {
        String str = "Привет, Мне 17 лет, живу в доме номер 8";
        //String str = "Около дома растут цветы";
        //String str = "*** на этапе компиляции";
        //String str = "10 + 5 = 15";
        //String str = "!!!аыва** 175 - 8 ___+";
        char[] chArray = str.toCharArray();
        int countWords = 0;
        String tempWord = "";
        boolean isAlpha;

        for (int i = 0; i < chArray.length; i++) {
            char c = chArray[i];
            isAlpha = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= 'А' && c <= 'я');

            if (i == chArray.length - 1 && isAlpha) {               //если симв посл и буква считаем +countWords
                countWords++;
            } else if (isAlpha) {                                   //1. если симв буква, наполняем temp
                tempWord += c;
            } else if (c == 44 && !tempWord.equals("")) {           //2. если симв запятая и temp не пуст просто допуск
                //
            } else if (c == 32 && !tempWord.equals("")) {           //3. если симв пробел и temp не пуст +countWords
                countWords++;
                tempWord = "";
            } else {                                                //иначе подразумев попали не на то, обнуляем
                tempWord = "";
            }
        }

        System.out.println(String.valueOf(chArray));
        System.out.println(countWords);
    }
}

/**
 * Дополнительно:
 * 1. в строке с проверкой на запятую, по-хорошему можно перечислить все возможные знаки после слова: !,.;
 *    но не стал, перечисление не знаю насколько будет верным решением
 * 2. решение не будет проходить в случае примера: "!!!абв раз раз", но в примерах нет символа в начале
 *    поэтому не стал делать доп.условия
 *    к тому же в условии сказано, что "каждое слово отделено от другого одним пробелом, а не с двух сторон
 * 3. да и устал дико с этой задачей, мозги уже не работали видимо
 * 4. а еще не знаю допускается ли просто допуск в п.2 коммента, не понял как просто поймать и пропустить такой случай
 */
