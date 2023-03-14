package HW.Lesson66.Task2.com.fruitbase.fruits;

import java.math.BigDecimal;

public class Orange extends Fruit {
    /**
     * конструктор, который наследует свойства и методы от родительского класса Fruit
     */
    public Orange(double weight, BigDecimal price, String name) {
        /**super используется для вызова конструктора родительского класса и передачи параметров ему*/
        super(weight, price, name);
    }
}
