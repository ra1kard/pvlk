package polymorphism.task33;

import java.util.ArrayList;

public class GroceryStore {                 //продуктовый магазин
    private String name;
    private ArrayList<Food> foods = new ArrayList<>();

    GroceryStore(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setFoods(Food food) {
        this.foods.add(food);
    }
}
