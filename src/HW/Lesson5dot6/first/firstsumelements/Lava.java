package HW.Lesson5dot6.first.firstsumelements;

import HW.Lesson5dot6.first.NatureElement;

public class Lava extends NatureElement {
    public Lava(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}