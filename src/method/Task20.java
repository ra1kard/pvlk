package method;

import java.util.ArrayList;
import java.util.List;

public class Task20 {
    public static void main(String[] args) {
        System.out.println(myMethod(new ArrayList<>(List.of(153, 0, 18, 8208))));
        System.out.println(myMethod(new ArrayList<>(List.of(-5, 370, 8, 9, 14))));
        System.out.println(myMethod(new ArrayList<>(List.of(-5, 15, 16, 154))));
    }

    public static ArrayList<Integer> myMethod(ArrayList<Integer> list) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for (Integer t : list) {
            if (Task19.checkArmstrong(t)) {
                tempList.add(t);
            }
        }
        return tempList;
    }
}
