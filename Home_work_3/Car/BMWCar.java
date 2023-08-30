package Home_work_3.Car;

public class BMWCar extends Car implements Refuelling, Wiping {

    private int loadCapacity;

    public BMWCar(String brand, String model, Color color, TypeCar bodyType, int amountWheels, TypeFuel fuelType,
            TypeGearBox gearBoxType, double engineCapacity, int loadCapacity) {
        super(brand, model, color, bodyType, amountWheels, fuelType, gearBoxType, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;

    }

    public int getLoadCapacity() {
        return this.loadCapacity;
    }

    @Override
    public void fuel() {
        // Заправка топливом
    }

    @Override
    public void wipWindshield() {
        // Протирка лобового стекла
    }

    @Override
    public void wipHeadlights() {
        // Протирка фар
    }

    @Override
    public void wipMirrors() {
        // Протирка зеркал
    }

}