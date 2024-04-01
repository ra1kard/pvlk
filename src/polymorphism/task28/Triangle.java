package polymorphism.task28;

public class Triangle extends Figure {

    Triangle(String name, int width, int height) {
        super(name, width, height);
    }

    @Override
    public int getSquire() {
        return getWidth() * getHeight() / 2;
    }

    @Override
    public int getPerimeter() {
        return 10;
    }
}
