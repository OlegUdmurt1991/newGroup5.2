package HW.Lesson75dot2.fruitbase;

import HW.Lesson75dot2.fruitbase.fruits.Fruit;

public class FruitBase {

    private final FruitCatalogue fruitCatalogue;

    public FruitBase() {  // конструктор без параметров
        this.fruitCatalogue = new FruitCatalogue();
    }

    public Cargo takeOrder(String... orderFruits) {
        Cargo cargo = new Cargo(); // создаем новый груз
        for (String orderFruit : orderFruits) {
            Fruit fruit = fruitCatalogue.findFruit(orderFruit); // ищем фрукт по его названию
            if (fruit != null) { // если фрукт найден
                cargo.addFruit(fruit); // добавляем его в груз
            }
        }
        return cargo; // возвращаем груз со всеми найденными фруктами
    }
}