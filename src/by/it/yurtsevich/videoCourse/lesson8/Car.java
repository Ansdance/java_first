package by.it.yurtsevich.videoCourse.lesson8;

public class Car {
    String color = "blue";
    String engine = "V6";

}

class Human {
    String name = "Ivan";
    final Car c = new Car();

    public static void main(String[] args) {
        Human h = new Human();
        h.c.engine = "v12";
        h.c.color = "red";
        System.out.println(h.c.engine);
    }
}