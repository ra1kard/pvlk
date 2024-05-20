package interfaces.task7;

public interface Transportable {
    int costDelivery();             //стоимость доставки
    int getWidth();                 //получение ширины транспортируемого объекта
    int getHeight();                //получение высоты транспортируемого объекта
    int getLength();                //получение длины транспортируемого объекта

    //default метод, возвращающий объём объекта
    default int getVolume() {
        return getWidth() * getHeight() * getLength();
    }

}
