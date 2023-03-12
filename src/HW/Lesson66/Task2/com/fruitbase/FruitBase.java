package HW.Lesson66.Task2.com.fruitbase;

import HW.Lesson66.Task2.com.fruitbase.fruits.Fruit;

public class FruitBase {
    private final FruitCatalogue fruitCatalogue;

    public FruitBase() {
        fruitCatalogue = new FruitCatalogue();
    }

    public Cargo takeOrder(String[] order) {
        FruitBase fruitBase = new FruitBase();
        Cargo cargo = new Cargo();
        for (String fruitName : order) {
            Fruit fruit = fruitCatalogue.findFruit(fruitName);
            if (fruit != null) {
                cargo.addFruit(fruit);
            }
        }
        return cargo;
    }

    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase();

        if (args.length > 0) {

            Cargo cargo = fruitBase.takeOrder(args);

            System.out.println("Вес: " + cargo.getWeight() + "кг");
            System.out.println("Цена: " + cargo.getPrice() + "у.е.");
        } else {
            System.out.println("нет данных");
        }
    }
}
















//public class FruitBase {
//    static String [] FruitCatalogue;
//    Cargo cargo = new Cargo();
//
//
//    public FruitBase() {
//        for (String strFruit : this.FruitCatalogue) {
//
//        }
//    }
//    public static void takeOrder(String[] FruitCatalogue, String targetWord){
//        /**Если длина строк = 0*/
//        if (FruitCatalogue.length == 0) {
//            System.out.println("Аргументы строки не заданы.");
//            return;
//        }
//        for (String word : FruitCatalogue) {
//            if (word.equals(targetWord)) {
//
//                System.out.println(word);
//            }
//        }
//    }
//
//    public static void printWordIfExists(String[] words, String targetWord) {
//        /**Если длина строк = 0*/
//        if (words.length == 0) {
//            System.out.println("Аргументы строки не заданы.");
//            return;
//        }
//        for (String word : words) {
//            if (word.equals(targetWord)) {
//                System.out.println(word);
//            }
//        }
//    }
//}









//    static String [] FruitCatalogue;
//    // Конструктор без параметров
//    public FruitBase() {
//        //this.FruitCatalogue = new String[0];
////        this.FruitCatalogue.add("apple");
//    }
//    public static void takeOrder(String [] FruitCatalogue, String targetWord){
///**Если длина строк = 0*/
//        if (FruitCatalogue.length == 0) {
//            System.out.println("Аргументы строки не заданы.");
//            return;
//        }
//        for (String word : FruitCatalogue) {
//            if (word.equals(targetWord)) {
//                System.out.println(word);
//                return;
//            }
//    }
//}
//
//    public static void main(String[] args) {
//        String[] words = {"яблоко", "апельсин", "банан", "сахар", "мандарин"};
//        String targetWord = "банан";
//        takeOrder(words, targetWord);
//    }
//}

