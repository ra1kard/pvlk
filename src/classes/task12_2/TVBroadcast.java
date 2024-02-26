package classes.task12_2;

import java.time.LocalTime;

public class TVBroadcast {
    private String name;
    private LocalTime start;
    private LocalTime end;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getStart() {
        return start;
    }
    public boolean setStart(LocalTime start) {
        if (start.isBefore(end)) {
            this.start = start;
            return true;
        }
        return false;
    }

    public LocalTime getEnd() {
        return end;
    }
    public boolean setEnd(LocalTime end) {
        if (start.isBefore(end)) {
            this.end = end;
            return true;
        }
        return false;
    }

    TVBroadcast(String name) {
        String nameNew = transformToName(name);
        LocalTime startNew = transformToStart(name);
        LocalTime endNew = transformToEnd(name);
        if (startNew.isBefore(endNew)) {
            this.name = nameNew;
            this.start = startNew;
            this.end = endNew;
        } else {
            System.out.println(name + " передача не создана, противоречит условиям вещания внутри дня 00:00 - 23:59");
            System.out.println();
        }
    }

    public boolean isShow(LocalTime time) {
        return (time.equals(start) || time.isAfter(start)) && (time.isBefore(end) || time.equals(end));
    }

    public String transformToName(String name) {
        String[] arrayString = name.split(" ");
        return arrayString[0];
    }

    public LocalTime transformToStart(String name) {
        String[] arrayString1 = name.split(" ");         // делим всю строку "news 06:01 - 13:00" по пробелам
        String temp1 = arrayString1[1];                        // вычленяем start строку "06:01"
        String[] arrayString2 = temp1.split(":");       // делим на часы и минуты - "06" и "01"
        int hour = Integer.parseInt(arrayString2[0]);
        int min = Integer.parseInt(arrayString2[1]);
        return LocalTime.of(hour, min);
    }

    public LocalTime transformToEnd(String name) {
        String[] arrayString1 = name.split(" ");         // делим всю строку "news 06:01 - 13:00" по пробелам
        String temp1 = arrayString1[3];                        // вычленяем end строку "13:00"
        String[] arrayString2 = temp1.split(":");       // делим на часы и минуты - "13" и "00"
        int hour = Integer.parseInt(arrayString2[0]);
        int min = Integer.parseInt(arrayString2[1]);
        return LocalTime.of(hour, min);
    }

}
