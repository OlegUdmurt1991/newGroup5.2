package HW.Lesson3dot10;


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
        if (element instanceof Air){
            result = new Energy("Energy");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        } else if (element instanceof Earth) {
            result = new Lava("Lava");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        } else if (element instanceof Water) {
            result = new Steam("Steam");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        }else if (element instanceof Fire) {
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
        if (element instanceof Fire){
            result =new Energy("Energy");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        } else if (element instanceof Earth) {
            result =new Dust("Dust");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        } else if (element instanceof Water) {
            result =new Rain("Rain");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        }else if (element instanceof Air) {
            result =new Pressure("Pressure");
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
        if (element instanceof Fire){
            result =new Lava("Lava");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        } else if (element instanceof Earth) {
            result =new Dust("Dust");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        } else if (element instanceof Water) {
            result = new Mud("Mud");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        }else if (element instanceof Air) {
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
        NatureElement result = null;
        if (element instanceof Fire){
            result =new Steam("Steam");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        } else if (element instanceof Earth) {
            result =new Mud("Mud");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        } else if (element instanceof Water) {
            result =new Sea("Sea");
            System.out.println(this.getName() + " + " + element.getName() + " = " + result.getName());

        }else if (element instanceof Air) {
            result =new Rain("Rain");
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

class Alchemy {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Смешивать нечего, даже не поколдуешь :(");
            System.exit(1);
        }
        //Создаём массив с элементами, проверяем что для всех переданных аргументов возможно создать элемент
        NatureElement[] elements = new NatureElement[args.length];
        for (int i = 0; i < args.length; i++) {
            if (NatureElement.create(args[i]) == null) {
                System.exit(1);
            }
            elements[i] = NatureElement.create(args[i]);
        }

        //делим массив на пары по 2 элемента для сложения/объединения в новые элементы
        if (elements.length % 2 == 0) { //для чётного кол-ва элементов
            for (int i = 0; i < elements.length; i += 2) {
                elements[i].connect(elements[i + 1]);
            }
        } else {
            for (int i = 0; i < elements.length - 1; i += 2) { //для нечётного кол-ва элементов последний не трогаем
                elements[i].connect(elements[i + 1]);
            }
        }
    }
}