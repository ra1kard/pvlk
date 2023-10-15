package hashSet;

import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        HashSet<String> food = new HashSet<>();

        // добавим в список ряд элементов
        food.add("арбуз");
        food.add("банан");
        food.add("вишня");
        food.add("груша");
        food.add("дыня");
        food.add("ежевика");
        food.add("женьшень");
        food.add("земляника");
        food.add("ирис");
        food.add("картофель");

        //вывод всей коллекции в строку
        System.out.println(food);

        //видно, что вставится в рандомное место
        food.add("fri");

        //вывод содержимого, где каждый элемент с новой строки - видно, что порядок изменился
        for (String s : food) {
            System.out.print(s + " ");
        }

    }
}
