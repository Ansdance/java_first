package by.it.yurtsevich.videoCourse.homework.homework6;

import java.sql.SQLOutput;

public class Student {
    Student(int number1, String name1, String lastname1, double year1, double math1, double economic1, double language1) {
        number = number1;
        name = name1;
        lastname = lastname1;
        year = year1;
        math = math1;
        economic = economic1;
        language = language1;

    }

    int number;
    String name;
    String lastname;
    double year;
    double math;
    double economic;
    double language;
}

class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Pasha", "Dzyba", 2003, 5.5, 6.7, 8.8);
        System.out.println(s1.economic);



        //System.out.println("Средняя оценка Паши: " + (s1.math + s1.economic + s1.language) / 3);
        //System.out.println("Средняя оценка Леши: " + (s2.math + s2.economic + s2.language) / 3);
        //System.out.println("Средняя оценка Миши: " + (s3.math + s3.economic + s3.language) / 3);
    }
}