package HW.Lesson3dot10.second.customers;

import HW.Lesson3dot10.second.Cargo;
import HW.Lesson3dot10.second.fruits.Fruit;

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