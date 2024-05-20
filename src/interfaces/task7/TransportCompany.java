package interfaces.task7;

import java.util.ArrayList;
import java.util.Random;

public class TransportCompany {
    ArrayList <Container> containers = new ArrayList<>();   //список контейн, имеющ у трансп компании

    TransportCompany(int count) {        //принимает целое число кол-во контейнеров у трансп компании
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int width = random.nextInt(3000) + 2000;
            int height = random.nextInt(4000) + 3000;
            int length = random.nextInt(11000) + 3000;
            Container container = new Container(width, height, length);
            container.setCount(i);
            System.out.println("Создан контейнер " + container.getCount()
                    + " ширина: " + width
                    + " высота: " + height
                    + " длина: " + length);
            containers.add(container);
        }
        System.out.println();
    }

    public ArrayList<Container> getContainers() {
        return containers;
    }

    void loadingItem(Transportable item) {          //погрузка объекта в доступный контейнер
        if (findContainer(item).getVolume() == 0) {
            System.out.println("Нет подходящего контейнера, чтобы погрузить объект: " + item);
            System.out.println();
        } else {
            findContainer(item).loadingItem(item);
        }
    }

    Container findContainer(Transportable item) {   //поиск доступного контейнера для объекта, вернуть наим
        Container minFit = new Container(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        for (Container container : containers) {
            if (container.getItem() == null
                    && container.canTransport(item)
                    && (container.getVolume() < minFit.getVolume())) {
                minFit = container;
            }
        }
        return (minFit.getVolume() == 2147483647) ? new Container(0, 0, 0) : minFit;
    }

    void printContainersInfo() {
        for (Container container : containers) {
            System.out.println("Контейнер " + container.getCount() +  " " + container.getItem());
        }
        System.out.println();
    }

}
