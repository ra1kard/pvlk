package interfaces.task5;

public class Window implements Washable {
    public String name = "Окно";
    private int floor;          //этаж
    private boolean standard;   //стандартное окно?
    private int flap;           //кол-во створок
    private int squareMeter;    //кол-во метров

    Window(int floor, boolean standard, int flap, int squareMeter) {
        this.floor = floor;
        this.standard = standard;
        if (standard) {
            this.flap = flap;
        } else {
            this.squareMeter = squareMeter;
        }
    }

    @Override
    public String wash() {
        return type;
    }

    @Override
    public int getCost() {
        if (standard) {
            return flap * 350 + (floor * 10);
        } else {
            return squareMeter * 350 + (floor * 20);
        }
    }

    public int getFloor() {
        return floor;
    }

    public boolean isStandard() {
        return standard;
    }

    public int getFlap() {
        return flap;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

}
