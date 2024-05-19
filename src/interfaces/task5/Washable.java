package interfaces.task5;

public interface Washable {                     //моющийся
    String type = "Мойка";
    String wash();          //метод влажной уборки (мытья)
    int getCost();          //стоимость уборки
    String getName();
}
