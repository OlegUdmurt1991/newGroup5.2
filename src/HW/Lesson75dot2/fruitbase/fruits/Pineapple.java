package HW.Lesson75dot2.fruitbase.fruits;

import java.math.BigDecimal;

public class Pineapple extends Fruit {
    public Pineapple() {
        name = "Pineapple";
        weight = 55.5;
        price = BigDecimal.valueOf(635.26);
        freshness = Freshness.FRESH;
    }
}
