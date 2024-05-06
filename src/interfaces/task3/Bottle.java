package interfaces.task3;

import java.util.Random;

public class Bottle implements Targetable {

    @Override
    public int hit() {
        System.out.print("Стрельба по бутылке: ");
        Random random = new Random();
        int count = random.nextInt(100) + 1;
        if (count <= 70) {
            System.out.println("Успех!" + " + " + 5 + " баллов!");
            return 5;
        } else {
            System.out.println("Промах!");
            return 0;
        }
    }

}
