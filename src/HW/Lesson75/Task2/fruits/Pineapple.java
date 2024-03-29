package HW.Lesson75.Task2.fruits;
/* - классы видов фруктов в пакете с классом Fruit
    находятся в пакете com.fruitbase.fruits
    Apple
    Orange
    Banana
    Pineapple
    Каждый класс наследуется от Fruit
    В конструкторе класса устанавливаются значения веса, цены, названия для фрукта*/

import java.math.BigDecimal;

public class Pineapple extends Fruit {
    public Pineapple() {
        name = "Pineapple";
        weight = 55.5;
        price = BigDecimal.valueOf(635.26);
        freshness = Freshness.FRESH;
    }
}
