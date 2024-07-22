package generics.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Start {

    public static void main(String[] args) {
        Island island1 = new Island("Филиппины", new Chest<Diamonds>(new Diamonds(0)));
        Island island2 = new Island("Мальдивы", new Chest<Diamonds>(new Diamonds(50)));
        Island island3 = new Island("Бермуда", new Chest<Gold>(new Gold(33)));
        Island island4 = new Island("Майорка", new Chest<Gold>(new Gold(11)));

        TreasureMap treasureMap1 = new TreasureMap("Филиппины", 33);
        TreasureMap treasureMap2 = new TreasureMap("Мальдивы", 17);
        TreasureMap treasureMap3 = new TreasureMap("Бермуда", 56);
        TreasureMap treasureMap4 = new TreasureMap("Майорка", 6);
        TreasureMap treasureMap5 = new TreasureMap("Ролейно", 44);
        TreasureMap treasureMap6 = new TreasureMap("Мышиный", 22);

        ArrayList<Island> listIslands = new ArrayList<>(List.of(
                island1, island2, island3, island4));
        ArrayList<TreasureMap> treasureMaps = new ArrayList<>(List.of(
                treasureMap1, treasureMap2, treasureMap3, treasureMap4, treasureMap5, treasureMap6));

        if (tryLabyrinth()) {                                   //отправимся в смертельный лабиринт за поиском карты
            TreasureMap ourTreasureMap = getMap(treasureMaps);                              //если успех, получим карту
            Island tempIsland = findTreasureInWorld(ourTreasureMap.getName(), listIslands); //попробуем найти остров в мире
            if (tempIsland != null) {
                System.out.println();
                System.out.println("---Что же мы нашли?!---");
                System.out.println(tempIsland.getChest().treasure.toString());
                System.out.println("кол-во: " + tempIsland.getChest().treasure.getQuantity());
                System.out.println("прайс: " + tempIsland.getChest().treasure.getPrice());
                System.out.println("итого денег: " + tempIsland.getChest().treasure.getSumMoney());
            }
        }

    }

    /**
     * Смертельный лабиринт - либо получишь карту, либо настигнет смерть
     */
    public static boolean tryLabyrinth() {
        System.out.println("---Смертельный лабиринт - либо получишь карту, либо настигнет смерть---");
        Random random = new Random();
        if (1 == random.nextInt(2) + 1) {
            System.out.println("Успех, ранен, однако открыт доступ к карте!!!");
            System.out.println();
            return true;
        } else {
            System.out.println("Сыграл в ящик");
            return false;
        }
    }

    /**
     * если лабиринт пройден получите карту и распишитесь вот тут
     */
    public static TreasureMap getMap(ArrayList<TreasureMap> treasureMaps) {
        System.out.println("---Получение карты из рук древней статуи---");
        Random random = new Random();
        int bound = random.nextInt((treasureMaps.size() - 1) + 1);
        System.out.println("Карта острова: " + treasureMaps.get(bound).getName());
        System.out.println("Кол-во шагов до сундука там от точки: " + treasureMaps.get(bound).getStepsUntilChest());
        System.out.println();
        return treasureMaps.get(bound);
    }

    /**
     * Попробуй найти название острова с карты
     */
    public static Island findTreasureInWorld(String islandNameFromMap,
                                    ArrayList<Island> listIslandsInTheWorld) {  //список всех островов в мире
        System.out.println("---Смотрим есть ли такой остров в реестре на настоящее время---");
        boolean exists = false;
        Island tempIsland = null;
        for (Island island : listIslandsInTheWorld) {
            if (Objects.equals(island.getName(), islandNameFromMap)) {
                exists = true;
                tempIsland = island;
                break;
            }
        }
        if (exists) {
            System.out.println("Успех, такой остров существует, мы знаем где он находится!");
        } else {
            System.out.println("Остров не существует, кончай этим заниматься, устройся на работу наконец!");
        }
        return tempIsland;
    }

    //найдите сокровище, которое спрятано на острове:
    // + и сообщите о его содержимом
    // + и сколько шагов пришлось пройти, чтобы найти сокровище
    // + если острова нет, выведите сообщение "Остров не существует"
    // + не забудьте о том, что у нас есть карта сокровищ, в которой указано название острова
    // - после этого, выведите те острова, в котором спрятаны пустые сундуки
    // - а после выведите остров с самым богатым сундуком

    //  ы это разве верно? первый Diamonds idea подсказывает лишний
    //  ы Island island1 = new Island("Филиппины", new Chest<Diamonds>(new Diamonds(0)));

}
