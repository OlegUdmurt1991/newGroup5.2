package HW.Lesson3dot10.second;
/**
 * Добавьте в программу по фруктовой базе возможность импорта/экспорта каталога фруктов.
 * Добавьте в класс FruitBase следующие методы:
 * - общедоступный метод exportCatalogue
 * Сериализует внутренний объект FruitCatalogue в проект.
 * Выводится сообщение "каталог экспортирован"
 * <p>
 * - общедоступный метод importCatalogue
 * Десериализует из проекта объект FruitCatalogue и результатом заменяет текущий внутренний объект.
 * Выводится сообщение "каталог импортирован"
 * <p>
 * Для использования этих методов добавьте обработку специальных аргументов ("флагов") в классе Simulation.
 * в методе main после создания объекта FruitBase добавьте проверку аргументов:
 * - если передан флаг "-e" или "--export", то вызовите метод exportCatalogue у объекта FruitBase
 * - если передан флаг "-i" или "--import", то вызовите метод importCatalogue у объекта FruitBase
 * <p>
 * Подготовьте необходимые классы к сериализации.
 * <p>
 * Для проверки экспортируйте каталог, зафиксируйте стоимость и цену полученного груза.
 * После экспорта каталога измените вес и цены у фруктов и зафиксируйте новые вес и стоимость.
 * Далее попробуйте имортировать каталог и обратите внимание, что стоимость и вес груза
 * расчитаны согласно экспортированному каталогу.
 */

import HW.Lesson3dot10.second.customers.Customer;
import HW.Lesson3dot10.second.customers.freshCustomer;
import HW.Lesson3dot10.second.customers.uniqueCustomer;
import HW.Lesson3dot10.second.fruits.Fruit;

import java.math.BigDecimal;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase();
        boolean exportFlag = false;
        boolean importFlag = false;
        if (args.length > 0) {
            for (String arg : args) {
                if (arg.equals("-e") || arg.equals("--export")) {
                    exportFlag = true;
                } else if (arg.equals("-i") || arg.equals("--import")) {
                    importFlag = true;
                }
            }

            if (exportFlag) {
                fruitBase.exportCatalogue();
                return;
            }

            if (importFlag) {
                fruitBase.importCatalogue();
                return;
            }
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
        fruitBase.exportCatalogue(); //"Экспортируем каталог"
        System.out.println("зафиксируем стоимость и вес полученного груза изначально:");
        fruitBase.takeOrder(args);//Фиксируем стоимость и цену полученного груза
        //После экспорта каталога изменяем вес
        fruitBase.getCatalogue().findFruit("Banana").setPrice(BigDecimal.valueOf(123.2));
        //и цену на фрукты в каталоге
        fruitBase.getCatalogue().findFruit("Banana").setPrice(BigDecimal.valueOf(123.2));
        System.out.println("зафиксируем стоимость и вес полученного груза после внесения изменений в каталог:");
        fruitBase.takeOrder(args);
        fruitBase.importCatalogue(); //импортируем обратно ранее экспортированный каталог
        System.out.println("зафиксируем стоимость и вес полученного груза после импорта каталога:");
        fruitBase.takeOrder(args);
    }
}
