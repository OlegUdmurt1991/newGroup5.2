package HW.Lesson19.ru.pflb.vehicles;

import HW.Lesson19.ru.pflb.details.Engine;
import HW.Lesson19.ru.pflb.professions.Driver;

public class SportCar extends Car {
    int maxVelocity; // - максимальная скорость в км/ч
    VehicleClass vehicleClass; //Класс автомобиля типа VehicleClass

    public SportCar(String model, VehicleClass vehicleClass, int weight, Engine engine, Driver driver, int maxVelocity) {
        super(model, vehicleClass, weight, engine, driver);
        this.maxVelocity = maxVelocity;
        this.vehicleClass = vehicleClass;
    }

    @Override
    public String toString() {
        return ("Модель: " + model + " , Класс: " + vehicleClass
                + '\n' + "Характеристики: " + '\n' + "вес: " + weight + '\n' +
                "двигатель: " + engine + "Вт" + '\n' + "Водитель: " + driver + '\n'
                + "максимальная скорость в км/ч: " + maxVelocity);
    }
}