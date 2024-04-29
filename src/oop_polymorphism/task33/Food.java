package oop_polymorphism.task33;

import java.time.LocalDate;

public abstract class Food {        //каждый продукт наследуется от абстр класса Food
    private String name;
    private LocalDate expirationDate;
    private int netMass;

    Food(String name, LocalDate expirationDate, int netMass) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.netMass = netMass;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getNetMass() {
        return netMass;
    }
    public void setNetMass(int netMass) {
        this.netMass = netMass;
    }
}
