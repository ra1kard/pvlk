package classes.task6;

public class Grass {                //трава
    private int nutrition;          //питательность - считаем от 0 до 100%

    Grass(int nutritionFrom0To100) {
        this.nutrition = nutritionFrom0To100;
    }

    public int getNutrition() {
        return nutrition;
    }
    public void setNutrition(int nutrition) {
        this.nutrition = nutrition;
    }
}
