package interfaces.task6;

public class Trousers extends Cloth implements MenClothing {       //штаны
    String name = "Штаны";

    Trousers(Material material, Size size, Season season, Collection collection, Sex sex, Style style) {
        super(material, size, season, collection, sex, style);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public String getName() {
        return name;
    }

}
