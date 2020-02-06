package by.it.yurtsevich.videoCourse.lesson14;

public class Test3 {
    // Вывожу все числа до 55, благодаря брейку прерываю цикл фо
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 100; i++) {
            if (i == 55) {
                break;
            }
            System.out.println(i);
        }
    }
}


