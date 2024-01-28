package hashMap;

import java.util.*;

public class Task21_2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        System.out.println("Введите строку:");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        str = str.replace("\"{'users' : ", "");
        str = str.replace("}\"", "");
        System.out.println(str);
        System.out.println();

        String[] arrayStr = str.split("}, \\{");
        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = arrayStr[i].replace("{ ", "");
            arrayStr[i] = arrayStr[i].replace(" }", "");
            arrayStr[i] = arrayStr[i].replace("'", "");
            arrayStr[i] = arrayStr[i].replace("[", "");
            arrayStr[i] = arrayStr[i].replace("]", "");
            arrayStr[i] = arrayStr[i].trim();   //удалим пробелы в начале и в конце
            System.out.println(arrayStr[i]);
        }
        System.out.println();

        for (int i = 0; i < arrayStr.length; i++) {
            for (int j = 0; j < arrayStr[i].length(); j++) {
                if ((   arrayStr[i].charAt(j) >= '0' && arrayStr[i].charAt(j) <= '9')
                        && (arrayStr[i].charAt(j+1) == ',')
                        && (arrayStr[i].charAt(j+2) == ' ')
                        && (arrayStr[i].charAt(j+3) >= '0' && arrayStr[i].charAt(j+3) <= '9')) {
                    arrayStr[i] = arrayStr[i].substring(0, j+1) + "*" + arrayStr[i].substring(j+2);
                }
            }
        }

        /*for (int j = 0; j < arrayStr[0].length(); j++) {
            if ((   arrayStr[0].charAt(j) >= '0' && arrayStr[0].charAt(j) <= '9')
                    && (arrayStr[0].charAt(j+1) == ',')
                    && (arrayStr[0].charAt(j+2) == ' ')
                    && (arrayStr[0].charAt(j+3) >= '0' && arrayStr[0].charAt(j+3) <= '9')) {
                arrayStr[0] = arrayStr[0].substring(0, j+1) + "*" + arrayStr[0].substring(j+2);
            }
        }

        for (int j = 0; j < arrayStr[1].length(); j++) {
            if ((   arrayStr[1].charAt(j) >= '0' && arrayStr[0].charAt(j) <= '9')
                    && (arrayStr[1].charAt(j+1) == ',')
                    && (arrayStr[1].charAt(j+2) == ' ')
                    && (arrayStr[1].charAt(j+3) >= '0' && arrayStr[1].charAt(j+3) <= '9')) {
                arrayStr[1] = arrayStr[1].substring(0, j+1) + "*" + arrayStr[1].substring(j+2);
            }
        }*/

        for (String value : arrayStr) {
            System.out.println(value);
        }
        System.out.println();

        ArrayList<Map<String, String>> list = new ArrayList<>();

        /*for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = arrayStr[i].replace(" ", "");
            System.out.println(arrayStr[i]);
        }*/

        String[] arrayStr2 = arrayStr[0].split(",");
        String[] arrayStr3 = new String[0];
        for (int i = 0; i < arrayStr2.length; i++) {
            arrayStr2[i] = arrayStr2[i].trim();
            System.out.println(arrayStr2[i]);

            arrayStr3 = arrayStr2[i].split(" : ");
        }

        for (String s : arrayStr3) {
            System.out.println(s);
        }

    }
}
