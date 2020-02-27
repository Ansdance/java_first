package by.it.yurtsevich.videoCourse.homework.homework22;

public class Animal {
    Animal() {
        System.out.println("I'am animal");
    }

    public static int eyes;

    public void eat() {
        System.out.println("Animal eat");
    }

    public void drinks() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    Pet() {
        System.out.println("I'am pet");
        this.eyes = eyes = 2;
    }

    public static String name;
    public static int tail = 1;
    public static int paw = 4;

    public static void run() {
        System.out.println("Pet run");
    }

    public static void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("My name is Bonya");
    }

    public static void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    Cat(String name) {
        this.name = name;
        System.out.println("My name is Bonya");
    }
    public static void sleeps(){
        System.out.println("Cat sleeps");
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(Dog.paw);
        Cat.sleeps();
    }
}