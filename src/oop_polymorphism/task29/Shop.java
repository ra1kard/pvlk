package oop_polymorphism.task29;

import java.util.ArrayList;

public class Shop {
    private String name;
    ArrayList<Washer> washerList = new ArrayList<>();
    ArrayList<TV> tvList = new ArrayList<>();
    ArrayList<Refrigerator> refrigeratorList = new ArrayList<>();

    Shop(String name) {
        this.name = name;
    }

    public void sale(Customer customer, Electronics electronics) {
        System.out.println("продажа совершена!");
    }

    public ArrayList<Washer> getWasherList() {
        return washerList;
    }
    public void addWasherList(Washer washer) {
        this.washerList.add(washer);
    }

    public ArrayList<TV> getTvList() {
        return tvList;
    }
    public void addTvList(TV tv) {
        this.tvList.add(tv);
    }

    public ArrayList<Refrigerator> getRefrigeratorList() {
        return refrigeratorList;
    }
    public void addRefrigeratorList(Refrigerator refrigerator) {
        this.refrigeratorList.add(refrigerator);
    }

}
