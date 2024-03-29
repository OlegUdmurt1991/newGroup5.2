package HW.Lesson3dot10.second.customers;

import HW.Lesson3dot10.second.Cargo;
import HW.Lesson3dot10.second.fruits.Fruit;

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