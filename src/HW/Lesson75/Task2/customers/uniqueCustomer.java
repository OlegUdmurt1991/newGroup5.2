package HW.Lesson75.Task2.customers;

import HW.Lesson75.Task2.Cargo;
import HW.Lesson75.Task2.fruits.Fruit;

import java.util.List;

public class uniqueCustomer extends Customer {
    public uniqueCustomer(String name) {
        super(name);
    }

    @Override
    public List<Fruit> takeFruits(Cargo cargo) {
        List<Fruit> cargoFruits = cargo.getFruits();
        for (Fruit fruit : cargoFruits) {
            if (!purchases.contains(fruit)) {
                purchases.add(fruit);
            }
        }
        return purchases;
    }
}