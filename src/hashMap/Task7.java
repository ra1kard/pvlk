package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(Map.of(
                "Ivan Ivanov", 28,
                "Petr Petrov", 54,
                "Klim Smernov", 20,
                "Sergey Bulkin", 34,
                "Maria Baskakova", 25,
                "Ksenia Nekrasova", 14,
                "Ivan Galkin", 28)
        );
        int child = 0;
        int average = 0;
        int count = 0;
        int oldest = 0;                     //самый старый
        int youngest = Integer.MAX_VALUE;   //самый молодой
        String YoungestKey = "";
        String OldestKey = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            average += entry.getValue();
            count++;
            if (entry.getValue() < youngest) {
                youngest = entry.getValue();
                YoungestKey = entry.getKey();
            }
            if (entry.getValue() > oldest) {
                oldest = entry.getValue();
                OldestKey = entry.getKey();
            }
            if (entry.getValue() < 18) {
                child++;
            }
        }

        // 1. средний возраст всех людей
        System.out.println(average/count);

        // 2. самого старого человека
        System.out.println(OldestKey);

        // 3. самого молодого человека
        System.out.println(YoungestKey);

        // 4. кол-во несовершеннолетних людей
        System.out.println(child);
    }
}
