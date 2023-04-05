package HW.Lesson75dot2.fruitbase.customers;

import HW.Lesson75dot2.fruitbase.Cargo;
import HW.Lesson75dot2.fruitbase.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class freshCustomer extends Customer {
    public freshCustomer(String name) {
        super(name);
    }

    @Override
    public List<Fruit> takeFruits(Cargo cargo) {
        List<Fruit> freshFruits = new ArrayList<>();
        for (Fruit fruit : cargo.getFruits()) {
            if (fruit.isFresh()) {
                freshFruits.add(fruit);
            }
        }
        purchases.addAll(freshFruits);
        return purchases;
    }
}