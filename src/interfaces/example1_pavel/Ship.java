package interfaces.example1_pavel;

public class Ship implements SwimmableInterface{
    @Override
    public void swim() {
        System.out.println("Корабль идёт по волнам");
    }

}
