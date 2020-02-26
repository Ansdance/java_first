package by.it.yurtsevich.videoCourse.lesson22;

public class Test4 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.specializaciya = "Xiryrg";
        doc.eat();
        doc.sleep();
        doc.lechit();
    }
}

class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}
// класс доктор наследовал атрибуты класса работник
class Doctor extends Employee {
    String specializaciya;

    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {
    int kolvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {
    String nazvanieMashini;

    void eat() {
        System.out.println("Kushat");
    }
}