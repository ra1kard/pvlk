package polymorphism.task32;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private HashMap<String, Item> items = new HashMap<>(); //товары на складе, ключ место item'а на складе

    /**
     * В конструкторе инициализируются места на складе. Все Item равны null
     */
    Warehouse(int sizeWarehouse) {
        HashMap<String, Item> map = new HashMap<>(Map.of());
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < sizeWarehouse + 1; j++) {
                if (i == 0) {
                    map.put(j + "A", null);
                } else if (i == 1) {
                    map.put(j + "B", null);
                } else {
                    map.put(j + "C", null);
                }
            }
        }
        this.items.putAll(map);
    }

    /**
     * Добавление товара на склад. При доб тов, система автом опред для него свободное место.
     */
    public void addItem(Item item) {
        if (this.items.containsValue(null)) {
            this.items.put(getFreePlace(), item);
        }
        else {
            System.out.println("Склад заполнен, свободных ячеек нет");
        }
    }

    /**
     * Метод, возвращающий свободное место на складе.
     */
    public String getFreePlace() {
        for (Map.Entry<String, Item> entry : items.entrySet()) {
            if (entry.getValue() == null) {
                return entry.getKey();
            }
        }
        return null;
    }

    /**
     * Отправка товара в магазин. Товар должен быть удален со склада. Место, должно освободиться.
     */
    public void sendToStore(Item item) {
        if (this.items.containsValue(item)) {
            System.out.println("Отправка в магазин товара " + item.getName());
            for (Map.Entry<String, Item> entry : items.entrySet()) {
                if (entry.getValue() == item) {
                    this.items.put(entry.getKey(), null);
                    break;
                }
            }
        } else {
            System.out.println("Товар для отправки в магазин не найден");
        }
        System.out.println();
    }

    /**
     * Вывод информации о занятых ячейках на складе.
     * Вывод должен содержать место, на котором хранится товар и основную информацию о товаре.
     */
    public void printOccupiedPlace() {
        System.out.println("---Занятые ячейки (ячейка/товар/стоим/датапоступл/видтовара)---");
        for (Map.Entry<String, Item> entry : items.entrySet()) {
            if (entry.getValue() != null) {
                System.out.println(
                        entry.getKey() + " " +
                        entry.getValue().getName() + " " +
                        entry.getValue().getCost() + " " +
                        entry.getValue().getDateArrivalAtTheWarehouse() + " " +
                        entry.getValue().getType());
            }
        }
        System.out.println();
    }
}
