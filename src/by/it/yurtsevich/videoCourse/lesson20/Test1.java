package by.it.yurtsevich.videoCourse.lesson20;

public class Test1 {
    // Этот метод позволяет вызвать любое количество параметров любого типа данных !!!!инт(стринг  и тд.) ... а
    static void summa(String s, int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa + " " + s);
    }

    public static void main(String[] args) {
        summa("OKEY", 4, 4, 4);
    }
}

