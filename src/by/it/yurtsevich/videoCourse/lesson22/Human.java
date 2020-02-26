package by.it.yurtsevich.videoCourse.lesson22;

public class Human {
    // public Human(String n) {
    //   name = n;
    //}

    public String name;
    public static int salary;

    public void work() {
        System.out.println("Rabotat");
    }

    public static void rest() {
        System.out.println("Otdixat");
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name = "Misha");
        System.out.println(s.salary = 50);
        s.work();
        s.rest();
    }
}