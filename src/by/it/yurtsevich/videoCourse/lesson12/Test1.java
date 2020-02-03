package by.it.yurtsevich.videoCourse.lesson12;

public class Test1 {
    public static void main(String[] args) {
        int a = 10;
        // Можно не использовать фигурные скобки, но тогда к иф будет относиться только первое выражение
        if (a < 20) {
            System.out.println("a menshe 20");
        }
        int b = 20;
        if (b > 10)
            System.out.println("b bolshe 10");
            // Убирай фигурные скобки когда высвечиваетсчя else without if
            //!!! else - в противном случае(если ИФ не выполняется) выполни это выражение (ЕЛСЕ)
        else {
            System.out.println("b menshe 30");
            // Можно не использовать фигурные скобки, но тогда к else будет относиться только первое выражение(first statement)
            System.out.println("hello all");
        }
    }
}