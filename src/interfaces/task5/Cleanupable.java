package interfaces.task5;

public interface Cleanupable {                  //очищаемый
    String type = "Чистка";
    String cleanup();       //метод уборки
    int getCost();          //стоимость уборки
}
