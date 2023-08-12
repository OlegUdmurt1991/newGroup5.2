package HW.Lesson7dot9.First;

import HW.Lesson7dot9.First.Fruits.Apple;
import HW.Lesson7dot9.First.Fruits.Banana;
import HW.Lesson7dot9.First.Fruits.Fruit;
import HW.Lesson7dot9.First.Vegetable.Cucumbers;
import HW.Lesson7dot9.First.Vegetable.Tomato;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Создать общий родительский интерфейс для овощей и фруктов Plant.
 * Создать ArrayList plants и заполнить его экземплярами фруктов и овощей всех видов по 1 штуке каждого (!в 1 ArrayList).
 * Создать ArrayList, который принимает только фрукты, назвать multifruit. Заполнить multifruit только фруктами из plants,
 * используя streamAPI. Один только stream, никаких циклов, вторых stream открывать не надо.
 * Вывести на экран названия фруктов.
 */
public class Shop {
    public static void main(String[] args) {
        // Создание фрукта
        Plant apple = new Apple();
        Plant banana = new Banana();
        // Создание овоща
        Plant tomato = new Tomato();
        Plant cucumber = new Cucumbers();

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(apple);
        plants.add(banana);
        plants.add(tomato);
        plants.add(cucumber);

        ArrayList<Plant> multifruit =
                plants.stream()
                        .filter(frukt -> frukt instanceof Fruit)
                        .collect(Collectors.toCollection(ArrayList::new));
        multifruit.forEach(fruit -> System.out.println(fruit.toString()));
    }
}