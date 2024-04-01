package polymorphism.task29;

public class Refrigerator extends Electronics {
    private int volumeUpperChamber;     //объём верхней камеры
    private int volumeLowerChamber;     //объём нижней камеры

    Refrigerator(int volumeUpperChamber, int volumeLowerChamber) {
        this.volumeUpperChamber = volumeUpperChamber;
        this.volumeLowerChamber = volumeLowerChamber;
    }

    @Override
    public void printInfo() {
        System.out.println("Холодильник " +
                "c объемом верхней камеры: " + volumeUpperChamber + ", " +
                "с объемом нижней камеры: " + volumeLowerChamber);
    }
}
