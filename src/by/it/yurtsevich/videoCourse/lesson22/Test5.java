package by.it.yurtsevich.videoCourse.lesson22;

public class Test5 {

}

class Human2 {
    Human2(String n) {
        this(n, null);
    }

    Human2(String n, String s) {
        name = n;
        surname = s;
    }

    public String name;
    public String surname;
}

class Student2 extends Human2 {
    // с помощью SUPER вызывается конструктор перент класса(предка)
    Student2() {
        super("Petya", "Ivanov");
    }

    public static void main(String[] args) {
        Student2 s2 = new Student2();

    }
}