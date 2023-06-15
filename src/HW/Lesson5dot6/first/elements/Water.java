package HW.Lesson5dot6.first.elements;

import HW.Lesson5dot6.first.*;
import HW.Lesson5dot6.first.firstsumelements.*;

public class Water extends NatureElement {
    public Water(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        //Переменная которой будем присваивать элементы
        NatureElement result = null;
        if (element instanceof Fire) {
            result = new Steam("Steam");
        } else if (element instanceof Earth) {
            result = new Mud("Mud");
        } else if (element instanceof Water) {
            result = new Sea("Sea");
        } else if (element instanceof Air) {
            result = new Rain("Rain");
            //Добавил
        } else if (element instanceof Energy) {
            result = new Steam("Steam");
        }
        if (result == null)
            throw new UnsupportedOperationException();
        return result;
    }
}