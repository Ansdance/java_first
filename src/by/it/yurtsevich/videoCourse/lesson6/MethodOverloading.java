package by.it.yurtsevich.videoCourse.lesson6;

public class MethodOverloading {
    void show(int i1) {
        System.out.println(i1);
        System.out.println("Data type is int");
    }

    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }

    void show(String s1) {
        System.out.println(s1);
        System.out.println("Data type is string");

    }
// Создаем два метода с одинаковыми названиями, с двумя параметрами, но компилятор дает возможность их создать
// так как параметры имеют разные места 1ый стринг инт, 2 инт стринг
    void show (String s, int i){
        System.out.println("String: " + s + "Int: "+ i);
    }
    void show (int i, String s){
        System.out.println("This a nice day!!!");
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b= true;
        mO.show(b);
        String s = "Hello";
        mO.show(s);
        mO.show("Yra, ", 1);
        mO.show(10,"good");
    }
}