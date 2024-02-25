package classes.task12;

import java.time.LocalTime;

public class LocalTimeDemo2 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int nanosecond = now.getNano();

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(nanosecond);
    }
}
