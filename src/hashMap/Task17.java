package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task17 {
    public static void main(String[] args) {
        double bestResult = 0;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(Map.of());
        map.put(2020, new ArrayList<>(List.of(15, 14, 16, 15, 15)));
        map.put(2021, new ArrayList<>(List.of(15, 15, 16, 15, 18, 18)));
        map.put(2022, new ArrayList<>(List.of(17, 17, 16, 15, 17)));
        System.out.println(map);

        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            double average = 0;
            System.out.print(entry.getKey() + " : ");
            for (int i = 0; i < entry.getValue().size(); i++) {
                average += entry.getValue().get(i);
                if (entry.getValue().get(i) > bestResult) {
                    bestResult = entry.getValue().get(i);
                }
            }
            average = average / entry.getValue().size();
            System.out.printf("%.2f%n", average);
        }

        //лучший рез-т за все время
        System.out.println();
        System.out.println(bestResult);

    }
}
