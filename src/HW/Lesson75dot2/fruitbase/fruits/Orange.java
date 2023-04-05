package HW.Lesson75dot2.fruitbase.fruits;

import java.math.BigDecimal;

public class Orange extends Fruit {
    public Orange() {
        name = "Orange";
        weight = 40.5;
        price = BigDecimal.valueOf(578.00);
        freshness = Freshness.FRESH;
    }
}