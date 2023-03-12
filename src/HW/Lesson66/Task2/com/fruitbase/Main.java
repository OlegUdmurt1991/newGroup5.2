package HW.Lesson66.Task2.com.fruitbase;

import HW.Lesson66.Task2.com.fruitbase.fruits.Apple;
import HW.Lesson66.Task2.com.fruitbase.fruits.Orange;
import HW.Lesson66.Task2.com.fruitbase.fruits.Pineapple;



import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cargo cargo = new Cargo();

        Apple apple1 = new Apple(0.5, new BigDecimal("2.99"), "Apple 1");
        Apple apple2 = new Apple(0.4, new BigDecimal("3.99"), "Apple 2");
        Orange orange1 = new Orange(0.3, new BigDecimal("1.99"), "Orange 1");
        Pineapple pineapple1 = new Pineapple(1.5, new BigDecimal("1.99"), "Orange 1");
        System.out.println(apple1.toString());
    }}
