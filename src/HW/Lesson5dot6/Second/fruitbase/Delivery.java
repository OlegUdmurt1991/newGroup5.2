package HW.Lesson5dot6.Second.fruitbase;

import HW.Lesson5dot6.Second.fruitbase.fruits.Fruit;

import java.math.BigDecimal;

public interface Delivery {
    double getWeight();

    BigDecimal getPrice();

    void addFruit(Fruit fruit);

    Fruit[] getFruits();

    Fruit removeFruit(Fruit fruit);
}
