package interfaces.example1_pavel;

public class Cat extends Animal implements HomeAnimalInterface {
    private boolean isHome;

    public Cat(String name, int age, String color, boolean isHome) {
        super(name, age, color);
        this.isHome = isHome;
    }

    public boolean isHome() { return isHome; }
    public void setHome(boolean home) { isHome = home; }

    public void playWithYarn(){ System.out.println(getName() + " играет с пряжей хозяйки");}

    @Override
    public void getVoice() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void eat() { System.out.println(getName() + " кушает корм и пьёт молоко");}
}
