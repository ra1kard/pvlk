package classes.task3;

import java.util.ArrayList;
import java.util.List;

public class Village {
    private String name;
    private ArrayList<House> houses = new ArrayList<>();

    public String getName() {
        return name;
    }
    public List<House> getHouses() {
        return houses;
    }

    Village() {
    }

    Village(String name, ArrayList<House> houses) {
        this.name = name;
        this.houses = houses;
    }

    public void addHouse(House house) {
        this.houses.add(house);
    }

    public void addHouse(String nameOwner, String address) {
        House house = new House(nameOwner, address);
        this.houses.add(house);
    }
}
