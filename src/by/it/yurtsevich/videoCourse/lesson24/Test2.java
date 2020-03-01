package by.it.yurtsevich.videoCourse.lesson24;

public class Test2 {
    public static void main(String[] args) {
        HelpAble h = new Driver();
        SwiwAble s = new Driver();
        Employee e = new Driver();
        h.pomosh();
        h.tushitPojar();
        System.out.println(e.salary);
        s.swim();
    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

// Имплементирую(ВОПЛАЩАЮ) интерфейс хелпэйбл
class Teacher extends Employee implements HelpAble {
    int kolvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    @Override
    public void pomosh() {
        System.out.println("Ychitel okazivaet pomosh");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
    }
}

// Класс может имплементировать любое количетсво интерфейсов
class Driver extends Employee implements HelpAble, SwiwAble {
    String nazvanieMashini;

    void eat() {
        System.out.println("Kushat");
    }

    @Override
    public void pomosh() {
        System.out.println("Driver okazivaet pomosh");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Driver tushit pojar");
    }

    @Override
    public void swim() {
        System.out.println("Driver plivet");
    }
}

// Создаю интерфейс !!!Интерфейс может содержать только абстрактные методы, слово ABSTRACT перед методом можно не писать
interface HelpAble {
    void pomosh();

    void tushitPojar();

}

interface SwiwAble {
    void swim();
}