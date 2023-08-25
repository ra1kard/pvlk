package string;

public class Task25_2 {
    public static void main(String[] args) {
        //String str = "Какой хороший день";
        String str = "а бб вв г";
        //String str = "привет мир";
        //String str = "Завтра будет день теплее чем был сегодня";
        System.out.println(str);

        //разобьем на группы в массив
        String[] array = str.split(" ");

        int longest = 0;
        int shortest = array[0].length();
        int longOrder = 0;
        int shortOrder = 0;

        //узнаем длину самого длинного и самого короткого слова
        for (int i = 0; i < array.length; i++) {
            if (longest < array[i].length()) {
                longest = array[i].length();
                longOrder = i;
            }
            if (shortest >= array[i].length()) {
                shortest = array[i].length();
                shortOrder = i;
            }
        }

        System.out.println("longOrder = " + longOrder);
        System.out.println("shortOrder = " + shortOrder);

        for (int i = 0; i < array.length; i++) {
            if (i == longOrder) {
                System.out.print(array[shortOrder] + " ");
            } else if (i == shortOrder) {
                System.out.print(array[longOrder] + " ");
            } else {
                System.out.print(array[i] + " ");
            }
        }

        //1. убрать longest shortest
        //2. поменять в массиве местами
        //3. массив обратно в строку перегнать
    }
}
