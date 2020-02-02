package by.it.yurtsevich.videoCourse.lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    public Car(String color, String engine) {
        count++;
        // Имеем ввиду цвет и двигатель,которые принадлежат обьекту, чтобы не утруждать себя и менять названия перед
        // color i engine pishem THIS
        this.color = color;
        this.engine = engine;
    }

    public void showColor() {
        System.out.println("Cvet mashini: " + color);
    }

    public void changeColor(String color3) {
        System.out.println("Noviu cvet mashini: ");
        int cena = 5000;
        color = color3;
        cena += 1000;
    }

}