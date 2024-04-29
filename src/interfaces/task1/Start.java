package interfaces.task1;

import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {
        Movingable m1 = new Human(5, "Борис");
        Movingable m2 = new Bird(110, "Чайка");
        Movingable m3 = new Ship(42, false);
        Movingable m4 = new Ship(59, true);
        Movingable m5 = new Vampire(70, "Элиз");

        ArrayList<Movingable> arrayList = new ArrayList<>();
        arrayList.add(m1);
        arrayList.add(m2);
        arrayList.add(m3);
        arrayList.add(m4);
        arrayList.add(m5);

        for (Movingable m : arrayList) {
            doMove(m);
        }
    }

    public static void doMove(Movingable movingable) {
        movingable.move();
    }

}
