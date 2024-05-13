package interfaces.task6;

import java.util.ArrayList;

public class Shop {

    /**
     * для мужчин
     */
    public void dressSomeMan(Man man, Cloth cloth) {
        man.addListClothes(cloth);
    }
    public void dressSomeMan(Man man, ArrayList<Cloth> cloth) {
        man.addListClothes(cloth);
    }

    /**
     * для дам
     */
    public void dressSomeWoman(Woman woman, Cloth cloth) {
        if (woman.getSize() == cloth.getSize()) {
            woman.addListClothes(cloth);
        } else {
            System.out.println("Размер не подходит, к сожалению, Свеаатаааа, неси еще!");
        }
    }
    public void dressSomeWoman(Woman woman, ArrayList<Cloth> cloth) {
        woman.addListClothes(cloth);
    }

}
