package interfaces.task4;

import java.util.ArrayList;
import java.util.List;

public class Human implements Aliveable {
    private String name;
    private String surname;
    private ArrayList<HomeAnimal> homeAnimalList = new ArrayList<>();
    private ArrayList<Plant> plantList = new ArrayList<>();
    private ArrayList<Chair> chairList = new ArrayList<>();
    private boolean alive = true;

    Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * если человек погибает - должны погибнуть все его домашние животные и растения
     *
     * для этого реализуйте метод в классе человека, который делает погибшими всех, кто реализ интерф Aliveable
     * метод должен принимать список
     */
    void die(ArrayList<Aliveable> arrayList) {
        for (Aliveable a : arrayList) {
            a.setAlive(false);
        }
    }

    @Override
    public boolean isAlive() {
        return alive;
    }

    @Override
    public void setAlive(boolean value) {
        if (value) {
            this.alive = true;
        } else {
            this.alive = false;
            ArrayList<Aliveable> a = new ArrayList<>(List.of());
            a.addAll(getHomeAnimalList());
            a.addAll(getPlantList());
            this.die(a);
        }
    }

    public void print() {
        System.out.print("Человек:      ");
        System.out.println(
                "Имя: " + getName() +
                ", Фамилия: " + getSurname() +
                ", Кол-во животных: " + getHomeAnimalList().size() +
                ", Кол-во растений: " + getPlantList().size() +
                ", Живой? " + isAlive());

        System.out.println("----- Его животные: -----");
        int count = 1;
        for (HomeAnimal homeAnimal : homeAnimalList) {
            System.out.print(count++ + ". ");
            System.out.println(
                    "Имя: " + homeAnimal.getName() +
                    ", Живое? " + homeAnimal.isAlive());
        }

        System.out.println("----- Его растения: -----");
        count = 1;
        for (Plant plant : plantList) {
            System.out.print(count++ + ". ");
            System.out.println(
                    "Имя: " + plant.getName() +
                    ", Живое? " + plant.isAlive());
        }

        System.out.println("----- Его стулья: -----");
        count = 1;
        for (Chair chair : chairList) {
            System.out.print(count++ + ". ");
            System.out.println(chair.name());
        }

        System.out.println();
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public ArrayList<HomeAnimal> getHomeAnimalList() {
        return homeAnimalList;
    }
    public void setHomeAnimal(HomeAnimal homeAnimal) {
        this.homeAnimalList.add(homeAnimal);
    }

    public ArrayList<Plant> getPlantList() {
        return plantList;
    }
    public void setPlant(Plant plant) {
        this.plantList.add(plant);
    }

    public ArrayList<Chair> getChairList() {
        return chairList;
    }
    public void setChair(Chair chair) {
        this.chairList.add(chair);
    }

}
