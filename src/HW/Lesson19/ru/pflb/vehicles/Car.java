package HW.Lesson19.ru.pflb.vehicles;

import HW.Lesson19.ru.pflb.details.Engine;
import HW.Lesson19.ru.pflb.professions.Driver;

public class Car {
    String model; //название модели автомобиля
    VehicleClass vehicleClass; // класc автомобиля типа vehicleClass
    int weight; //- вес автомобиля в килограммах
    Driver driver; //Водитель типа Driver
    Engine engine; //Мощность двигателя типа Engine

    public static void start() {
        System.out.println("Поехали");
    }

    public static void stop() {
        System.out.println("Остановиться");
    }

    public static void turnRight() {
        System.out.println("Поворот направо");
    }

    public static void turnLeft() {
        System.out.println("Поворот налево");
    }

    public Car(String model, VehicleClass vehicleClass, int weight, Engine engine, Driver driver) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    @Override
    public String toString() {

        return ("Модель: " + model + " , Класс: " + vehicleClass
                + '\n' + "Характеристики: " + '\n' + "вес: " + weight + "кг." + '\n' +
                "двигатель: " + engine + "Вт" + '\n' + "Водитель: " + driver + '\n' + '\n');
    }
}