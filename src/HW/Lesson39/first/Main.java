package HW.Lesson39.first;
/*Создать класс Cat, с свойствами количество лет, цвет глаз, вес и цвет шерсти.
Создать максимально возможное количество конструкторов, создать котиков в методе Main и вывести на их экран.
Не забываем про метод toString() для котов.*/
public class Main {
    public static void main(String[] args) {
        //Создаем три объекта класса Cat, и присваиваем им значения из разных конструкторов
        Cat cat1 = new Cat(5, " Зеленые ", 4.5, " Черно белый ");
        System.out.println(cat1);
        Cat cat2 = new Cat("Зеленые");
        System.out.println(cat2);
        Cat cat3 = new Cat(3.8);
        System.out.println(cat3);
        Cat cat4 = new Cat(3);
        System.out.println(cat4);
        Cat cat5 = new Cat("Синие" , "Белый");
        System.out.println(cat5);
        Cat cat6 = new Cat(2.9, "Голубые");
        System.out.println(cat6);
    }
}