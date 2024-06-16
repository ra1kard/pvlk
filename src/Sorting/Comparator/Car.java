package Sorting.Comparator;

public class Car implements Comparable<Car> {
    private int manufactureYear;
    private String model;
    private int maxSpeed;

    public Car(int manufactureYear, String model, int maxSpeed) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }

    @Override
    public String toString() {
        return "getManufactureYear=" + getManufactureYear() + ", " +
                "getMaxSpeed=" + getMaxSpeed() + ", " +
                "model=" + getModel();

    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}
