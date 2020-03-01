package by.it.yurtsevich.videoCourse.homework.homework24;

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    String name;

    Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("Vsegda interesno nabludat kak ribi spyat");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements SpeakAble {
    String name;

    Bird(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + "sings");
    }

    abstract void fly();
}

abstract class Mammal extends Animal implements SpeakAble {
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    String name;

    abstract void run();
}

interface SpeakAble {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("mechenosec ne xishnaya riba");
    }

    @Override
    void swim() {
        System.out.println("Mechnosec bistro plavaet");
    }

}

class Pingvin extends Bird {
    public Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Pingvin lyubit est riby!");
    }

    @Override
    public void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu");
    }

    @Override
    public void fly() {
        System.out.println("Pingivini ne ymeut letat'");
    }

    public void speak(String name) {
        System.out.println("Pingvin ne ymeet pet kak solovey");
    }
}

class Lev extends Mammal {
    public Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lev, kak lyubou xishnik lyubit myaso");
    }

    @Override
    public void sleep() {
        System.out.println("bolshyu chast dnya lev spit");
    }

    @Override
    public void run() {
        System.out.println("Lev ne samaya bistraya koshka");
    }
}

class Lesson24 {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Nemo");
        System.out.println(m.name);
        m.swim();
        m.eat();
        m.sleep();
        Pingvin p = new Pingvin("Kesha");
        System.out.println(p.name);
        p.speak("Kesha");
        p.sleep();
        p.eat();
        Lev l = new Lev("Leva");
        System.out.println(l.name);
        l.eat();
        l.sleep();
        l.run();
        l.speak();
    }
}