package HW.Lesson75dot2.fruitbase.customers;

import HW.Lesson75dot2.fruitbase.Cargo;
import HW.Lesson75dot2.fruitbase.fruits.Fruit;

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