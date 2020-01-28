package by.it.yurtsevich.videoCourse.lesson5;

public class Human {
    String name;
    Car4 car;
    BankAccount bA;

    void info() {
        System.out.println("Imya: " + name + " Cvet mashini: " + car.color + " Dvigatel: " + car.engine +
                " Nomer bA: " + bA.id + " Balans: " + bA.balance);
    }
}
class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name="Petya";
        h.car= new Car4 ("white", "v10");
        h.bA = new BankAccount(234, 5444);
        h.info();
    }
}

class Car4 {
    Car4(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BankAccount {
    BankAccount(int id2, int balance2) {
        id = id2;
        balance = balance2;
    }

    int id;
    int balance;
}
