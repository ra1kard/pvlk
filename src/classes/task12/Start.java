package classes.task12;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        TVBroadcast animal = new TVBroadcast(
                "animal",
                LocalTime.of(1,0,1),
                LocalTime.of(6, 0,0));

        TVBroadcast news = new TVBroadcast(
                "news",
                LocalTime.of(6,0,1),
                LocalTime.of(7, 0,0));

        TVBroadcast business = new TVBroadcast(
                "business",
                LocalTime.of(7,0,1),
                LocalTime.of(8, 0,0));

        TVBroadcast sport = new TVBroadcast(
                "sport",
                LocalTime.of(8,0,1),
                LocalTime.of(9, 0,0));

        TVBroadcast romance = new TVBroadcast(
                "romance",
                LocalTime.of(9,0,1),
                LocalTime.of(14, 0,0));

        TVBroadcast detective = new TVBroadcast(
                "detective",
                LocalTime.of(14,0,1),
                LocalTime.of(19, 0,0));

        TVBroadcast comedy = new TVBroadcast(
                "comedy",
                LocalTime.of(19,0,1),
                LocalTime.of(22, 0,0));

        TVBroadcast policy = new TVBroadcast(
                "policy",
                LocalTime.of(22,0,1),
                LocalTime.of(23, 59,59));

        ArrayList<TVBroadcast> broadcasts = new ArrayList<>(List.of(
                animal, news, business, sport, romance, detective, comedy, policy));

        /**
         * проверка валидации создания передачи не внутри дня
         * */
        TVBroadcast anime = new TVBroadcast(
                "anime",
                LocalTime.of(23,0,1),
                LocalTime.of(1, 0,0));

        /**
         * проверка валидации setStart
         */
        System.out.println("Проверка невозможности некорректно установить start через set:");
        System.out.println(news.getStart() + " start ПРОВЕРЯЕМ");
        System.out.println(news.getEnd() + " end");
        System.out.println();
        System.out.println(news.setStart(LocalTime.of(5, 0, 1)));
        System.out.println(news.getStart());
        System.out.println(news.setStart(LocalTime.of(12, 0, 1)));
        System.out.println(news.getStart());
        System.out.println();

        /**
         * проверка валидации setEnd
         */
        System.out.println("Проверка невозможности некорректно установить end через set:");
        System.out.println(news.getStart() + " start");
        System.out.println(news.getEnd() + " end ПРОВЕРЯЕМ");
        System.out.println();
        System.out.println(news.setEnd(LocalTime.of(9, 0, 1)));
        System.out.println(news.getEnd());
        System.out.println(news.setEnd(LocalTime.of(3, 0, 1)));
        System.out.println(news.getEnd());
        System.out.println();

        /**
         * проверка работы isShow
         */
        System.out.println(LocalTime.now());
        System.out.println(animal.isShow(LocalTime.now()));
        System.out.println(romance.isShow(LocalTime.now()));
        System.out.println(comedy.isShow(LocalTime.now()));
        System.out.println( );

        /**
         * пример вывода start-end и кол-ва минут интервала
         */
        for (TVBroadcast broadcast : broadcasts) {
            System.out.println(broadcast.getStart());
            System.out.println(broadcast.getEnd());
            System.out.println(ChronoUnit.MINUTES.between(broadcast.getStart(), broadcast.getEnd()));
            System.out.println();
        }

        printCountBroadcastsWithLongestTime(broadcasts);

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
                array = new ArrayList<>();
                array.add(broadcast);
            }
        }
        System.out.println("Кол-во передач, которые занимают наибольшее кол-во эфирного времени: " + array.size());
        for (TVBroadcast a : array) {
            System.out.println(a.getName());
        }
        System.out.println();
    }

    public static long longMin(TVBroadcast broadcast) {
        return ChronoUnit.MINUTES.between(broadcast.getStart(), broadcast.getEnd());
    }

}

