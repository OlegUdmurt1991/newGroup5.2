package HW.Lesson66.Task2.com.fruitbase;

import HW.Lesson66.Task2.com.fruitbase.fruits.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

class FruitCatalogue {
    /**
     * Массив типа Fruit (private-доступ только внутри класса)
     * (final-после инициализации массива в конструкторе этого класса он не может быть изменен)
     */
    private final Fruit[] fruits;

    public FruitCatalogue() {
        /**создаем новый массив объектов типа Fruit и присваеваем его fruits*/
        fruits = new Fruit[]{
                /**Заполняем массив*/
                new Apple(1, BigDecimal.valueOf(2.5), "apple"),
                new Orange(1, BigDecimal.valueOf(2.4), "orange"),
                new Banana(1, BigDecimal.valueOf(1.3), "banana"),
                new Pineapple(1, new BigDecimal("3.0"), "pineapple"),
        };

    }

    /**
     * Метод принимает значение name и сравнивает его с name из списка fruits
     */
    public Fruit findFruit(String name) {
        for (int i = 0; i < fruits.length; i++) {
            /**переменной fruit присваиваем значение из массива fruits с индексом i*/
            Fruit fruit = fruits[i];
            /**Сравниваем полученные имена*/
            if (fruit.getName().equalsIgnoreCase(name)) {
                return fruit;
            }
        }
        return null;
    }
}