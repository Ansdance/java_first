package by.it.yurtsevich.videoCourse.lesson26;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "v4");
        Car c2 = new Car("red", "v4");
        Car c3 = new Car("black", "v8");
        System.out.println(c1.equals(c2));
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    // Если перезаписываю метод иквелс всегда использовать в его параметре метод обжект
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        } else {
            return false;
        }
    }
}
