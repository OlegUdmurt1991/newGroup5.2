package HW.Lesson7dot6.Third;

import HW.Lesson7dot6.Third.Fruits.Apple;
import HW.Lesson7dot6.Third.Fruits.Orange;
import HW.Lesson7dot6.Third.Vegetable.Cucumber;
import HW.Lesson7dot6.Third.Vegetable.Tomato;

import java.util.HashMap;

/**
 * Создать ArrayList plants и заполнить его экземплярами фруктов и овощей всех видов по 1 штуке каждого
 * (!в 1 ArrayList). Создать HashMap и заполнить его фруктами и овощами с помощью forEach,
 * в ключ записывая название фрукта/овоща, а в значение - само растение.
 * Вывести на экран название растения из карты и рядом с ним имя класса через пробел.
 */
public class Main {
    public static void main(String[] args) {
        Plant apple = new Apple();
        Plant orange = new Orange();
        Plant tomato = new Tomato();
        Plant cucumber = new Cucumber();

        FruitBase fruitBase = new FruitBase();
        fruitBase.addItem(apple);
        fruitBase.addItem(tomato);
        fruitBase.addItem(orange);
        fruitBase.addItem(cucumber);

        HashMap<String, Plant> hashMap = new HashMap<>();

        fruitBase.plants.forEach(p -> {
            hashMap.put(p.getName(), p);
            //Вывести на экран название растения из карты и рядом с ним имя класса через пробел.
            System.out.println(p.getName() + " " + p.getClass().getSimpleName());
        });
    }
}