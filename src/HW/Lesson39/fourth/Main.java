package HW.Lesson39.fourth;
/*Создать в классе Животное статическое поле планета = Земля;
Вывести на экран данное поле.
Заменить это поле на Луна
У созданной кошки вывести данное поле.*/
public class Main {
    public static void main(String[] args) {
        Animal Cat = new Animal();
        System.out.println(Cat.print());
        Animal Cat2 = new Animal("Луна");
        System.out.println(Cat2);
    }
}