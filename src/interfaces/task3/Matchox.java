package interfaces.task3;

import java.util.Random;

public class Matchox implements Targetable {        //спичечный коробок

    @Override
    public int hit() {
        System.out.print("Стрельба по спич кор: ");
        Random random = new Random();
        int count = random.nextInt(100) + 1;
        if (count <= 90) {
            System.out.println("Успех!" + " + " + 2 + " баллов!");
            return 2;
        } else {
            System.out.println("Промах!");
            return 0;
        }
    }

}
