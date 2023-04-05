package HW.Lesson75dot2.fruitbase.customers;

import HW.Lesson75dot2.fruitbase.Cargo;
import HW.Lesson75dot2.fruitbase.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    protected List<Fruit> purchases;
    protected String name;

    public Customer(String name) {
        this.purchases = new ArrayList<>();
        this.name = name;
    }

    public abstract List<Fruit> takeFruits(Cargo cargo);

    public void printPurchases() {
        if (purchases.isEmpty()) {
            System.out.println(name + " пока ничего не покупал.");
        } else {
            System.out.println(name + " купил:");
            for (Fruit fruit : purchases) {
                System.out.println(fruit.getName());
            }
            System.out.println();
        }
    }
}