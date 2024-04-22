package polymorphism.task33;

import java.time.LocalDate;

public class Beer extends Food {
    private boolean isFiltered;
    private boolean isDark;

    Beer(String name, LocalDate expirationDate, int netMass, boolean isFiltered, boolean isDark) {
        super(name, expirationDate, netMass);
        this.isFiltered = isFiltered;
        this.isDark = isDark;
    }

    @Override
    public String toString() {
        return "Пиво! " +
                "название=" + getName() + ", " +
                "срок годности=" + getExpirationDate() + ", " +
                "масса=" + getNetMass() + ", " +
                "isFiltered=" + isFiltered + ", " +
                "isDark=" + isDark;
    }

    public boolean isFiltered() {
        return isFiltered;
    }

    public boolean isDark() {
        return isDark;
    }

}
