package by.it.yurtsevich.videoCourse.lesson12;

public class Test2 {
    public static void main(String[] args) {
        // Использую елсе иф, что срабатывает (подходит первым, последующее не расматривается и наоборот)
        int salary = 1500;
        if (salary < 200) {
            System.out.println("Z/p ochen nizka");
        } else if (salary < 400) {
            System.out.println("Z/p srednego razmera");
        } else if (salary < 600) {
            System.out.println("Z/p visokoya");
        } else {
            System.out.println("Z/p otlichnaya");
        }
    }
}

