package interfaces.task6;

public class Tshirt extends Cloth implements MenClothing, WomenClothing {
    String name = "Футболка";

    Tshirt(Material material, Size size, Season season, Collection collection, Sex sex, Style style) {
        super(material, size, season, collection, sex, style);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }

    @Override
    public String getName() {
        return name;
    }

}
