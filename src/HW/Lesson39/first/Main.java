package HW.Lesson39.first;
/*Создать класс Cat, с свойствами количество лет, цвет глаз, вес и цвет шерсти.
Создать максимально возможное количество конструкторов, создать котиков в методе Main и вывести на их экран.
Не забываем про метод toString() для котов.*/
public class Main {
    public static void main(String[] args) {
        //Создаем три объекта класса Cat, и присваиваем им значения из разных конструкторов
        Cat Cat1 = new Cat(5, " Зеленые ", 4.5, " Черно белый ");
        System.out.println(Cat1);
        Cat Cat2 = new Cat("Зеленые");
        System.out.println(Cat2);
        Cat Cat3 = new Cat(3.8);
        System.out.println(Cat3);
    }
}