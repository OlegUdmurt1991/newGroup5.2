package HW.Lesson7dot6.First;
public class Basket<T> {
    private T[] globalVariable;
    private int i;

    public Basket() {
        globalVariable = (T[]) new Object[5];
        i = 0;
    }

    void addItem(T item) {
        if (i < globalVariable.length) {
            globalVariable[i] = item;
            i++;
            System.out.println(item + " добавлен в корзину ");
        } else
            System.out.println("Корзина полная. нельзя больше добавить");
    }
}