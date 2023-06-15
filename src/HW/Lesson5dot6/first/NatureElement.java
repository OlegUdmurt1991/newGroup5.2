package HW.Lesson5dot6.first;

import HW.Lesson5dot6.first.elements.Air;
import HW.Lesson5dot6.first.elements.Earth;
import HW.Lesson5dot6.first.elements.Fire;
import HW.Lesson5dot6.first.elements.Water;
import HW.Lesson5dot6.first.firstsumelements.Energy;

import java.util.NoSuchElementException;

/**
 * В программу с алхимией из прошлой домашней работы добавьте:
 * 1) обработку следующих формул:
 * Energy + Water = Steam
 * Water + Energy = Steam
 * 2) обработка исключений
 * - в методе create класса NatureElement, если встретился неизвестный элемент,
 * то бросается java.util.NoSuchElementException, которое обрабатывается в основном классе Alchemy.
 * При обработке программа завершается.
 * - в методе connect класса NatureElement бросается UnsupportedOperationException вместо возвращения null
 * - в методе connect дочерних классов NatureElement бросается UnsupportedOperationException вместо возвращения null,
 * если объект не подошел под все условия.
 * Исключение обрабатывается в классе Alchemy, программа не завершается.
 */

public abstract class NatureElement {
    private String nameElement;

    public String getName() {
        return nameElement;
    }

    public NatureElement(String nameElement) {
        this.nameElement = nameElement;
    }

    /**
     * @param element название элемента
     *                Для неизвестных пар выкидывает исключение UnsupportedOperationException
     */
    public abstract NatureElement connect(NatureElement element) throws UnsupportedOperationException;

    /**
     * @param nameElement название элемента
     * @return создаёт новый базовый элемент по названию и возвращает его, если название известно.
     * Для неизвестных названий выкидывает исключение NoSuchElementException
     */
    public static NatureElement create(String nameElement) throws NoSuchElementException {
        switch (nameElement) {
            case "Fire":
                return new Fire(nameElement);
            case "Air":
                return new Air(nameElement);
            case "Earth":
                return new Earth(nameElement);
            case "Water":
                return new Water(nameElement);
            case "Energy":
                return new Energy(nameElement);
            default:
                throw new NoSuchElementException();
        }
    }
}