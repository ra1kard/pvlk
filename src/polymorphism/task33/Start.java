package polymorphism.task33;

import java.time.LocalDate;

public class Start {
    /**
     * реализуйте несколько наследников этого класса, наградив их какими-то уникальными признаками
     *
     * Сыр (с дырками, плесень)
     * Молоко (долгохранящееся или нет)
     * Пиво (фильтрованное или нет)
     */
    public static void main(String[] args) {
        GroceryStore groceryStore = new GroceryStore("Продуктовый24ч");
        Cheese cheddar = new Cheese(
                "cheddar", LocalDate.of(2024, 5, 22), 500,
                true,false, "England");
        Cheese parmezan = new Cheese(
                "parmezan", LocalDate.of(2024, 5, 11), 400,
                false, false, "Italy");
        Milk milk32 = new Milk(
                "milk32", LocalDate.of(2024, 4, 26), 500,
                3.2, false, true);
        Milk milk25 = new Milk(
                "milk32", LocalDate.of(2024, 11, 5), 500,
                2.5, true, false);
        Beer beer1 = new Beer("Baltika", LocalDate.of(2024, 10, 12), 500,
                false, false);
        Beer beer2 = new Beer("Corona", LocalDate.of(2024, 7, 23), 300,
                true, false);

        groceryStore.setFoods(cheddar);
        groceryStore.setFoods(parmezan);
        groceryStore.setFoods(milk32);
        groceryStore.setFoods(milk25);
        groceryStore.setFoods(beer1);
        groceryStore.setFoods(beer2);
        print(groceryStore);
    }

    public static void print(GroceryStore groceryStore) {
        if (groceryStore.getFoods().size() != 0) {
            for (Food food : groceryStore.getFoods()) {
                //System.out.println(food.getName());
                System.out.println(food);
            }
        }
    }

}
