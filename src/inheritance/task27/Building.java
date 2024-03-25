package inheritance.task27;

public abstract class Building {
    private boolean isFoundation;               //наличие фундамента
    private Enum<Material> material;            //материал

    Building(boolean isFoundation, Enum material) {
        this.isFoundation = isFoundation;
        this.material = material;
    }

    public boolean isFoundation() {
        return isFoundation;
    }

    public Enum<Material> getMaterial() {
        return material;
    }
}
