package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task26_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 15, 6, -8, 41, 9, 16, -5, 0));
        //ArrayList<Integer> list = new ArrayList<>(List.of(7, 3, 5));
        ArrayList<Integer> listLowest = new ArrayList<>();
        ArrayList<Integer> listBiggest = new ArrayList<>();
        System.out.println(list + " - исходный лист");

        for (int j = 0; j < list.size(); j++) {
            int lowest = Integer.MAX_VALUE;
            for (Integer integer : list) {
                if (!listLowest.contains(integer) && integer < lowest) {
                    lowest = integer;
                }
            }
            listLowest.add(lowest);
        }

        //докинем в обратном порядке listBiggest
        for (int i = listLowest.size()-1; i >= 0; i--) {
            listBiggest.add(listLowest.get(i));
        }

        System.out.println(listLowest);
        System.out.println(listBiggest);
    }
}
//доделать с учетом того, что могут быть дубликаты - чтобы не било по производительности
//счетчик мб сложновато, однако какое решение будет и хорошо

//на самом деле, в задании говорится, что дан лист НЕ ПОВТОРЯЮЩИХСЯ чисел, тогда решение тут норм думаю
//а вот с дублями усложнить интересно, да, попробую решить в task26_3
