package by.it.yurtsevich.videoCourse.lesson12;

public class Car {
    int doorCount;
    int engine;

    Car(int doorCount, int engine) {
        this.doorCount = doorCount;
        this.engine = engine;
    }
}

class carTest {
    public static void main(String[] args) {
        Car c1 = new Car(3, 8);
        Car c2 = new Car(5, 6);

        if (c1.engine > c2.engine) {
            if (c1.doorCount > c2.doorCount) {
                System.out.println("Mochnost motoroa i kolvo Dverey y pervou mashini bolshe");
            } else {
                System.out.println("Mochnost motora bolshe, a kolvo Dverey y pervou mashini menshe");
            }
        } else {
            System.out.println("Mochnost motora menshe i kolvo Dverey y pervou mashini menshe");
        }
    }
}