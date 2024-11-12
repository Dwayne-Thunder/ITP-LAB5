import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<CargoVehicle> vehicles = new ArrayList<>();
        vehicles.add(new Truck("MAN TGA", 400, 25, 12000));//Добавляем 2 машины для теста
        vehicles.add(new Van("Ford Transit", 80, 10, 15));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nМеню:");
            System.out.println("1. Показать информацию о транспортных средствах");
            System.out.println("2. Изменить свойства транспортного средства");
            System.out.println("3. Рассчитать максимальный пробег");
            System.out.println("4. Показать количество грузовиков и фургонов");
            System.out.println("5. Выйти");

            System.out.print("Выберите пункт меню: ");
            int choice = scanner.nextInt();
            System.out.println("========================");

            switch (choice) {
                case 1:
                    for (CargoVehicle vehicle : vehicles) {
                        vehicle.showInfo();
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Введите индекс транспортного средства для изменения (начиная с 0): ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < vehicles.size()) {
                        System.out.print("Введите новую емкость бака: ");
                        int newFuelCapacity = scanner.nextInt();
                        System.out.print("Введите новый расход топлива: ");
                        int newFuelConsumption = scanner.nextInt();
                        vehicles.get(index).fuelCapacity = newFuelCapacity;
                        vehicles.get(index).fuelConsumption = newFuelConsumption;
                    } else {
                        System.out.println("Неверный индекс.");
                    }
                    break;
                case 3:
                    for (CargoVehicle vehicle : vehicles) {
                        System.out.println(vehicle.model + " - максимальный пробег: " + vehicle.calculateMaxRange() + " км");
                    }
                    break;
                case 4:
                    System.out.println("Количество грузовиков: " + Truck.getNumberOfTrucks());
                    System.out.println("Количество фургонов: " + Van.getNumberOfVans());
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
        scanner.close();
        System.out.println("Программа завершена.");
    }
}