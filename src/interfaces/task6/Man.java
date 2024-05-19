package interfaces.task6;

import java.util.ArrayList;

public class Man extends Human {
    private ArrayList<Cloth> listClothes = new ArrayList<>();

    Man(String name, Size size, Style preferStyle) {
        super(name, size, preferStyle);
    }

    public ArrayList<Cloth> getListClothes() {
        return listClothes;
    }

    public void addListClothes(Cloth cloth) {
        if (cloth.getSex() == Sex.MALE || cloth.getSex() == Sex.UNISEX) {
            this.listClothes.add(cloth);
        }
    }

    public void addListClothes(ArrayList<Cloth> cloth) {
        for (Cloth cloth1 : cloth) {
            if (cloth1.getSex() == Sex.MALE || cloth1.getSex() == Sex.UNISEX) {
                this.listClothes.add(cloth1);
            }
        }
    }

    public void print() {
        if (listClothes.isEmpty()) {
            System.out.println("Мужчина "+ super.getName() +
                    " еще ничего не купил, дайте ему консультанта!");
        } else {
            System.out.println("Мужчина " + super.getName() + " купил одежду:");
            for (Cloth listCloth : listClothes) {
                System.out.println(listCloth.getName() + " " + listCloth.getSex());
            }
        }
        System.out.println();
    }

}
