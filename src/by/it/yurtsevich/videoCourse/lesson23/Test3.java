package by.it.yurtsevich.videoCourse.lesson23;

public class Test3 {
    public static void main(String[] args) {
        Employee1 emp = new Teacher1();
        Teacher1 t = new Teacher1();
        emp.sleep();
        t.sleep();
    }

}

class Eda1 {
}

class Frukti1 extends Eda1 {

}

class Employee1 {
    String name;

    public Eda1 eat() {
        System.out.println("Kushaet rabotnik");
        Eda1 e = new Eda1();
        return e;
    }

    static void sleep() {
        System.out.println("Spit rabotnik");
    }
}

class Teacher1 extends Employee1 {
    int kolvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    static void sleep() {
        System.out.println("Spit uchitel");
    }
}