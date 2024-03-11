package classes.task18;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String owner;
    private ArrayList<String> address;      //адреса отделений
    private ArrayList<Currency> currency;   //с какими валютами работает
    private int capital;

    Bank(String name, String owner, ArrayList<String> address, ArrayList<Currency> currency, int capital) {
        this.name = name;
        this.owner = owner;
        this.address = address;
        this.currency = currency;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<String> getAddress() {
        return address;
    }
    public void setAddress(ArrayList<String> address) {
        this.address = address;
    }

    public ArrayList<Currency> getCurrency() {
        return currency;
    }
    public void setCurrency(ArrayList<Currency> currency) {
        this.currency = currency;
    }

    public int getCapital() {
        return capital;
    }
    public void setCapital(int capital) {
        this.capital = capital;
    }

}
