package HW.Lesson66.Task2.com.fruitbase;

import HW.Lesson66.Task2.com.fruitbase.fruits.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

class FruitCatalogue {
    private final Fruit[] fruits;

    public FruitCatalogue() {
        fruits = new Fruit[] {
                new Apple(0.1, BigDecimal.valueOf(1.5), "Golden"),
                new Apple(0.2, BigDecimal.valueOf(2.5), "Granny Smith"),
                new Orange(0.15, BigDecimal.valueOf(2.0), "Valencia"),
                new Orange(0.12, BigDecimal.valueOf(1.8), "Navel"),
                new Banana(0.1, BigDecimal.valueOf(1.0), "Cavendish"),
                new Banana(0.12, new BigDecimal(1.2), "Lady Finger"),
                new Pineapple(1.5, new BigDecimal("3.0"), "Queen"),
                new Pineapple(2.0, new BigDecimal("4.0"), "Red Spanish")
        };

    }

    public Fruit findFruit(String name) {
        for (Fruit fruit : fruits) {
            if (fruit.getName().equalsIgnoreCase(name)) {
                return fruit;
            }
        }
        return null;
    }
}