package interfaces.task3;

import java.util.Random;

public class Plate implements Targetable {          //тарелка

    @Override
    public int hit() {
        System.out.print("Стрельба по тарелке: ");
        Random random = new Random();
        int count = random.nextInt(100) + 1;
        if (count <= 20) {
            System.out.println("Успех!" + " + " + 15 + " баллов!");
            return 15;
        } else {
            System.out.println("Промах!");
            return 0;
        }
    }

}
