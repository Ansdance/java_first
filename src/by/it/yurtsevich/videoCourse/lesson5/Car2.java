package by.it.yurtsevich.videoCourse.lesson5;

public class Car2 {
    String color;
    String engine;
    int speed;

    // создаю первый метод, который увеличивает и показывает скорость
    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("Color: " + color + " Engine: " + engine + " Speed: " + speed);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "red";
        c1.engine = "V8";
        c1.speed = 60;
        c1.showInfo();
        c1.gaz(10);
        c1.showInfo();
        c1.tormoz(30);
        c1.showInfo();


    }
}
