package HW.Lesson7dot6.Second;

import HW.Lesson7dot6.Second.Fruits.Apple;
import HW.Lesson7dot6.Second.Fruits.Orange;
import HW.Lesson7dot6.Second.Fruits.Fruit;
import HW.Lesson7dot6.Second.Vegetable.Cucumbers;
import HW.Lesson7dot6.Second.Vegetable.Tomato;
import HW.Lesson7dot6.Second.Vegetable.Vegetable;

/**
 * Создать интерфейс Plant и унаследоваться от него фруктами и овощами (интерфейсами). В Plant создать метод getName(),
 * который будет возвращать строку. Реализовать для классов возврат имени фрукта ("Апельсин", "Огурец" и т.д.)
 * Вместо массива теперь в классе с корзиной поставить HashMap, в методе addItem добавлять новые элементы в ключ,
 * подумать, как можно "заглушить" значение value HashMap, так как вам оно точно не понадобится.
 * Реализовать метод iterator внутри класса корзин, чтобы он возвращал итерратор множества ключей глобального поля HashMap.
 * <p>
 * Реализовать метод makeSalad, в классе, где добавляли фрукты и овощи в корзине, в который можно кидать корзину.
 * Результатом работы этого метода должен был вывод в консоль строк (в методе вывод должен быть с помощью итератора,
 * который реализовали в этом задании):
 * ```
 * Готовим салатик:
 * Режем - тут должно быть столько же фруктов, сколько было элементов в корзине
 * <p>
 * Угощайся!
 * ```
 */
public class Shop {
    public static void main(String[] args) {

        // Создание фрукта и овоща
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        Vegetable tomato = new Tomato();
        Vegetable cucumber = new Cucumbers();

        // Создание корзины для фруктов и овощей и добавление фруктов и овощей
        Basket basket = new Basket();
        basket.addItem(apple, 2);
        basket.addItem(orange, 1);
        basket.addItem(tomato, 1);
        basket.addItem(cucumber, 2);

        basket.makeSalad();
    }
}