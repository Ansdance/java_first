package by.it.yurtsevich.videoCourse.lesson24;


public class Test3 {
    JumpAble j1 = new Human();
    JumpAble j2 = new Animal();

}

interface JumpAble {
    void jump();
}

class Human implements JumpAble {
    @Override
    public void jump() {
        System.out.println("Human jumps");
    }
}

class Animal implements JumpAble {
    @Override
    public void jump() {
        System.out.println("Animal jumps");
    }
}