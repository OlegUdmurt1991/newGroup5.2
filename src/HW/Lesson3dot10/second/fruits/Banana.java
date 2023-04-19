package HW.Lesson3dot10.second.fruits;

import java.io.Serializable;
import java.math.BigDecimal;

public class Banana extends Fruit implements Serializable {
    public Banana() {
        name = "Banana";
        weight = 25.8;
        price = BigDecimal.valueOf(224.40);
        freshness = Freshness.SPOILED;
    }
}
