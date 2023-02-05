package HW.Lesson19.ru.pflb;
/*2: Создать класс Car в пакете ru.pflb.vehicles, Engine в пакете ru.pflb.details и Driver в пакете ru.pflb.professions.
        Создать класс Engine в пакете ru.pflb.details
        содержит поля:
        power - значение мощности двигателя в ваттах
        vendor - название производителя
        - toString - возвращает строку с информацией о двигателе
        Формат вывода:
        <vendor> - <мощность>

Сделать абстрактный класс Person в ru.pflb
        Класс содержит поля:
        age  - возраст в годах
        name - строка с ФИО
        Класс содержит методы:
        - toString - возвращает строку с информацией о водителе

        Создать класс Driver в пакете ru.pflb.professions, расширяющих класс Person
        Класс содержит поля:
        drivingExperience - кол-во целых лет опыта
        licenseId         - номер водительского удостоверения
        Метод toString надо переопределить.
        Формат вывода:
        <name> - возраст: <age>
        - стаж: <drivingExperience>
        - № удостоверения: <licenseId>

Создать enum VehicleClass в пакете ru.pflb.vehicles
        Enum имеет следующие значения:
        MINI
        SMALL
        MEDIUM
        LARGE
        EXECUTIVE
        LUXURY
        SPORT_UTILITY_CARS
        MULTI_PURPOSE
        SPORTS_CAR

        Создать класс Car в пакете ru.pflb.vehicles
        Класс содержит поля:
        model - название модели автомобиля
        vehicleClass - класc автомобиля типа vehicleClass
        weight - вес автомобиля в килограммах
        driver - водитель, за которым закреплен автомобиль
        engine - тип мотора типа Engine
        Класс содержит методы:
        - start         - вывод строку "Поехали"
        - stop()        - выводит строку "Останавливаемся"
        - turnRight()   - выводит строку "Поворот направо"
        - turnLeft()    - выводит строку "Поворот налево"
        - toString      - возвращает строку со всей информацией
        Формат вывода:
        Модель: <model>, класс: <vehicleClass>
        Характеристики:
        вес: <weight>
        двигатель: <вывод информации по engine>
        Водитель: <вывод информации по driver>

        Создать класс Lorry (грузовик), производный класса Car,
        в этом же пакете.
        Класс имеет дополнительный параметр:
        loadingAmount - грузоподъемность в киллограммах
        Значение vehicleClass устанавливается как MEDIUM или LARGE.
        Метод toString надо переопределить.
        К выводу в характеристики добавляется грузоподъемность.

        Создать класс SportCar, производный класса Car,
        в этом же пакете.
        Класс имеет дополнительный параметр:
        maxVelocity - максимальная скорость в км/ч
        Значение vehicleClass устанавливается как SPORTS_CAR.
        Метод toString надо переопределить.
        К выводу в характеристики добавляется максимальная скорость.

        Создайте класс Main со статическим метод main, в котором:
        - создаются 3 разных типа автомобиля (Lorry, SportCar, Car)
        все необходимые для этого объекты
        также создаются в main и передаются в необходимые конструкторы
        - вывести всю информацию о созданных машинах и вложенных объектах*/

import HW.Lesson19.ru.pflb.details.Engine;
import HW.Lesson19.ru.pflb.professions.Driver;
import HW.Lesson19.ru.pflb.vehicles.Car;
import HW.Lesson19.ru.pflb.vehicles.Lorry;
import HW.Lesson19.ru.pflb.vehicles.SportCar;
import HW.Lesson19.ru.pflb.vehicles.VehicleClass;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("PRIORA", VehicleClass.SMALL, 850, new Engine(33000, "LADA"),
                new Driver(2, 25065, "Спиди гончик", 23));
        System.out.println(car);
        Lorry lorry = new Lorry("Камаз", VehicleClass.LARGE, 3000, new Engine(60000, "MAZ"),
                new Driver(30, 978149, "Анатолыч", 48), 8888888);
        System.out.println(lorry);
        SportCar sportCar = new SportCar("911", VehicleClass.SPORTS_CAR, 600, new Engine(6666, "Porshe"),
                new Driver(25, 529605, "Михаил", 34), 199);
        System.out.println(sportCar);
    }
}