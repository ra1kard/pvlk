package interfaces.example1_pavel;

public class Dog extends Animal implements HomeAnimalInterface, SwimmableInterface {
    private String nickname;

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void setNickname(String nickname) { this.nickname = nickname; }
    public String getNickname() { return nickname; }

    public void bringStick(){
        System.out.println(getName() + " несёт палку хозяину");
    }

    @Override
    public void getVoice() {
        System.out.println("Гав-гав");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает мясо");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывёт");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                "name='" + getName() + '\'' +
                '}';
    }

}
