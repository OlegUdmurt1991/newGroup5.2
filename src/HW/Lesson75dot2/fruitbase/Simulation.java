package HW.Lesson75dot2.fruitbase;

import HW.Lesson75dot2.fruitbase.customers.Customer;
import HW.Lesson75dot2.fruitbase.customers.freshCustomer;
import HW.Lesson75dot2.fruitbase.customers.freshCustomer;
import HW.Lesson75dot2.fruitbase.customers.uniqueCustomer;
import HW.Lesson75dot2.fruitbase.fruits.Fruit;


import java.util.List;

public class Simulation {
    public static void main(String[] args) {

        if (args.length > 0) {

            FruitBase fruitBase = new FruitBase();
            Customer[] customers = {new freshCustomer("Покупатель свежих фруктов"),
                    new uniqueCustomer("Покупатель уникальных фруктов")};
            for (Customer customer : customers) {
                System.out.print("Информация по грузу:" + "\n");
                Cargo cargo = fruitBase.takeOrder(args);
                System.out.println("Вес заказа, всего: " + cargo.getTotalWeight() + " кг.");
                System.out.println("Стоимость заказа, всего: " + cargo.getTotalPrice() + " у.е." + "\n");
                List<Fruit> selectedFruits = customer.takeFruits(cargo);
                cargo.removeFruits(selectedFruits);
                customer.printPurchases();
                System.out.println("Оставшийся груз: ");
                System.out.println("Вес оставшегося груза: " +
                        (cargo.getTotalWeight() - cargo.getRemovedWeight()) + " кг.");
                System.out.println("Стоимость оставшегося груза: " +
                        (cargo.getTotalPrice().subtract(cargo.getRemovedPrice())) + " у.е." + "\n");
            }

        } else {
            System.out.println("В заказ ничего не добавлено!");
        }
    }
}
