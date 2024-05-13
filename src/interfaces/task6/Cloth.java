package interfaces.task6;

public abstract class Cloth {
    private Material material;
    private Size size;
    private Season season;
    private Collection collection;
    private Sex sex;
    private Style style;

    Cloth(Material material, Size size, Season season, Collection collection, Sex sex, Style style) {
        this.material = material;
        this.size = size;
        this.season = season;
        this.collection = collection;
        this.sex = sex;
        this.style = style;
    }

    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public Season getSeason() {
        return season;
    }
    public void setSeason(Season season) {
        this.season = season;
    }

    public Collection getCollection() {
        return collection;
    }
    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public Sex getSex() {
        return sex;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Style getStyle() {
        return style;
    }
    public void setStyle(Style style) {
        this.style = style;
    }

}
