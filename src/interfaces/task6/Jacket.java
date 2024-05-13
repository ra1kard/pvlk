package interfaces.task6;

public class Jacket extends Cloth implements MenClothing, WomenClothing {
    String name = "Куртка";

    Jacket(Material material, Size size, Season season, Collection collection, Sex sex, Style style) {
        super(material, size, season, collection, sex, style);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }

    @Override
    public String toString() {
        return name;
    }

}
