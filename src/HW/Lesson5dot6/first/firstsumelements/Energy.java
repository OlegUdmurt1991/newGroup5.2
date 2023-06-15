package HW.Lesson5dot6.first.firstsumelements;

import HW.Lesson5dot6.first.NatureElement;
import HW.Lesson5dot6.first.elements.Water;

public class Energy extends NatureElement {
    public Energy(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        NatureElement result = null;
        if (element instanceof Water) {
            result = new Energy("Steam");
        }
        if (result == null)
            throw new UnsupportedOperationException();
        return result;

    }
}