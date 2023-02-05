package HW.Lesson19.ru.pflb.professions;

import HW.Lesson19.ru.pflb.Person;

public class Driver extends Person {
    int drivingExperience; //кол-во целых лет опыта
    int licenseId;  //номер водительского удостоверения

    public Driver(int drivingExperience, int licenseId, String name, int age) {
        super(name, age);
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return (name + " - возраст: " + age + '\n' + "Стаж: " + drivingExperience + " года"
                + '\n' + "№ удостоверения " + licenseId);
    }
}