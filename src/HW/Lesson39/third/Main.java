package HW.Lesson39.third;
/*Создать класс животное, сделать его родителем класса Cat.
Создать статический метод “testStaticMethod”
 который выводит в консоль «Это статическое животное».
Вывести в методе main этот метод тремя способами:

-через имя класса родителя
-через имя класса наследника
-через статический импорт*/

import static HW.Lesson39.third.Animal.*;

public class Main {
    public static void main(String[] args) {
        testStaticMethod();
        Animal.testStaticMethod();
        Cat.testStaticMethod();
    }
}