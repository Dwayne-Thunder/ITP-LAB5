public class Truck extends CargoVehicle {
    private float loadCapacity; // Грузоподъемность в кг
    private static int numberOfTrucks = 0; // Статическая переменная для подсчета грузовиков

    public Truck(String model, float fuelCapacity, float fuelConsumption, float loadCapacity) {
        super(model, fuelCapacity, fuelConsumption);
        this.loadCapacity = loadCapacity;
        numberOfTrucks++;
    }

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public static float getNumberOfTrucks() {
        return numberOfTrucks;
    }

    public void displayInfo() {
        super.showInfo();
        System.out.println("Грузоподъемность: " + loadCapacity + " кг");
    }
}
