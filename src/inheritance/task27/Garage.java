package inheritance.task27;

public class Garage extends Building {
    private int quantityCar;                //кол-во машин, которые можно поставить в гараж
    private boolean isHeated;               //отапливаемость гаража

    Garage(boolean isFoundation, Enum material, int quantityCar, boolean isHeated) {
        super(isFoundation, material);
        this.quantityCar = quantityCar;
        this.isHeated = isHeated;
    }

    public int getQuantityCar() {
        return quantityCar;
    }

    public boolean isHeated() {
        return isHeated;
    }
}
