package classes.task12demo;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class PlusMinusLocalTimeDemo {
    public static void main(String[] args) {
        LocalTime fiveThirty = LocalTime.of(5, 30);

        // Добавление
        LocalTime sixThirty = fiveThirty.plusHours(1);
        LocalTime fiveForty = fiveThirty.plusMinutes(10);
        LocalTime plusSeconds = fiveForty.plusSeconds(14);
        LocalTime plusNanos = fiveForty.plusNanos(9999999);
        LocalTime sevenThirty = fiveForty.plus(2, ChronoUnit.HOURS);

        // Вычитание
        LocalTime fourThirty = fiveForty.minusHours(1);
        LocalTime fiveTen = fiveForty.minusMinutes(20);
        LocalTime minusSeconds = fiveForty.minusSeconds(2);
        LocalTime minusNano = fiveForty.minusNanos(1);
        LocalTime fiveTwenty = fiveForty.minus(10, ChronoUnit.MINUTES);

        System.out.println("sixThirty: " + sixThirty);
        System.out.println("fiveForty: " + fiveForty);
    }
}
