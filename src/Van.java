public class Van extends CargoVehicle{
    private float cargoVolume; // Объем груза в куб. метрах
    private static int numberOfVans = 0; // Статическая переменная для подсчета фургонов

    public Van(String model, float fuelCapacity, float fuelConsumption, float cargoVolume) {
        super(model, fuelCapacity, fuelConsumption);
        this.cargoVolume = cargoVolume;
        numberOfVans++;
    }

    public float getCargoVolume() {
        return cargoVolume;
    }

    public static float getNumberOfVans() {
        return numberOfVans;
    }

    public void displayInfo() {
        super.showInfo();
        System.out.println("Объем груза: " + cargoVolume + " куб. м");
    }
}
