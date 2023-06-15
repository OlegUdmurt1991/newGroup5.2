package HW.Lesson5dot6.first.elements;

import HW.Lesson5dot6.first.*;
import HW.Lesson5dot6.first.firstsumelements.Dust;
import HW.Lesson5dot6.first.firstsumelements.Energy;
import HW.Lesson5dot6.first.firstsumelements.Pressure;
import HW.Lesson5dot6.first.firstsumelements.Rain;

public class Air extends NatureElement {
    public Air(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        //Переменная которой будем присваивать элементы
        NatureElement result = null;
        switch (element.getClass().getSimpleName()) {
            case "Fire":
                result = new Energy("Energy");
                break;
            case "Earth":
                result = new Dust("Dust");
                break;
            case "Water":
                result = new Rain("Rain");
                break;
            case "Air":
                result = new Pressure("Pressure");
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return result;
    }
}