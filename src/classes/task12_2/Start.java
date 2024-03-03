package classes.task12_2;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        ArrayList<TVBroadcast> listTVBroadcast = new ArrayList<>();
        ArrayList<String> listString = new ArrayList<>(List.of(
                "animal 01:01 - 06:00",
                "news 06:01 - 08:00",
                "business 08:01 - 13:00"
        ));
        for (String s : listString) {               //преобразуем список строк в список объектов класса TVBroadcast
            listTVBroadcast.add(new TVBroadcast(s));
        }

        TVBroadcast horror = new TVBroadcast("horror 13:01 - 18:00");
        TVBroadcast hockey = new TVBroadcast("hockey 18:01 - 23:00");
        listTVBroadcast.add(horror);
        listTVBroadcast.add(hockey);

        /**
         * распечатаем все
         */
        printAll(listTVBroadcast);

        /**
         * проверка валидации создания передачи не внутри дня
         * */
        TVBroadcast anime = new TVBroadcast("anime 23:00 - 01:00");
        //listTVBroadcast.add(anime);

        /**
         * проверка валидации setStart
         */
        System.out.println("Проверка невозможности некорректно установить start через set:");
        System.out.println(horror.getStart() + " start ПРОВЕРЯЕМ");
        System.out.println(horror.getEnd() + " end");
        System.out.println("- - -");
        System.out.println(horror.setStart(LocalTime.of(12, 1, 0)));
        System.out.println(horror.getStart());
        System.out.println(horror.setStart(LocalTime.of(21, 1, 0)));
        System.out.println(horror.getStart());
        System.out.println();

        /**
         * проверка валидации setEnd
         */
        System.out.println("Проверка невозможности некорректно установить end через set:");
        System.out.println(horror.getStart() + " start");
        System.out.println(horror.getEnd() + " end ПРОВЕРЯЕМ");
        System.out.println("- - -");
        System.out.println(horror.setEnd(LocalTime.of(17, 0, 0)));
        System.out.println(horror.getEnd());
        System.out.println(horror.setEnd(LocalTime.of(3, 0, 0)));
        System.out.println(horror.getEnd());
        System.out.println();

        /**
         * проверка работы isShow
         */
        printAll(listTVBroadcast);                  //распечатаем все
        System.out.println(LocalTime.now() + " - текущее время, проверим, что идет:");
        for (TVBroadcast broadcast : listTVBroadcast) {
            System.out.println(broadcast.getName() + " " + broadcast.isShow(LocalTime.now()));
        }
        System.out.println();

        /**
         * пример вывода start-end и кол-ва минут интервала
         */
        for (TVBroadcast broadcast : listTVBroadcast) {
            System.out.println(broadcast.getStart());
            System.out.println(broadcast.getEnd());
            System.out.println(ChronoUnit.MINUTES.between(broadcast.getStart(), broadcast.getEnd()));
            System.out.println();
        }

        printCountBroadcastsWithLongestTime(listTVBroadcast);

    }

    /**
     * кол-во тв передач, которые занимают наибольшее кол-во времени (подразумевая, что таких мб несколько)
     * ориентироваться выбрал на минуты, мне кажется так лучше чем ориентироваться на секунды
     */
    public static void printCountBroadcastsWithLongestTime(ArrayList<TVBroadcast> broadcasts) {
        ArrayList<TVBroadcast> array = new ArrayList<>();
        for (TVBroadcast broadcast : broadcasts) {
            if (array.isEmpty()) {                                      //если список пустой, закинем сразу
                array.add(broadcast);
            } else if (longMin(broadcast) == longMin(array.get(0))) {   //если = дозакинем
                array.add(broadcast);
            } else if (longMin(broadcast) > longMin(array.get(0))) {    //если > отчистим и закинем новое
                array.clear();
                array.add(broadcast);
            }
        }
        System.out.println("Кол-во передач, которые занимают наибольшее кол-во эфирного времени: " + array.size());
        for (TVBroadcast a : array) {
            System.out.println(a.getName());
        }
        System.out.println();
    }

    /**
     * кол-во минут в передаче
     */
    public static long longMin(TVBroadcast broadcast) {
        return ChronoUnit.MINUTES.between(broadcast.getStart(), broadcast.getEnd());
    }

    /**
     * распечатать все
     */
    public static void printAll(ArrayList<TVBroadcast> list) {
        System.out.println("Напечатаем все передачи:");
        System.out.println();
        for (TVBroadcast broadcast : list) {
            System.out.println(broadcast.getName() + " - имя передачи");
            System.out.println(broadcast.getStart() + " - начало передачи");
            System.out.println(broadcast.getEnd() + " - конец передачи");
            System.out.println();
        }
    }

}
