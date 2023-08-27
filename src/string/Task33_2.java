package string;

public class Task33_2 {
    public static void main(String[] args) {
        String str = "дом, номер 8s";
        //String str = "Привет, Мне 17 лет, живу в доме номер 8";
        //String str = "Около дома растут цветы";
        //String str = "*** на этапе компиляции";
        //String str = "10 + 5 = 15";
        //String str = "!!!аыва** 175 - 8 ___+";
        int countWords = 0;
        boolean isAlpha = false;

        //уберем запятые
        while (str.contains(",")) {
            int index = str.indexOf(",");
            str = str.substring(0, index) + str.substring(index+1);
        }
        System.out.println(str);

        //разделим учитывая пробелы
        String[] arrayString = str.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("значение - " + i + ": " +  arrayString[i]);
        }

        //проверим все в одном цикле
        for (String strX : arrayString) {                   //поместим первое значение в стринг
            char[] chArrayX = strX.toCharArray();           //разобъем первое значение посимвольно
            for (char c : chArrayX) {                       //пробежимся по первому слову
                isAlpha = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= 'А' && c <= 'я');
                if (!isAlpha) {
                    break;
                }
            }
            if (isAlpha) {
                countWords++;
                isAlpha = false;
            }
        }
        System.out.println("кол-во слов = " + countWords);
    }
}
