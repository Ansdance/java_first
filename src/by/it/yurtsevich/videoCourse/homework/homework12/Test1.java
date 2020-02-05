package by.it.yurtsevich.videoCourse.homework.homework12;

import by.it.yurtsevich.videoCourse.lesson11.*;

public class Test1 {

}

class StudentTest {
    public static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты одниковые");
        } else {
            System.out.println("Студенты не одинаковые");
        }
    }

    public static void method2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена студентов, курсы и оценки одниаковые");
                } else {
                    System.out.println("Имена студентов и курсы и одниаковые. ОЦЕНКИ РАЗНЫЕ");
                }
            } else {
                System.out.println("Имена студентов одниаковые. КУРСЫ РАЗЛИЧАЮТСЯ");
            }
        } else {
            System.out.println("Имена студентов различаются");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kostya", 5, 5);
        Student s2 = new Student("Kostya", 5, 5);
        method1(s1, s2);
        method2(s1, s2);
    }
}