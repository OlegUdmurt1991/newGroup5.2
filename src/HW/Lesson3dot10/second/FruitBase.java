package HW.Lesson3dot10.second;

import HW.Lesson3dot10.second.fruits.Fruit;

import java.io.*;

public class FruitBase implements Serializable {
    private static final long serialVersionUID = 1L;

    private FruitCatalogue fruitCatalogue;

    public FruitBase() {  // конструктор без параметров
        this.fruitCatalogue = new FruitCatalogue();
    }

    public Cargo takeOrder(String... orderFruits) {
        Cargo cargo = new Cargo(); // создаем новый груз
        for (String orderFruit : orderFruits) {
            Fruit fruit = fruitCatalogue.findFruit(orderFruit); // ищем фрукт по его названию
            if (fruit != null) { // если фрукт найден
                cargo.addFruit(fruit); // добавляем его в груз
            }
        }
        return cargo; // возвращаем груз со всеми найденными фруктами
    }

    /**
     * Метод сериализует и экспортирует (сохраняет файл в ресурсы) каталог фруктов из конкретного объекта фруктовой базы
     */
    public void exportCatalogue() {
        try (FileOutputStream fileOut = new FileOutputStream("FruitCatalogue.ser")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.fruitCatalogue);
            out.close();
            fileOut.close();
            System.out.println("Каталог экспортирован\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод десериализует и импортирует (достаёт файл из рерурсов) значение для переменной catalogue конкретного объекта фруктовой базы
     */
    public void importCatalogue() {
        try (FileInputStream fileIn = new FileInputStream("FruitCatalogue.ser")) {
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.fruitCatalogue = (FruitCatalogue) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Каталог импортирован\n");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public FruitCatalogue getCatalogue() {
        return fruitCatalogue;
    }


}