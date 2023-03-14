package HW.Lesson66.Task2.com.fruitbase;

import HW.Lesson66.Task2.com.fruitbase.fruits.Fruit;

public class FruitBase {
    /**
     * Объявляем переменную типа FruitCatalogue
     */
    private final FruitCatalogue fruitCatalogue;

    /**
     * конструктор без параметров в нем инициализируется поле FruitCatalogue
     */
    public FruitBase() {
        fruitCatalogue = new FruitCatalogue();
    }

    /**
     * общедоступный метод для обработки заказа takeOrder
     */
    public Cargo takeOrder(String order) {
        /**split разбивает строку order на подстроки, затем подстроки сохраняются в массив строк orderList*/
        String[] orderList = order.split(" ");
        /**Создает экземпляр класса Cargo*/
        Cargo cargo = new Cargo();
        /**Пока i меньше длины массива orderList*/
        for (int i = 0; i < orderList.length; i++) {
            /**Переменной orderItem присваиваются значения массива*/
            String orderItem = orderList[i];
            /**метод findFruit ищет фрукт в каталоге фруктов и возвращает объект Fruit, представляющий найденный фрукт
             Если фрукт не найден, метод возвращает null*/
            Fruit fruit = this.fruitCatalogue.findFruit(orderItem);
            if (fruit != null) {
                /**Используя метод addFruit добавляем экземпляр класса Fruit в список фруктов, находящихся в грузе*/
                cargo.addFruit(fruit);
            }
        }
        return cargo;
    }

    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase();
        if (args.length > 0) {
            /**объединение аргументов командной строки в одну строку с разделителем "пробел".*/
            String order = String.join(" ", args);
            /**Вызывается метод takeOrder и cargo присваивается значения которые совпали с FruitCatalogue */
            Cargo cargo = fruitBase.takeOrder(order);
            System.out.println(cargo);
        }

    }
}


//    private String[] fruitCatalogue;
//
//    public FruitBase() {
//        fruitCatalogue = new String[]{"apple", "banana", "cherry", "orange", "pear"};
//    }
//
//    public void takeOrder(String[] fruits) {
////        String[] words = order.split(" "); // Разбить заказ на отдельные слова
//        List<String> fruitsToOrder = new ArrayList<String>();
//        for (String fruit : fruits) {
//            // boolean found = false;
//            for (int i = 0; i < fruitCatalogue.length; i++) {
//                if (fruitCatalogue[i].equals(fruit)) {
////                    found = true;
//                    fruitsToOrder.add(fruit);
////                    System.out.println(fruit + "если хотя бы одно название найдено, то формируется груз Cargo с информацией о найденных фруктах");
//
////                } else {
////                    System.out.println("Если среди запроса не встретились известные названия, то возвращается груз Cargo с нулевым количеством фруктов ");
////                }
//            }
////     if (found) {
////         System.out.println("Order accepted for " + word);
//            //    }
////            else {
////                System.out.println("Sorry, " + word + " is not available");
////            }
//
//        }
//
//        }
//        if (fruitsToOrder.isEmpty()) {
//            //создается нулевой карго
//            System.out.println("null cargo");
//        }
//        System.out.println("Order accepted fruits " + fruitsToOrder);
//    }
//
//    @Override
//    public String toString() {
//        return Arrays.toString(fruitCatalogue);
//    }
//
//    public static void main(String[] args) {
////        FruitCatalogue = args;
////        takeOrder(FruitCatalogue);
//        FruitBase fruitBase = new FruitBase();
////        fruitBase.fruitCatalogue = args;
//        fruitBase.takeOrder(args);
//
//        if (args.length > 0) {
//
////            Cargo cargo = fruitBase.takeOrder(args);
//
//            System.out.println(fruitBase + "жжж");
//
//        } else {
//            System.out.println("нет данных");
//        }
//    }
//}


//    private final FruitCatalogue fruitCatalogue;
//
//    public FruitBase() {
//        fruitCatalogue = new FruitCatalogue();
//    }
//
//    public Cargo takeOrder(String[] order) {
//        FruitBase fruitBase = new FruitBase();
//        Cargo cargo = new Cargo();
//        for (String fruitName : order) {
//            Fruit fruit = fruitCatalogue.findFruit(fruitName);
//            if (fruit != null) {
//                cargo.addFruit(fruit);
//            }
//        }
//        return cargo;
//    }
//
//    public static void main(String[] args) {
//        FruitBase fruitBase = new FruitBase();
//
//        if (args.length > 0) {
//
//            Cargo cargo = fruitBase.takeOrder(args);
//
//            System.out.println("Вес: " + cargo.getWeight() + "кг");
//            System.out.println("Цена: " + cargo.getPrice() + "у.е.");
//        } else {
//            System.out.println("нет данных");
//        }
//    }
//}


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

