package HW.Lesson39.fourth;

/*Создать в классе Животное статическое поле планета = Земля;
Вывести на экран данное поле.
Заменить это поле на Луна
У созданной кошки вывести данное поле.*/
public class Main {
    public static void main(String[] args) {
        System.out.println(Animal.planet);
        Animal cat = new Animal();
        Animal.planet = "Луна" ;
        System.out.println(cat.planet);
    }
}