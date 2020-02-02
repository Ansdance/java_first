package by.it.yurtsevich.videoCourse.homework.homework8;

public class Class1 {
    public static double triChisla(double a, double b, double c) {
        return a * b * c;
    }

    public static void dvaChisla(int a, int b) {
        System.out.println("Целое частное = " + a / b + " Остаток от деления = " + a % b);
    }

    public static class Class1Test {
        public static void main(String[] args) {
            System.out.println(triChisla(12, 45, 34));
            System.out.println(triChisla(23, 34, 55));
            dvaChisla(3, 3);
            dvaChisla(45, 343);
        }
    }
}

