package by.it.yurtsevich.videoCourse.lesson3;

public class Test4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        int c = a + b;
        System.out.println(a - b);
        System.out.println(a + b);
        System.out.println(a * b);

        int a1 = 10, b2 = 4;
        int c1 = a1 / b2;
        System.out.println(c1); // ответ при делении в данном слулаче 2

        double d = 11, d2 = 4;
        double d3 = d / d2;
        System.out.println(d3); // ответ при делении С ДРОБНОЙ ЧАСТЬЮ в данном слулаче 2.75

        int celayaChast = b / a;
        int ostatok = b % a; // % показывает остаток при делении целого числа типа int
        System.out.println(celayaChast);
        System.out.println(ostatok);

        double celayaChast1 = d / d2;
        double ostatok1 = d % d2; // % показывает остаток при делении с дробной частью числа типа double
        System.out.println(celayaChast1);
        System.out.println(ostatok1);


    }
}
