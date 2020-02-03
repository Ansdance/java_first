package by.it.yurtsevich.videoCourse.homework.homework11;

public class Car {
    String color;
    String engine;
    int kolvoDverey;

    public Car(String color, String engine, int kolvoDverey) {
        this.color = color;
        this.engine = engine;
        this.kolvoDverey = kolvoDverey;
    }
}

class CarTest {
    void menyaemKolvoDverey(Car c1, int kolvoDverey) {
        c1.kolvoDverey = kolvoDverey;
    }

    public void menyaemCveta(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car c1 = new Car("white", "V10", 5);
        Car c2 = new Car("black", "V12", 3);
        ct.menyaemCveta(c1, c2);
        ct.menyaemKolvoDverey(c1,12);
        
    }
}
