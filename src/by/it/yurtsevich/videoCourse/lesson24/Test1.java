package by.it.yurtsevich.videoCourse.lesson24;

public class Test1 {
    public static void main(String[] args) {
        Figura f = new Kvadrat();
        System.out.println(f.kolvoStoron);
        f.perimetr();
        f.ploshad();
    }

}

abstract class Figura {
    abstract void perimetr();

    abstract void ploshad();

    int kolvoStoron;

    void showInfo() {
        System.out.println("Eto figura");
    }

}

// Дочерний класс абстрактного родительского класса должен также быть абстрактным или перезаписать все его методы
class Kvadrat extends Figura {
    int storona1 = 10;
    int kolvoStoron = 4;

    public void perimetr() {
        System.out.println("Perimetr kvadrata = " + storona1 * 4);
    }

    public void ploshad() {
        System.out.println("Ploshad kvadrara = " + storona1 * storona1);
    }
}

class Pyamoygolnik extends Figura {
    int storona1 = 8;
    int storona2 = 5;
    int kolvoStoron = 4;

    public void perimetr() {
        System.out.println("Perimetr pryampygolnika = " + (storona2 + storona1) * 2);
    }

    public void ploshad() {
        System.out.println("Ploshad pryamoygolnika = " + storona2 * storona1);
    }
}

class Okrujnost extends Figura {
    int storona1 = 10;
    int kolvoStoron = 0;
    int radius = 3;

    public void perimetr() {
        System.out.println("Perimetr okrujnosti = " + radius * 2 * 3.14);
    }

    public void ploshad() {
        System.out.println("Ploshad okrujnosti = " + radius * radius * 3.14);
    }
}

// Не перезаписывая абстракт методы, сделали дочерний класс абстрактным
abstract class Chetirexugolnik extends Figura {
    void def() {
        System.out.println("Eto chetirexuglnik");
    }
}