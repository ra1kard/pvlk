package polymorphism.task28;

public class Rectangular extends Figure {                 //прямоугольник

    Rectangular(String name, int width, int height) {
        super(name, width, height);
    }

    @Override
    public int getSquire() {
        return getWidth() * getHeight();
    }

    @Override
    public int getPerimeter() {
        return 10;
    }
}
