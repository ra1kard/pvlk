package interfaces.task3;

import java.util.Random;

public class SafetyMatch implements Targetable {    //спичка

    @Override
    public int hit() {
        System.out.print("Стрельба по спичке: ");
        Random random = new Random();
        int count = random.nextInt(100) + 1;
        if (count <= 5) {
            System.out.println("Успех!" + " + " + 30 + " баллов!");
            return 30;
        } else {
            System.out.println("Промах!");
            return 0;
        }
    }

}
