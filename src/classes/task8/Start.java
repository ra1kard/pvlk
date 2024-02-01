package classes.task8;

public class Start {

    public static void main(String[] args) throws InterruptedException {
        Time timeNY = new Time();
        Time timeMos = new Time(22, 58, 30);
        Time timeLon = new Time(22, 58, 30);
        timeMos.addHours();
        timeMos.addMin();
        timeMos.addSec();
        timeMos.timeGo();

        System.out.println(timeMos.isBefore(timeMos, timeLon));
        System.out.println(timeMos.isAfter(timeMos, timeLon));
        System.out.println(timeMos.isSame(timeMos, timeLon));
    }

}
