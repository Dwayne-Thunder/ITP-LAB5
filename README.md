# Описание работы программы
## Базовый класс CargoVehicle 
Содержит общие свойств:
- model,
- fuelCapacity,
- fuelConsumption
- метод ```calculateMaxRange()``` для вычисления максимального пробега.
## Класс Truck
наследует ```CargoVehicle```, добавляет свойство ```loadCapacity``` и статическую переменную ```numberOfTrucks```, чтобы отслеживать количество созданных грузовиков. Также включает статический метод ```getNumberOfTrucks()```.
## Класс Van
наследует ```CargoVehicle```, добавляет свойство ```cargoVolume``` и статическую переменную ```numberOfVans```, а также метод ```getNumberOfVans()```.
## Меню: 
### Предоставляет пользователю возможность:
- Просматривать информацию о транспортных средствах.
- Изменять свойства транспортного средства.
- Вычислять максимальный пробег.
- Отображать количество грузовиков и фургонов.
- Завершать программу.