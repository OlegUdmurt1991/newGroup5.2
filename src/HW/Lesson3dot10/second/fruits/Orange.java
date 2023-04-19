package HW.Lesson3dot10.second.fruits;

import java.io.Serializable;
import java.math.BigDecimal;

public class Orange extends Fruit implements Serializable {
    public Orange() {
        name = "Orange";
        weight = 40.5;
        price = BigDecimal.valueOf(578.00);
        freshness = Freshness.FRESH;
    }
}