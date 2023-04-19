package HW.Lesson3dot10.second.fruits;

import java.io.Serializable;
import java.math.BigDecimal;

public class Apple extends Fruit implements Serializable {
    public Apple() {
        name = "Apple";
        weight = 10.54;
        price = BigDecimal.valueOf(500);
        freshness = Freshness.FRESH;
    }
}
