package HW.Lesson3dot10;

/**
 * Напишем программу, которая реализует смешивание элементов для зелья. Для этого реализуйте:
 * - родительский класс всех элементов NatureElement
 * содержит метод connect, который в качестве параметра получает другой NatureElement
 * содержит пустое тело
 * содержит статический метод create
 * в качестве параметра принимает строку - название базового элемента
 * по названию создает базовый элемент
 * если название неизвестно, то печатается сообщение "Неизвестный элемент" и возвращается null.
 * <p>
 * - классы базовых элементов:
 * Fire
 * Air
 * Earth
 * Water
 * <p>
 * эти классы содержат метод connect,
 * который на вход получает другой NatureElement
 * В теле метода происходит проверка какого типа передан элемент и в соответствие со схемой
 * печатается формула:
 * <текущий элемент> + <переданный элемент> = <результирующий элемент>
 * И также создается объект результирующего элемента и возвращается.
 * Если по схеме нет нового элемента, то выводится сообщение "Нет нового элемента"
 * и возвращается null.
 * <p>
 * Обработка входного параметра у этих классов делается согласно схеме:
 * Air + Air = Pressure
 * Air + Earth = Dust
 * Air + Fire = Energy
 * Air + Water = Rain
 * <p>
 * Earth + Earth = Pressure
 * Earth + Air = Dust
 * Earth + Fire = Lava
 * Earth + Water = Mud
 * <p>
 * Fire + Fire не производит новый элемент
 * Fire + Air = Energy
 * Fire + Earth = Lava
 * Fire + Water = Steam
 * <p>
 * Water + Water = Sea
 * Water + Fire = Steam
 * Water + Earth = Mud
 * Water + Air = Rain
 * <p>
 * - Производные элементы
 * Pressure
 * Dust
 * Energy
 * Rain
 * Lava
 * Mud
 * Steam
 * Sea
 * <p>
 * - класс Alchemy
 * метод main
 * через аргументы командной строки передаются названия элементов
 * для переданных аргументов создаются объекты соответствующих классов.
 * Если хотя бы для одного из аргументов нельзя создать объект, то программа завершается.
 * Далее попарно объединяются объекты и выводятся соответствующие сообщения.
 * Т.е. для объектов Air Air Fire Earth в результате объединения получатся два объекта: Pressure и Lava
 */

public abstract class NatureElement {
    private String nameElement;

    public String getName() {
        return nameElement;
    }

    public NatureElement(String nameElement) {
        this.nameElement = nameElement;
    }

    public abstract NatureElement connect(NatureElement element);

    public static NatureElement create(String nameElement) {
        if (nameElement.equals("Fire")) {
            return new Fire(nameElement);
        } else if (nameElement.equals("Air")) {
            return new Air(nameElement);
        } else if (nameElement.equals("Earth")) {
            return new Earth(nameElement);
        } else if (nameElement.equals("Water")) {
            return new Water(nameElement);
        } else {
            System.out.println("Нет нового элемента");
        }
        return null;
    }
}

class Fire extends NatureElement {
    public Fire(String name) {
        super(name);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        NatureElement result = null;
        if (element instanceof Air) {
            result = new Energy("Energy");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Earth) {
            result = new Lava("Lava");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Water) {
            result = new Steam("Steam");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Fire) {
            System.out.println("Fire + Fire не производит новый элемент");
        }
        return result;
    }
}

class Air extends NatureElement {
    public Air(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        NatureElement result = null;
        if (element instanceof Fire) {
            result = new Energy("Energy");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Earth) {
            result = new Dust("Dust");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Water) {
            result = new Rain("Rain");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Air) {
            result = new Pressure("Pressure");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        }
        return result;
    }
}

class Earth extends NatureElement {
    public Earth(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        NatureElement result = null;
        if (element instanceof Fire) {
            result = new Lava("Lava");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Earth) {
            result = new Dust("Dust");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Water) {
            result = new Mud("Mud");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Air) {
            result = new Pressure("Pressure");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        }
        return result;
    }
}

class Water extends NatureElement {
    public Water(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        //Переменная которой будем присваивать элементы
        NatureElement result = null;
        if (element instanceof Fire) {
            result = new Steam("Steam");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Earth) {
            result = new Mud("Mud");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Water) {
            result = new Sea("Sea");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        } else if (element instanceof Air) {
            result = new Rain("Rain");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());
        }
        return result;
    }
}

class Pressure extends NatureElement {
    public Pressure(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        return null;
    }
}

class Dust extends NatureElement {
    public Dust(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        return null;
    }
}

class Energy extends NatureElement {
    public Energy(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        return null;
    }
}

class Rain extends NatureElement {
    public Rain(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        return null;
    }
}

class Lava extends NatureElement {
    public Lava(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        return null;
    }
}

class Mud extends NatureElement {
    public Mud(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        return null;
    }
}

class Steam extends NatureElement {
    public Steam(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        return null;
    }
}

class Sea extends NatureElement {
    public Sea(String nameElement) {
        super(nameElement);
    }

    @Override
    public NatureElement connect(NatureElement element) {
        return null;
    }
}

/**
 * класс Alchemy
 * метод main
 * через аргументы командной строки передаются названия элементов
 * для переданных аргументов создаются объекты соответствующих классов.
 * Если хотя бы для одного из аргументов нельзя создать объект, то программа завершается.
 * Далее попарно объединяются объекты и выводятся соответствующие сообщения.
 * Т.е. для объектов Air Air Fire Earth в результате объединения получатся два объекта: Pressure и Lava
 */
class Alchemy {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Введите другие элементы");
        }
        //проверяем что для всех переданных аргументов возможно создать элемент
        NatureElement[] elements = new NatureElement[args.length];
        for (int i = 0; i < args.length; i++) {
            if (NatureElement.create(args[i]) == null) {
            }
            elements[i] = NatureElement.create(args[i]);
        }

        //Разбиваем массив на пары
        if (elements.length % 2 == 0) {
            for (int i = 0; i < elements.length; i += 2) {
                elements[i].connect(elements[i + 1]);
            }
        } else {
            //Если нечёт. количество элементов последний не учитываем
            for (int i = 0; i < elements.length - 1; i += 2) {
                elements[i].connect(elements[i + 1]);
            }
        }
    }
}