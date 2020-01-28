package by.it.yurtsevich.videoCourse.homework;

public class Student {
    int number;
    String name;
    String lastname;
    double year;
    double math;
    double economic;
    double language;
    }

    class StudentTest{
        public static void main(String[] args) {

           Student s1 = new Student();
           s1.number=1;
           s1.name="Pasha";
           s1.lastname="Dzyba";
           s1.year=2003;
           s1.math=5.5;
           s1.economic=6.7;
           s1.language=8.8;

           Student s2 = new Student();
            s2.number=2;
            s2.name="Lesha";
            s2.lastname="Petrov";
            s2.year=2003;
            s2.math=7.5;
            s2.economic=7.4;
            s2.language=5.8;

            Student s3 = new Student();
            s3.number=1;
            s3.name="Misha";
            s3.lastname="Ivanov";
            s3.year=2003;
            s3.math=9.5;
            s3.economic=6.3;
            s3.language=8.1;

            System.out.println("Средняя оценка Паши: "+(s1.math+s1.economic+s1.language)/3);
            System.out.println("Средняя оценка Леши: "+(s2.math+s2.economic+s2.language)/3);
            System.out.println("Средняя оценка Миши: "+(s3.math+s3.economic+s3.language)/3);
    }
}