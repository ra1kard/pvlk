package classes.task8;

public class Watch {
    private int hour;
    private int min;
    private int sec;

    Watch() {
        new Watch(0, 0, 0);     // так можно ???
    }

    Watch(int hours, int min, int sec) {
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
        final int maxHours = 23;
        final int maxMin = 59;
        final int maxSec = 59;
        while (true) {
            System.out.println("Текущее время: " + printHour() + ":" + printMin() + ":" + printSec());
            Thread.sleep(200);
            if (getHour() == maxHours && getMin() == maxMin && getSec() == maxSec) {
                setHour(0);
                setMin(0);
                setSec(0);
            } else if (getMin() == maxMin && getSec() == maxSec ) {
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

}
