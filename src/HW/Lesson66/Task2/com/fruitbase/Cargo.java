package HW.Lesson66.Task2.com.fruitbase;

import HW.Lesson66.Task2.com.fruitbase.fruits.Fruit;


import java.math.BigDecimal;
import java.util.Arrays;

public class Cargo {
    /**
     * создаем массив типа Fruit доступный только внутри класса Cargo
     */
    private Fruit[] fruits;
    /**
     * массив используется для хранения количества каждого типа фруктов в грузе
     */
    private int[] counts;

    /**
     * Конструктор без параметров
     */
    public Cargo() {
        /**пустой массив типа Fruit[], который будет использоваться для хранения фруктов в грузе*/
        fruits = new Fruit[0];
        /**массив типа int[], который будет использоваться для хранения количества каждого типа фруктов в грузе*/
        counts = new int[0];
    }

    /**
     * метод получения общего веса по одной позиции
     */
    public double getWeight() {
        double weight = 0; //создаем переменную weight
        for (int i = 0; i < fruits.length; i++) {
            /**умножает вес конкретного фрукта fruits[i] на количество его экземпляров в грузе counts[i]*/
            weight += fruits[i].getWeight() * counts[i];
        }
        return weight;
    }

    /**
     * метод стоимости груза
     */
    public BigDecimal getPrice() {
        //Создаем объект типа BigDecimal
        BigDecimal price = BigDecimal.valueOf(0);
        for (int i = 0; i < fruits.length; i++) {
            /**произведение цены одного фрукта (getPrice) на количество этого типа фруктов в грузе (из массива counts)*/
            price = price.add(fruits[i].getPrice().multiply(BigDecimal.valueOf(counts[i])));
        }
        return price;
    }

    /**
     * метод для добавления фрукта в груз
     */
    void addFruit(Fruit fruit) {
        for (int i = 0; i < fruits.length; i++) {
            /**проверяет, есть ли уже в массиве fruits фрукт с таким же названием*/
            if (fruits[i].getName().equals(fruit.getName())) {
                counts[i]++;
                return;
            }
        }
        /**Новый массив fruits = который как первоначальный массив но в длину больше на 1,
         * чтобы в него можно было добавить новый фрукт*/
        fruits = Arrays.copyOf(fruits, fruits.length + 1);
        /**добавляем новый фрукт в конец массива fruits*/
        fruits[fruits.length - 1] = fruit;
        /**Новый массив counts = который как первоначальный массив но в длину больше на 1,
         * чтобы в него можно было добавить новый фрукт*/
        counts = Arrays.copyOf(counts, counts.length + 1);
        /**Количество повторяющихся фруктов*/
        counts[counts.length - 1] = 1;
    }

    public String toString() {
        /**Создали объект StringBuilder*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fruits.length; i++) {
            /**В sb добавляется количество фруктов и их тип*/
            sb.append(counts[i]).append("шт ").append(fruits[i].getName()).append("\n");
        }
        /**В sb добавляется вес фруктов*/
        sb.append("Вес: ").append(getWeight()).append(" кг").append("\n");
        /**В sb добавляется цена фруктов*/
        sb.append("Цена: ").append(getPrice()).append(" y.e.");
        return sb.toString();
    }
}