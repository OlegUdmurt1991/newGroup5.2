package HW.Lesson3dot10.second.fruits;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pineapple extends Fruit implements Serializable {
    public Pineapple() {
        name = "Pineapple";
        weight = 55.5;
        price = BigDecimal.valueOf(635.26);
        freshness = Freshness.FRESH;
    }
}
