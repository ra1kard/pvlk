package classes.task12;

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

    TVBroadcast(String name, LocalTime start, LocalTime end) {
        //считается, что передача не может начинаться одним днём, а заканчиваться другим, поэтому:
        //проверяем, что start меньше end
        if (start.isBefore(end)) {
            this.name = name;
            this.start = start;
            this.end = end;
        } else {
            System.out.println(name + " передача не создана, противоречит условиям вещания внутри дня 00:00 - 23:59");
            System.out.println();
            //ты говорил лучше убирать вывод в классе, выносить в start, но в данном случае тут приемлимо?
            //скорее наверное exception какой-то тут кидать надо, но это в будущем
        }
    }

    public boolean isShow(LocalTime time) {
        //если передача идет по ТВ - вернуть true
        //если передача НЕ идет по ТВ - вернуть false
        //так как условия только equals и isBefore/isAfter, то:
        return (time.equals(start) || time.isAfter(start)) && (time.isBefore(end) || time.equals(end));
    }

}
