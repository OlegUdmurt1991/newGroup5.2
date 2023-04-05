package HW.Lesson75dot2.fruitbase.fruits;

import java.math.BigDecimal;

import java.math.BigDecimal;

public class Apple extends Fruit {
    public Apple() {
        name = "Apple";
        weight = 10.54;
        price = BigDecimal.valueOf(500);
        freshness = Freshness.FRESH;
    }
}
