package HW.Lesson5dot6.first.firstsumelements;

import HW.Lesson5dot6.first.NatureElement;

public class Rain extends NatureElement {
    public Rain(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}