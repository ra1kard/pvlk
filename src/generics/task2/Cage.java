package generics.task2;

import java.util.ArrayList;

public class Cage<T extends Animal> {
    private int numberCage;             //номер клетки
    private int capacity;               //вместимость (считаю не может быть меньше 1)
    private int added;                  //добавлено
    private ArrayList<T> animals;       //список животных

    Cage(int capacity, int numberCage) {
        animals = new ArrayList<>();
        if (capacity < 1) {
            System.out.println("Вместимость не может быть меньше 1");
        } else {
            this.capacity = capacity;
            this.numberCage = numberCage;
        }
    }

    //добавление животного (не добавлять животное, если превышен лимит максимального кол-ва)
    public void addAnimal(T animal) {
        System.out.print("Пробуем добавить в клетку №" + numberCage + " " + animal.getName() + " = ");
        if (isFreePlaces(animal)) {                     //если пусто - ок
            animals.add(animal);
            added++;
            System.out.println("Успех. Животное добавлено.");
        } else if (capacity > added) {                  //если вместимость позволяет
            animals.add(animal);
            added++;
            System.out.println("Успех. Животное добавлено.");
        } else {
            System.out.println("Отказ. В клетке максимальное кол-во животных.");
        }
    }

    //определяет возможность добавления животного в клетку
    public boolean isFreePlaces(T animal) {
        if (animals.isEmpty()) {                        //если пусто - ок
            return true;
        } else
            return (capacity > added);                  //если вместимость позволяет
    }

    //вывести животного из клетки (метод возвращает животное и удаляет его из списка животных клетки
    public Animal takeOutAnimal(String nameAnimal) {
        Animal tempAnimal = null;
        for (Animal animal : animals) {
            if (animal.getName().equals(nameAnimal)) {
                animals.remove(animal);
                System.out.println(animal.getName() + ": Животное выведено из клетки");
                tempAnimal = animal;
                break;
            }
        }
        return tempAnimal;
    }

    //перевод жив из тек клетки в другую (убед что в клетке куда перев есть своб место, иначе перев не вып)
    public void transferAnimal(String nameAnimal, Cage cageWhere) {
        System.out.println("Попытка трансфера животного " + nameAnimal
                + " из клетки №" + numberCage + " в " + cageWhere.getNumberCage());
        Animal tempAnimal = null;
        //проверим можно ли перевести в КлеткуБ
        boolean access = cageWhere.isFreePlaces(getAnimalByName(nameAnimal));
        if (access) {
            System.out.println("Перевод возможен");
            tempAnimal = takeOutAnimal(nameAnimal);     //вывести
            cageWhere.addAnimal(tempAnimal);            //добавить
        } else {
            System.out.println("Перевод невозможен, перепроверьте вместимость и тип животного");
        }
    }

    public void printAnimalsAdded() {
        System.out.println("Список животных в клетке №" + numberCage + ":");
        if (animals.isEmpty()) {
            System.out.println("Пусто");
        } else {
            for (Animal animal : animals) {
                System.out.println(animal.getName());
            }
        }
        System.out.println();
    }

    //получение животного по его имени
    public Animal getAnimalByName(String nameAnimal) {
        Animal tempAnimal = null;
        for (Animal animal : animals) {
            if (animal.getName().equals(nameAnimal)) {
                tempAnimal = animal;
            }
        }
        return tempAnimal;
    }

    public Animal getYoungestAnimal() {
        int value = Integer.MAX_VALUE;
        Animal tempAnimal = null;
        for (Animal animal : animals) {
            if (animal.getAge() < value) {
                tempAnimal = animal;
                value = animal.getAge();
            }
        }
        return tempAnimal;
    }

    public Animal getOldestAnimal() {
        int value = 0;
        Animal tempAnimal = null;
        for (Animal animal : animals) {
            if (animal.getAge() > value) {
                tempAnimal = animal;
                value = animal.getAge();
            }
        }
        return tempAnimal;
    }



    public int getCapacity() {
        return capacity;
    }

    public ArrayList<T> getAnimals() {
        return animals;
    }

    public int getNumberCage() {
        return numberCage;
    }

}
