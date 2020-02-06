package by.it.yurtsevich.videoCourse.lesson14;

public class Test2 {
    // Вывожу все числа кроме 87, благодаря континуе переходим к следующему повторению
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 100; i++) {
            if (i == 11) {
                continue;
            }
            if (i % 55 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
