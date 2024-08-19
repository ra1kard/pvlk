package generics.task5;

import java.util.HashMap;
import java.util.Map;

public class Warehouse <T extends Item> {                //склад
    private HashMap<String, T> items = new HashMap<>();  //товары на складе, ключ место item'а на складе
    private final int number;                            //номер склада

    /**
     * В конструкторе инициализируются места на складе. Все Item равны null
     */
    Warehouse(int sizeWarehouse, int numberWarehouse) {
        HashMap<String, T> map = new HashMap<>(Map.of());
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
        this.number = numberWarehouse;
        this.items.putAll(map);
    }

    /**
     * Добавление товара на склад. При доб тов, система автом опред для него свободное место.
     */
    public void addItem(T item) {
        if (this.items.containsValue(null)) {
            this.items.put(getFirstFreePlace(), item);
        }
        else {
            System.out.println("Склад заполнен, свободных ячеек нет");
        }
    }

    /**
     * добавляет складу объект если на складе больше половины свободного места
     */
    public boolean addIfIsFree50PercentPlaces(T item) {
        int count = 0;
        for (Map.Entry<String, T> entry : items.entrySet()) {
            if (count <= items.size()/2 && entry.getValue() == null) {
                count++;
            } else if (count > items.size()/2) {
                break;
            }
        }
        if (count > items.size()/2) addItem(item);
        return count > items.size()/2;
    }

    public HashMap<String, T> getItems() {
        return items;
    }

    /**
     * Метод, возвращающий первое свободное место на складе.
     */
    public String getFirstFreePlace() {
        for (Map.Entry<String, T> entry : items.entrySet()) {
            if (entry.getValue() == null) {
                return entry.getKey();
            }
        }
        return null;
    }

    /**
     * Отправка товара в магазин. Товар должен быть удален со склада. Место, должно освободиться.
     */
    public void sendToStore(T item) {
        if (this.items.containsValue(item)) {
            System.out.println("Отправка в магазин товара " + item.getName());
            for (Map.Entry<String, T> entry : items.entrySet()) {
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
        for (Map.Entry<String, T> entry : items.entrySet()) {
            if (entry.getValue() != null) {
                System.out.println(
                        entry.getKey() + " " +
                                entry.getValue().getName() + " " +
                                entry.getValue().getCost() + " " +
                                entry.getValue().getDateArrivalAtTheWarehouse() + " " +
                                entry.getValue().getProductItem()
                );
            }
        }
        System.out.println();
    }

    public void getFreePlaces() {
        for (Map.Entry<String, T> entry : items.entrySet()) {
            if (entry.getValue() == null) {
                System.out.println(entry.getKey());
            }
        }
    }

    public int getCostAllItems() {
        int count = 0;
        for (Map.Entry<String, T> entry : items.entrySet()) {
            if (entry.getValue() != null) {
                count += entry.getValue().getCost();
            }
        }
        return count;
    }

    public void printAllPlace() {
        System.out.println("---Все ячейки(ячейка/товар/стоим/датапоступл/видтовара)---");
        System.out.println("Склад № " + getNumber() + ":");
        for (Map.Entry<String, T> entry : items.entrySet()) {
            if (entry.getValue() != null) {
                System.out.println(
                        entry.getKey() + " " +
                                entry.getValue().getName() + " " +
                                entry.getValue().getCost() + " " +
                                entry.getValue().getDateArrivalAtTheWarehouse() + " " +
                                entry.getValue().getProductItem());
            } else {
                System.out.println(entry.getKey() + " пустая ячейка");
            }
        }
        System.out.println();
    }

    public int getNumber() {
        return number;
    }

}
