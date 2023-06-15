package HW.Lesson5dot6.first;

import java.util.NoSuchElementException;

/**
 В программу с алхимией из прошлой домашней работы добавьте:
 1) обработку следующих формул:
 Energy + Water = Steam
 Water + Energy = Steam
 2) обработка исключений
 - в методе create класса NatureElement, если встретился неизвестный элемент,
 то бросается java.util.NoSuchElementException, которое обрабатывается в основном классе Alchemy.
 При обработке программа завершается.
 - в методе connect класса NatureElement бросается UnsupportedOperationException вместо возвращения null
 - в методе connect дочерних классов NatureElement бросается UnsupportedOperationException вместо возвращения null,
 если объект не подошел под все условия.
 Исключение обрабатывается в классе Alchemy, программа не завершается.
 */
class Alchemy extends NoSuchElementException {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Введите другие элементы");
        }
        //проверяем что для всех переданных аргументов возможно создать элемент
        NatureElement[] elements = new NatureElement[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                elements[i] = NatureElement.create(args[i]);
            }
        } catch (NoSuchElementException exc) {
            System.out.println(exc);
            System.exit(1);
        }
        try {
            //Разбиваем массив на пары
            if (elements.length % 2 == 0) {
                for (int i = 0; i < elements.length; i += 2) {
                    var createdElement = elements[i].connect(elements[i + 1]);
                    System.out.println(elements[i].getName() + " + " + elements[i + 1].getName() + " = " + createdElement.getName());
                }
            } else {
                //Если нечёт. количество элементов последний не учитываем
                for (int i = 0; i < elements.length - 1; i += 2) {
                    elements[i].connect(elements[i + 1]);
                }
            }
        } catch (UnsupportedOperationException exc) {
            System.out.println(exc);
        }
    }
}