package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task26 {
    public static void main(String[] args) {
        //ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        //ArrayList<Integer> list2 = new ArrayList<>(list1);
        ArrayList<Integer> list1 = new ArrayList<>(List.of(10, 15, 6, -8, 41, 9, 16, -5, 0));
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        //ArrayList<Integer> list1 = new ArrayList<>(List.of(30, 20, 40));
        //ArrayList<Integer> list2 = new ArrayList<>(list1);
        ArrayList<Integer> listLowest = new ArrayList<>();
        ArrayList<Integer> listBiggest = new ArrayList<>();

        int lowest = 0;
        int lowestIndex = 0;
        int biggest = 0;
        int biggestIndex = 0;

        while (list1.size() > 0) {
            lowest = list1.get(0);
            lowestIndex = 0;
            biggest = list2.get(0);
            biggestIndex = 0;
            for (int i = 1; i < list1.size(); i++) {
                if (list1.get(i) < lowest) {
                    lowest = list1.get(i);
                    lowestIndex = i;
                }
            }
            for (int i = 1; i < list2.size(); i++) {
                if (list2.get(i) > biggest) {
                    biggest = list2.get(i);
                    biggestIndex = i;
                }
            }
            listLowest.add(lowest);
            list1.remove(lowestIndex);
            listBiggest.add(biggest);
            list2.remove(biggestIndex);
        }

        System.out.println(listLowest);
        System.out.println(listBiggest);
    }
}
