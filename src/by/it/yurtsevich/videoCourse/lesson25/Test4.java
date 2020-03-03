package by.it.yurtsevich.videoCourse.lesson25;

public class Test4 {
}

class Test10 {
    int a = 5;

    void abc() {
        System.out.println("its ok1");
    }
}

class Test20 extends Test10 {
    int a = 10;

    void abc() {
        System.out.println("its ok2");
    }
}

class Test30 extends Test20 {
    int a = 15;

    void abc() {
        System.out.println("its ok3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
        System.out.println(((Test10) t).a);
        // методы ссылаются только на указанный обьект, то есть ТЕСТ30
        ((Test10) t).abc();
        // Как видим все равно выводится its ok3
    }
}