package polymorphism.task33;

import java.time.LocalDate;

public class Cheese extends Food {
    private boolean isBlueCheese;
    private boolean isWithHoles;
    private String country;

    Cheese(String name, LocalDate expirationDate, int netMass,
           Boolean isBlueCheese, Boolean isWithHoles, String country) {
        super(name, expirationDate, netMass);
        this.isBlueCheese = isBlueCheese;
        this.isWithHoles = isWithHoles;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Сыр! " +
                "название=" + getName() + ", " +
                "срок годности=" + getExpirationDate() + ", " +
                "масса=" + getNetMass() + ", " +
                "isBlueCheese=" + getBlueCheese() + ", " +
                "isWithHoles=" + getWithHoles() + ", " +
                "country=" + getCountry();
    }

    public Boolean getBlueCheese() {
        return isBlueCheese;
    }

    public Boolean getWithHoles() {
        return isWithHoles;
    }

    public String getCountry() {
        return country;
    }

}
