package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task4_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 200, 30, 1, 70, 2));
        int maxOrder = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 10 || list.get(i) > 99) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

        for (int i = 0; i < list.size()-1; i++) {
            maxOrder = list.get(i+1) > list.get(maxOrder) ? i+1 : maxOrder;
        }
        System.out.println("Максимальное двухзначное число - " + list.get(maxOrder));
    }
}
//по идее это не самое оптимальное решение, можно построить более сложную логику
//на поиск и сравнивание только двухзначных чисел, оно будет менее ресурсозатратным

//а то сейчас выходит если у нас будет 100 чисел и только два двухзначных числа
//мы будем проделывать лишнюю работу по удалению каждого, а могли бы идти дальше и искать двухзначные

//ищем первое двухзначное Число1
//ищем второе двухзначное Число2
//сравниваем и записыаем рез-т в Число1, начинаем поиск Числа2 и вновь сравниваем (мысль такая)
