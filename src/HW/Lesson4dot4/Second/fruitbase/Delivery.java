package HW.Lesson4dot4.Second.fruitbase;

import HW.Lesson4dot4.Second.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;

public interface Delivery {
    double getWeight();

    BigDecimal getPrice();

    void addFruit(Fruit fruit);

    Fruit[] getFruits();

    Fruit removeFruit(Fruit fruit);
}
