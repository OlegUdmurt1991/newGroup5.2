package HW.Lesson75.Task2;
/* - класс FruitCatalogue
    находится в пакете com.fruitbase
    содержит поле массив Fruit - список записей известных фруктов
    содержит конструктор без параметров
        при создании во внутренний массив добавляются записи-экзмепляры известных фруктов
    содержит метод findFruit, доступный только в пакете
        по переданному слову проверяет есть ли информация о таком фрукте
        если есть, то возвращает Fruit. Если нет, то возвращает null.*/
import HW.Lesson75.Task2.fruits.*;


public class FruitCatalogue {

    Fruit[] fruit = {new Apple(), new Orange(), new Banana(), new Pineapple()};

    FruitCatalogue() {
    }

    public Fruit findFruit(String fruitName) {
        for (Fruit f : fruit) {
            if (f.getName().equals(fruitName)) {
                return f;
            }
        }
        return null;
    }
}