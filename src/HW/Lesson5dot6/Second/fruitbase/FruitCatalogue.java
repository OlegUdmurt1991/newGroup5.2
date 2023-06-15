package HW.Lesson5dot6.Second.fruitbase;
/**
 * - класс FruitCatalogue
 * находится в пакете com.fruitbase
 * содержит поле массив Fruit - список записей известных фруктов
 * содержит конструктор без параметров
 * при создании во внутренний массив добавляются записи-экзмепляры известных фруктов
 * содержит метод findFruit, доступный только в пакете
 * по переданному слову проверяет есть ли информация о таком фрукте
 * если есть, то возвращает Fruit. Если нет, то возвращает null.
 */

import HW.Lesson5dot6.Second.fruitbase.fruits.*;

import java.io.Serializable;
import java.math.BigDecimal;

public class FruitCatalogue implements Serializable {

    private Fruit[] fruits; //каталог, список фруктов

    public FruitCatalogue() {
        Apple apple = new Apple(10.5, BigDecimal.valueOf(383.25), "Apple");
        Orange orange = new Orange(5, BigDecimal.valueOf(432.03), "Orange");
        Banana banana = new Banana(3.5, BigDecimal.valueOf(643.17), "Banana");
        Pineapple pineapple = new Pineapple(8.2, BigDecimal.valueOf(872.34), "Pineapple");
        this.fruits = new Fruit[]{apple, orange, banana, pineapple};
    }

    /**
     * Метод ищет фрукт по переданному названию фрукта. Внутри идёт сравнение с каталогом фруктов - массивом fruits.
     *
     * @param fruitName название фрукта, по которому будет происходить поиск
     * @return фрукт типа Fruit. Если фрукт не найден - возвращается null
     */
    Fruit findFruit(String fruitName) {
        for (Fruit fruit : fruits)
            if (fruit.getName().equals(fruitName)) return fruit.clone();
        return null;
    }

    public Fruit[] getFruits() {
        return fruits;
    }
}