package classes.task8and9;

public class Time {
    private int hour;
    private int min;
    private int sec;

    Time() {
        new Time(0, 0, 0);     // так можно ???????
    }

    Time(int hours, int min, int sec) {
        this.hour = hours;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }
    public void setSec(int sec) {
        this.sec = sec;
    }

    public void timeGo() throws InterruptedException {
        final int maxHours = 23;                //стоит в поля класса их доб или тут ост ???????
        final int maxMin = 59;
        final int maxSec = 59;
        while (true) {
            System.out.println("Текущее время: " + printHour() + ":" + printMin() + ":" + printSec());
            Thread.sleep(100);
            if (getHour() == maxHours && getMin() == maxMin && getSec() == maxSec) {
                setHour(0);
                setMin(0);
                setSec(0);
            } else if (getMin() == maxMin && getSec() == maxSec) {
                setMin(0);
                setSec(0);
                addHours();
            } else if (getSec() == maxSec) {
                setSec(0);
                addMin();
            } else {
                addSec();
            }
        }
    }

    public void addHours() {
        setHour(getHour() + 1);
    }

    public void addMin() {
        setMin(getMin() + 1);
    }

    public void addSec() {
        setSec(getSec() + 1);
    }

    public String printHour() {
        if (hour < 10) {
            return "0" + hour;
        } else {
            return Integer.toString(hour);
        }
    }

    public String printMin() {
        if (min < 10) {
            return "0" + min;
        } else {
            return Integer.toString(min);
        }
    }

    public String printSec() {
        if (sec < 10) {
            return "0" + sec;
        } else {
            return Integer.toString(sec);
        }
    }

    public boolean isBefore(Time timeCurrent, Time time2) {
        if (timeCurrent.hour < time2.hour) {
            return true;
        } else if (timeCurrent.min < time2.min) {
            return true;
        } else if (timeCurrent.sec < time2.sec) {
            return true;
        } else
            return false;
    }

    public boolean isAfter(Time timeCurrent, Time time2) {
        if (timeCurrent.hour > time2.hour) {
            return true;
        } else if (timeCurrent.min > time2.min) {
            return true;
        } else if (timeCurrent.sec > time2.sec) {
            return true;
        } else
            return false;
    }

    public boolean isSame(Time timeCurrent, Time time2) {
        return timeCurrent.hour == time2.hour
                && timeCurrent.min == time2.min
                && timeCurrent.sec == time2.sec;
    }

}
