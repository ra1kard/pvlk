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
        this.listClothes.add(cloth);
    }

    public void addListClothes(ArrayList<Cloth> cloth) {
        this.listClothes.addAll(cloth);
    }

    public void print() {
        if (listClothes.isEmpty()) {
            System.out.println("Девушка "+ super.getName() +
                    " еще ничего не купила, покажите ей скидки!");
        } else {
            System.out.println("Девушка " + super.getName() + " купила одежду:");
            for (Cloth listClothe : listClothes) {
                System.out.println(listClothe.toString());
            }
        }
        System.out.println();
    }

}
