package HW.Lesson5dot6.first.elements;


import HW.Lesson5dot6.first.NatureElement;
import HW.Lesson5dot6.first.firstsumelements.Energy;
import HW.Lesson5dot6.first.firstsumelements.Lava;
import HW.Lesson5dot6.first.firstsumelements.Steam;

public class Fire extends NatureElement {
    public Fire(String name) {
        super(name);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        //Переменная которой будем присваивать элементы
        NatureElement result = null;
        if (element instanceof Air) {
            result = new Energy("Energy");
        } else if (element instanceof Earth) {
            result = new Lava("Lava");
        } else if (element instanceof Water) {
            result = new Steam("Steam");
        } else if (element instanceof Fire) {
            System.out.println("Fire + Fire не производит новый элемент");
        }
        if (result == null)
            throw new UnsupportedOperationException();
        return result;
    }
}