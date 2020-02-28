package by.it.yurtsevich.videoCourse.lesson23;

public class Test1 {
    public static void main(String[] args) {
        Employee e = new Teacher();
        e.eat();
    }
}
// Ковыярнтные ретерн тайпы
class Eda {
}

class Frukti extends Eda {

}

class Employee {
    String name;
    int age;
    int experience;

    Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher extends Employee {
    int kolvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    Frukti eat() {
        System.out.println("Kushat uchitel");
        Frukti f = new Frukti();
        return f;
    }
}