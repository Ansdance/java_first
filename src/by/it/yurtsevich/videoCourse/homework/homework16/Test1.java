package by.it.yurtsevich.videoCourse.homework.homework16;

public class Test1 {
    public void email(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.email("ya@yahoo.com;    ona@gmail.com;    on@mail.ru;");
    }

}
