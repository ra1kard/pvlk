package hashMap;

public class Task21_3 {
    public static void main(String[] args) {
        /*String str = "привет";      // привет
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='и' && str.charAt(i+1)=='в') {
                str = str.substring(0, i) + "*" + str.substring(i+1);
            }
        }
        System.out.println(str);    // пр*вет
        System.out.println();*/

        //String newStr = "при 3, вет";      // привет
        String newStr = "Фамилия : Ивашин, Предмет : Математика, Оценки на уроке : 3, 2, 4, 4, 3, 4, 3, 5, 4, 4, Оценки за контрольные : 3, 3, 4, 5, 4, 4, 3, 5, Преподаватель : Петрушина";      // привет
        for (int i = 0; i < newStr.length(); i++) {
            if ((newStr.charAt(i) >= '0' && newStr.charAt(i) <= '9') && (newStr.charAt(i+1) == ',')) {
                newStr = newStr.substring(0, i+1) + "*" + newStr.substring(i+2);
            }
        }
        System.out.println(newStr);
    }
}
