package by.it.yurtsevich.videoCourse.lesson16;

public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String s = "ok";
        // идет сложение 5+6 потом + стринг
        System.out.println(a + b + s);
        // компилятор видит в начале стринг прибавляет к нему инт и поэтому пропускает значение 56ок
        System.out.println("" + a + b + s);
        // Из-за  скобок идет сложение и выводится на консоль 11ок
        System.out.println("" + (a + b) + s);
        String s1 = "hello";

    }
}
