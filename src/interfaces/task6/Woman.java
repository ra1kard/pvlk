package interfaces.task6;

import java.util.ArrayList;

public class Woman extends Human {
    private ArrayList<Cloth> listClothes = new ArrayList<>();

    Woman(String name, Size size, Style preferStyle) {
        super(name, size, preferStyle);
    }

    public ArrayList<Cloth> getListClothes() {
        return listClothes;
    }

    public void addListClothes(Cloth cloth) {
        if (cloth.getSex() == Sex.FEMALE || cloth.getSex() == Sex.UNISEX) {
            this.listClothes.add(cloth);
        }
    }

    public void addListClothes(ArrayList<Cloth> cloth) {
        for (Cloth cloth1 : cloth) {
            if (cloth1.getSex() == Sex.FEMALE || cloth1.getSex() == Sex.UNISEX) {
                this.listClothes.add(cloth1);
            }
        }
    }

    public void print() {
        if (listClothes.isEmpty()) {
            System.out.println("Девушка "+ super.getName() +
                    " еще ничего не купила, покажите ей скидки!");
        } else {
            System.out.println("Девушка " + super.getName() + " купила одежду:");
            for (Cloth listCloth : listClothes) {
                System.out.println(listCloth.getName() + " " + listCloth.getSex());
            }
        }
        System.out.println();
    }

}
