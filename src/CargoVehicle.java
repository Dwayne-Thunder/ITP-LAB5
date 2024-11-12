public class CargoVehicle {
    protected String model;
    protected float fuelCapacity;
    protected float fuelConsumption;

    public CargoVehicle(String model, float fuelCapacity, float fuelConsumption){
        this.model = model;
        this.fuelCapacity= fuelCapacity; // В литрах
        this.fuelConsumption = fuelConsumption; // В литрах на 100 км
    }

    public float calculateMaxRange(){
        return (fuelCapacity * 100) / fuelConsumption;  // Максимальный пробег в км
    }
    public void showInfo(){
        System.out.println("Модель: "+ model);
        System.out.println("Объем бака: "+ fuelCapacity + " литров");
        System.out.println("Расход топлива: "+ fuelConsumption + " л/100 км");
        System.out.println("Максимально возможный пробег: "+ calculateMaxRange() + " км");

    }
}
