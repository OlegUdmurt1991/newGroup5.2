package HW.Lesson19;

import static HW.Lesson19.HealthState.HEALTHY;

public class Vet {
    String name; // Имя ветеринара

    void treatAnimal(Animal animal) {

        if (animal.health.equals(HEALTHY)) {
            name = "Айболит"; //Имя врача
            System.out.println("Врач " + name + " не нужен " + '\n');
        } else {
            name = "Айболит"; //Имя врача
            System.out.println("Врач " + name + " ведет прием " + '\n');
        }
    }
}