package HW.Lesson5dot6.first.elements;

import HW.Lesson5dot6.first.*;
import HW.Lesson5dot6.first.firstsumelements.Dust;
import HW.Lesson5dot6.first.firstsumelements.Lava;
import HW.Lesson5dot6.first.firstsumelements.Mud;
import HW.Lesson5dot6.first.firstsumelements.Pressure;

public class Earth extends NatureElement {
    public Earth(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        //Переменная которой будем присваивать элементы
        NatureElement result = null;
        if (element instanceof Fire) {
            result = new Lava("Lava");
        } else if (element instanceof Earth) {
            result = new Dust("Dust");
        } else if (element instanceof Water) {
            result = new Mud("Mud");
        } else if (element instanceof Air) {
            result = new Pressure("Pressure");
        }
        if (result == null)
            throw new UnsupportedOperationException();
        return result;
    }
}