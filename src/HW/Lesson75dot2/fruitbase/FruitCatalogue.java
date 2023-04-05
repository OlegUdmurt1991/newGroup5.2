package HW.Lesson75dot2.fruitbase;

import HW.Lesson75dot2.fruitbase.fruits.*;

import java.math.BigDecimal;

public class FruitCatalogue {

    Fruit[] fruit = {new Apple(), new Orange(), new Banana(), new Pineapple()};

    FruitCatalogue() {
    }

    public Fruit findFruit(String fruitName) {
        for (Fruit f : fruit) {
            if (f.getName().equals(fruitName)) {
                return f;
            }
        }
        return null;
    }
}