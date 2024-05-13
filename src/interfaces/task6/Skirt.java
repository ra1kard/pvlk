package interfaces.task6;

public class Skirt extends Cloth implements WomenClothing {          //юбка
    String name = "Юбка";

    Skirt(Material material, Size size, Season season, Collection collection, Sex sex, Style style) {
        super(material, size, season, collection, sex, style);
    }

    @Override
    public void dressWoman() {

    }

    @Override
    public String toString() {
        return name;
    }

}
