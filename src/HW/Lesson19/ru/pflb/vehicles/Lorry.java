package HW.Lesson19.ru.pflb.vehicles;

import HW.Lesson19.ru.pflb.details.Engine;
import HW.Lesson19.ru.pflb.professions.Driver;

public class Lorry extends Car {
    int loadingAmount; //- грузоподъемность в киллограммах
    VehicleClass vehicleClass; //Класс автомобиля типа VehicleClass

    public Lorry(String model, VehicleClass vehicleClass, int weight, Engine engine, Driver driver, int loadingAmount) {
        super(model, vehicleClass, weight, engine, driver);
        this.loadingAmount = loadingAmount;
        this.vehicleClass = vehicleClass;
    }

    @Override
    public String toString() {
        return ("Модель: " + model + " , Класс: " + vehicleClass
                + '\n' + "Характеристики: " + '\n' + "вес: " + weight + '\n' +
                "двигатель: " + engine + "Вт" + '\n' + "Водитель: " + driver + '\n'
                + "Грузоподъемность: " + loadingAmount + '\n' + '\n');
    }
}