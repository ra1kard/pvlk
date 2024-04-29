package oop_inheritance.task27;

public class Cottage extends House {
    private Garage garage;                    //объект гаража, может быть - может не быть (null)
    private int houseArea;                      //площадь дома
    private boolean isUrban;                    //городской дом

    Cottage(boolean isFoundation, Enum material, int numberOfFloors, int heightFloor,
            Garage garage, int houseArea, boolean isUrban) {
        super(isFoundation, material, numberOfFloors, heightFloor);
        this.garage = garage;
        this.houseArea = houseArea;
        this.isUrban = isUrban;
    }

    public Garage getGarage() {
        return garage;
    }

    public int getHouseArea() {
        return houseArea;
    }

    public boolean isUrban() {
        return isUrban;
    }
}
