package HW.Lesson6dot4.Second.fruitbase;

import HW.Lesson6dot4.Second.fruitbase.fruits.Fruit;

import java.math.BigDecimal;

public interface Delivery {
    double getWeight();

    BigDecimal getPrice();

    void addFruit(Fruit fruit);

    Fruit[] getFruits();

    Fruit removeFruit(Fruit fruit);
}
