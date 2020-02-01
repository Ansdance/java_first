package by.it.yurtsevich.videoCourse.lesson8;


public class Student {
    // Создал переменную статик инт каунт - она принадлежит всему классу и является общей для всех созданных обьектов
    String name;
    int course;
    static int count;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student nomer: " + count + " sozdan");
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("kostya", 4);
        Student s2 = new Student("Misha", 3);
        Student s3 = new Student("grisha", 2);
        System.out.println(s3.name);
        System.out.println(Student.count);


    }
}
