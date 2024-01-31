package classes.task8;

public class Start {

    public static void main(String[] args) throws InterruptedException {
        Watch watchNY = new Watch();
        Watch watchMos = new Watch(22, 58, 40);
        watchMos.addHours();
        watchMos.addMin();
        watchMos.addSec();
        watchMos.timeGo();
    }

}
