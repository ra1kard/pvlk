package classes.task7;

import java.util.ArrayList;

public class Human {
    private String name;
    private String surname;
    private int age;
    private int money;
    private ArrayList<Human> friend = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Human> getFriend() {
        return friend;
    }

    Human(String name, String surname, int age, int money) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.money = money;
    }

    public void addFriend(Human human) {
        this.friend.add(human);
    }

    public void delFriend(Human human) {
        this.friend.remove(human);
    }

}
