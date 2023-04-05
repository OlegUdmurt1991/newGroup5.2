package HW.Lesson66.Task2.com.fruitbase;

import HW.Lesson66.Task2.com.fruitbase.fruits.Fruit;

public class FruitBase {
    /**
     * Объявляем переменную типа FruitCatalogue
     */
    private final FruitCatalogue fruitCatalogue;

    /**
     * конструктор без параметров в нем инициализируется поле FruitCatalogue
     */
    public FruitBase() {
        fruitCatalogue = new FruitCatalogue();
    }

    /**
     * общедоступный метод для обработки заказа takeOrder
     */
    public Cargo takeOrder(String order) {
        /**split разбивает строку order на подстроки, затем подстроки сохраняются в массив строк orderList*/
        String[] orderList = order.split(" ");
        /**Создает экземпляр класса Cargo*/
        Cargo cargo = new Cargo();
        /**Пока i меньше длины массива orderList*/
        for (int i = 0; i < orderList.length; i++) {
            /**Переменной orderItem присваиваются значения массива*/
            String orderItem = orderList[i];
            /**метод findFruit ищет фрукт в каталоге фруктов и возвращает объект Fruit, представляющий найденный фрукт
             Если фрукт не найден, метод возвращает null*/
            Fruit fruit = this.fruitCatalogue.findFruit(orderItem);
            if (fruit != null) {
                /**Используя метод addFruit добавляем экземпляр класса Fruit в список фруктов, находящихся в грузе*/
                cargo.addFruit(fruit);
            }
        }
        return cargo;
    }

    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase();
        if (args.length > 0) {
            /**объединение аргументов командной строки в одну строку с разделителем "пробел".*/
            String order = String.join(" ", args);
            /**Вызывается метод takeOrder и cargo присваивается значения которые совпали с FruitCatalogue */
            Cargo cargo = fruitBase.takeOrder(order);
            System.out.println(cargo);
        }
    }
}

