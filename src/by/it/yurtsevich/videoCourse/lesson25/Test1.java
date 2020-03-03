package by.it.yurtsevich.videoCourse.lesson25;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        // Делаем кастинг доктора, в круглых скобках я указал тип данных на который я хотел закастить переменную emp3
        Doctor d1 = (Doctor) emp3;
        System.out.println(d1.specializaciya);
        System.out.println(((Teacher) emp1).kolvoUchenikov);

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

class Doctor extends Employee {
    String specializaciya = "xiryrg";

    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {
    int kolvoUchenikov = 22;

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
