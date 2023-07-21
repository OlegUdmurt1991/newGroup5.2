package HW.Lesson7dot6.First;

import HW.Lesson7dot6.First.Fruits.Apple;
import HW.Lesson7dot6.First.Fruits.Banana;
import HW.Lesson7dot6.First.Fruits.Fruit;
import HW.Lesson7dot6.First.Vegetable.Tomato;
import HW.Lesson7dot6.First.Vegetable.Vegetable;
/**1.Создать интерфейс Fruit без методов и реализовать его в яблоках и бананах.

 2.Создать интерфейс Vegetable без методов и реализовать его в огурцах и помидорах.

 3.Реализовать класс Basket, с методом addItem, который будет принимать в себя только овощи или фрукты
 и помещать это всё в глобальную переменную - массив (5 элементов достаточно) внутри класса.

 4.В отдельном классе в методе main создать по одному фрукту, овощу и по одной корзине для фруктов
 и для овощей отдельно (всего две). Всю клетчатку надо разложить по соответствующим корзинам,
 если получится положить огурец в корзину для фруктов, то стоит ещё раз пересмотреть тему с дженериками.
 * */
public class Shop {
    public static void main(String[] args) {
        // Создание фрукта
        Fruit apple = new Apple();
        Fruit banana = new Banana();
        // Создание овоща
        Vegetable tomato = new Tomato();

        // Создание корзины для фруктов и добавление фрукта
        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.addItem(apple);
        fruitBasket.addItem(banana);
        //fruitBasket.addItem(tomato); tomato нельзя положить в фрукты

        // Создание корзины для овощей и добавление овоща
        Basket<Vegetable> vegetableBasket = new Basket<>();
        vegetableBasket.addItem(tomato);
    }
}