package interfaces.task3;

public class Start {

    public static void main(String[] args) {
        ShootingRange shootingRange = new ShootingRange();
        Bottle bottle = new Bottle();
        SafetyMatch safetyMatch = new SafetyMatch();
        Matchox matchox = new Matchox();
        Plate plate = new Plate();

        shootingRange.setArrayList(bottle);
        shootingRange.setArrayList(safetyMatch);
        shootingRange.setArrayList(matchox);
        shootingRange.setArrayList(plate);

        shootingRange.startGame(3);
    }

}
