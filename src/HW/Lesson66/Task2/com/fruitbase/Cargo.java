package HW.Lesson66.Task2.com.fruitbase;

import HW.Lesson66.Task2.com.fruitbase.fruits.Fruit;


import java.math.BigDecimal;
import java.util.Arrays;

public class Cargo {
    private Fruit[] fruits;

    public Cargo() {
        fruits = new Fruit[0];
    }

    public double getWeight() {
        double weight = 0;
        for (Fruit fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.valueOf(0);
        for (Fruit fruit : fruits) {
            price =price.add(fruit.getPrice()); //addfruit.getPrice();
        }
        return price;
    }

    void addFruit(Fruit fruit) {
        Fruit[] newFruits = Arrays.copyOf(fruits, fruits.length + 1);
        newFruits[fruits.length] = fruit;
        fruits = newFruits;
    }
}