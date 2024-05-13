package interfaces.task6;

public class ShortCloth extends Cloth implements MenClothing, WomenClothing {          //шорты
    String name = "Шорты";

    ShortCloth(Material material, Size size, Season season, Collection collection, Sex sex, Style style) {
        super(material, size, season, collection, sex, style);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }

    public String getName() {
        return name;
    }

}
