package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task27 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(List.of(1.5, 2.137, 1.568, 2.499, 8.0));
        System.out.println(list);
        double rsl;
        double sumUntilRound = 0;
        double sumAfterRound = 0;

        for (Double d : list) {
            sumUntilRound += d;
            rsl = (Math.round(d * 100.0) / 100.0);
            sumAfterRound += rsl;
            System.out.print(rsl + " ");
        }

        System.out.println();
        System.out.println(sumUntilRound);
        System.out.println(sumAfterRound);
    }
}

/*
round() - округлит по правилам округления (дробная часть меньше 0,5 - округление в меньшую сторону, в противном случае в большую).
floor()- округлит в меньшую сторону.
ceil() - округлит в большую сторону.

double — это числа с двойной точностью,
максимально приближённые к заданным или полученным в результате вычислений значениям.
Используется в Java для любых математических вычислений (квадратный корень, синус, косинус,..).

float — менее точный тип с плавающей точкой.
Используется очень редко с целью экономии памяти.
 */
