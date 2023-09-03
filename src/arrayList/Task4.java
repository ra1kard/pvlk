package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 200, 30, 1, 2));
        int maxOrder = 0;

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) >= 10 && list.get(i) <= 99) {
                maxOrder = list.get(i+1) > list.get(maxOrder) ? i+1 : maxOrder;
                System.out.println("хха");
            }
        }
        System.out.println("Максимальное двухзначное число - " + list.get(maxOrder));
    }
}
//по старой схеме не выходит, т.к. мы должны сравнивать из списка только два двухзначных числа
//тут можно по идее можно удалить все не двухзначные и потом сравнить оставшиеся
