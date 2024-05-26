package interfaces.task7;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        TransportCompany yandexDelivery = new TransportCompany(5);

        Auto a1 = new Auto(2000, 1700, 1400, 3900);
        Auto a4 = new Auto(2500,1850, 1450, 4700);
        Tank t14 = new Tank(4000, 3900, 3300, 10800);
        Tank t72 = new Tank(5000, 3460, 2190, 9530);
        Elephant el1 = new Elephant(7000,2000, 2400, 5000);    //до 3м; 2.4м - 3.8м; до 7.5м
        Elephant el2 = new Elephant(8000, 3000, 3100, 7000);    //до 3м; 2.4м - 3.8м; до 7.5м
        Ship ship = new Ship(5000, 30000, 2000, 4000);

        ArrayList<Transportable> transportables = new ArrayList<>(List.of(ship, a1, a4, t14, t72, el1, el2));

        //yandexDelivery.loadingItem(a1);
        //yandexDelivery.printContainersInfo();

        /**
         * Определите кого транспортировать дешевле
         */
        cheap(transportables);

        /**
         * Погрузите все объекты, которые можно транспортировать
         */
        for (Transportable tr : transportables) {
            yandexDelivery.loadingItem(tr);
        }
        yandexDelivery.printContainersInfo();

    }

    public static Transportable cheap(ArrayList<Transportable> tr) {
        Transportable cheaperTransportable = tr.get(0);

        for (int i = 1; i < tr.size(); i++) {
            if (tr.get(i).costDelivery() < cheaperTransportable.costDelivery()) {
                cheaperTransportable = tr.get(i);
            }
        }
        System.out.println("Дешевле всего транспортировать объект: " + cheaperTransportable);
        System.out.println();
        return cheaperTransportable;
    }

}
