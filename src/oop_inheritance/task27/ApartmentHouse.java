package oop_inheritance.task27;

public class ApartmentHouse extends House {
    private int numberOfParking;                    //кол-во парковочных мест
    private boolean isUndergroundParking;           //наличие подземной парковки (true - есть)
    private int numberOfEntrances;                  //кол-во подъездов в доме

    ApartmentHouse(boolean isFoundation, Enum material, int numberOfFloors, int heightFloor,
                   int numberOfParking, boolean isUndergroundParking, int numberOfEntrances) {
        super(isFoundation, material, numberOfFloors, heightFloor);
        this.numberOfParking = numberOfParking;
        this.isUndergroundParking = isUndergroundParking;
        this.numberOfEntrances = numberOfEntrances;
    }

    public int getNumberOfParking() {
        return numberOfParking;
    }

    public boolean isUndergroundParking() {
        return isUndergroundParking;
    }

    public int getNumberOfEntrances() {
        return numberOfEntrances;
    }
}
