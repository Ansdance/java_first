package by.it.yurtsevich.videoCourse.lesson5;

public class Car3 {
    //Создал конструктор с двумя параметрами(цвет и мотор)
    Car3(String cvet, String motor) {
        color = cvet;// - значение
        engine = motor; // - значение
    }

    //Создал переменные
    String color;
    String engine;
}

// Создал новый класс в котором создал метод мейн, создал новый обьект класса CAR, всунул аргументы и вывел на экран
class Car3Test {
    public static void main(String[] args) {
        Car3 c3 = new Car3("black", "V12"); // создаю новый обьект и даю аргументы(цвет, мотор)
        System.out.println(c3.color);
        System.out.println(c3.engine);
    }
}