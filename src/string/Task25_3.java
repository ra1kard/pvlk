package string;

public class Task25_3 {
    public static void main(String[] args) {
        String str = "Какой хороший день";
        //String str = "а б вв гг д";
        //String str = "привет мир";
        //String str = "Завтра будет день теплее чем был сегодня";
        System.out.println(str);
        int longOrder = 0;
        int shortOrder = 0;
        String temp;

        //разобьем на группы в массив
        String[] array = str.split(" ");

        // 1. убрать longest shortest
        for (int i = 0; i < array.length - 1; i++) {
            longOrder = array[i+1].length() > array[longOrder].length() ? i+1 : longOrder;
            shortOrder = array[i+1].length() <= array[shortOrder].length() ? i+1 : shortOrder;
        }
        System.out.println(longOrder + " - longOrder");
        System.out.println(shortOrder + " - shortOrder");

        // 2. поменять в массиве местами
        for (int i = 0; i < array.length; i++) {
            if (i == shortOrder || i == longOrder) {
                if (i == shortOrder) {
                    temp = array[shortOrder];
                    array[shortOrder] = array[longOrder];
                    array[longOrder] = temp;
                } else {
                    temp = array[longOrder];
                    array[longOrder] = array[shortOrder];
                    array[shortOrder] = temp;
                }
                i = array.length - 1;           //аналог break :D  (что-то я через while не придумал, оставил)
            }
        }

        // 3. массив обратно в строку перегнать
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                str = array[i] + " ";
            } else if (i == array.length-1) {
                str += array[i];
            } else {
                str += array[i] + " ";
            }
        }
        System.out.println(str);
    }
}
//1. поменять местами без цикла
//2. массив перегнать в строку есть встроенное решение - метод join
