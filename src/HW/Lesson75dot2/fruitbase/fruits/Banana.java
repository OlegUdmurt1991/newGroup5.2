package HW.Lesson75dot2.fruitbase.fruits;

import java.math.BigDecimal;

public class Banana extends Fruit {
    public Banana() {
        name = "Banana";
        weight = 25.8;
        price = BigDecimal.valueOf(224.40);
        freshness = Freshness.SPOILED;
    }
}
