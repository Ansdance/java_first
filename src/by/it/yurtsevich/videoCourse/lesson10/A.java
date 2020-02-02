package by.it.yurtsevich.videoCourse.lesson10;

import by.it.yurtsevich.videoCourse.lesson8.*;

/*Сделал импорт всего класса лессон8,
могу импортировать статичные переменные и классы по отдельности*/
public class A {
    public static void main(String[] args) {
        Car c1 = new Car();
        Student st1 = new Student("Kostya", 3);
        System.out.println(st1.course);
    }
}

class B {
    Student st2 = new Student("Lesha", 1);

}
