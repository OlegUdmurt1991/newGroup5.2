package HW.Lesson3dot10.second;

import HW.Lesson3dot10.second.fruits.*;

import java.io.Serializable;

public class FruitCatalogue implements Serializable {

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