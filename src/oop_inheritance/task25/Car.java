package oop_inheritance.task25;

public class Car {
    private Brand brand;                //марка авто (Enum)
    private int fuelTank;               //вместимость топливного бака
    private int remainingFuel;          //остаток топлива в топливном баке
    private int mileage = 0;            //пробег авто

    Car(Brand brand, int fuelTank, int remainingFuel, int mileage) {
        this.brand = brand;
        this.fuelTank = fuelTank;
        this.remainingFuel = remainingFuel;
        this.mileage = mileage;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getFuelTank() {
        return fuelTank;
    }
    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }
    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * уменьшает кол-во топлива в баке, в зависимости от расстояния - ОК
     * на каждые 10 км тратится 2 литра топлива - ОК
     */
    public void drive(int km) {
        setFuelTank(getFuelTank() - (km / 10 * 2));
    }

}
