package method;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(myMethod("Мне 18"));
        System.out.println(myMethod("125"));
        System.out.println(myMethod("Версия15.0программы"));
    }

    public static int myMethod(String str) {
        char[] chars = str.toCharArray();
        String strNew = "";

        for (char ch : chars) {
            if (!((ch > 48) && (ch <= 57))) {   //если не цифра, добавляем в строку
                return 0;
            }
            strNew += ch;
        }
        return Integer.parseInt(strNew);
    }
}
