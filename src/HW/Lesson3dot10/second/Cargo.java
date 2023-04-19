package HW.Lesson3dot10.second;

import HW.Lesson3dot10.second.fruits.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cargo {
    ArrayList<Fruit> fruits = new ArrayList<>();
    private double totalWeight = 0;
    private BigDecimal totalPrice = BigDecimal.ZERO;
    private double removedWeight = 0;
    private BigDecimal removedPrice = BigDecimal.ZERO;

    public double getTotalWeight() {
        return totalWeight;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public double getRemovedWeight() {
        return removedWeight;
    }

    public BigDecimal getRemovedPrice() {
        return removedPrice;
    }

    void addFruit(Fruit fruit) {
        fruits.add(fruit);
        totalWeight += fruit.getWeight();
        totalPrice = totalPrice.add(fruit.getPrice());
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    void removeFruits(List<Fruit> selectedFruits) {
        fruits.removeIf(selectedFruits::contains);
        for (Fruit fruit : selectedFruits) {
            removedWeight += fruit.getWeight();
            removedPrice = removedPrice.add(fruit.getPrice());
        }
    }
}