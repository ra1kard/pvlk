package polymorphism.task33;

import java.time.LocalDate;

public class Milk extends Food {
    private double fatness;                    //жирность
    private boolean isLongStored;           //долго хранится
    private boolean isNatural;              //натуральное или порошковое

    Milk(String name, LocalDate expirationDate, int netMass,
         double fatness, boolean isLongStored, boolean isNatural) {
        super(name, expirationDate, netMass);
        this.fatness = fatness;
        this.isLongStored = isLongStored;
        this.isNatural = isNatural;
    }

    public double getFatness() {
        return fatness;
    }

    public Boolean getLongStored() {
        return isLongStored;
    }

    public Boolean getNatural() {
        return isNatural;
    }

}
