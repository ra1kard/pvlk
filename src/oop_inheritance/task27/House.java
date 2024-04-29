package oop_inheritance.task27;

public class House extends Building {
    private int numberOfFloors;         //кол-во этажей
    private int heightFloor;            //высота каждого дома

    House(boolean isFoundation, Enum material, int numberOfFloors, int heightFloor) {
        super(isFoundation, material);
        this.numberOfFloors = numberOfFloors;
        this.heightFloor = heightFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getHeightFloor() {
        return heightFloor;
    }
}
