package interfaces.task6;

public abstract class Human {
    private String name;
    private Size size;
    private Style preferStyle;

    Human(String name, Size size, Style preferStyle) {
        this.name = name;
        this.size = size;
        this.preferStyle = preferStyle;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public Style getPreferStyle() {
        return preferStyle;
    }
    public void setPreferStyle(Style preferStyle) {
        this.preferStyle = preferStyle;
    }

}
