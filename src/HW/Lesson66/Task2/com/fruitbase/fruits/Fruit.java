package HW.Lesson66.Task2.com.fruitbase.fruits;

import java.math.BigDecimal;

public abstract class Fruit {
    /**
     * private - может быть использовано только внутри класса Fruit и не может быть напрямую доступно извне
     */
    private double weight;
    private BigDecimal price;
    private String name;

    /**
     * Конструктор через который мы получаем параметры которые инециализируют private переменные
     */

    public Fruit(double weight, BigDecimal price, String name) {
        this.weight = weight;
        this.price = price;
        this.name = name;
    }

    /**
     * Ниже геттер для приватного поля weight класса Fruit
     * Геттеры - это методы, которые обычно используются для получения значения приватных полей класса
     */
    public double getWeight() {
        return this.weight;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}