package HW.Lesson7dot6.Second;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basket {
    Map<Plant, Integer> globalVariable;


    public Basket() {
        globalVariable = new HashMap<>();
    }

    public void addItem(Plant plant, int quantity) {
        globalVariable.put(plant, quantity);
    }

    public void makeSalad() {
        System.out.println("Готовим салатик:");

        Set<Plant> keys = globalVariable.keySet();

        for (Plant plant : keys) {
            int quantity = globalVariable.get(plant);

            for (int i = 0; i < quantity; i++) {
                System.out.println("Режем - " + plant.getName());
            }
        }

        System.out.println("\nУгощайся!");
    }
}