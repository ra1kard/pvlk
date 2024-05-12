package interfaces.task3;

public class Start {

    public static void main(String[] args) {
        ShootingRange shootingRange = new ShootingRange();
        Bottle bottle = new Bottle();
        SafetyMatch safetyMatch = new SafetyMatch();
        Matchox matchox = new Matchox();
        Plate plate = new Plate();

        shootingRange.addTarget(bottle);
        shootingRange.addTarget(safetyMatch);
        shootingRange.addTarget(matchox);
        shootingRange.addTarget(plate);

        shootingRange.startGame(5);
    }

}
