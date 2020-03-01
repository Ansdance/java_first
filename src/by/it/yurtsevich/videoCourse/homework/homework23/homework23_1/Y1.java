package by.it.yurtsevich.videoCourse.homework.homework23.homework23_1;

import by.it.yurtsevich.videoCourse.homework.homework23.X1;

public class Y1 extends X1 {
    public void abc() {
        System.out.println("Y");
    }

    public void def() {
        Y1 y1 = new Y1();
        y1.abc();
    }

    public void ghi() {
        X1 x1 = new Y1();
        x1.abc();
    }

    public static void main(String[] args) {
        Y1 a = new Y1();
        a.abc();
        a.def();
        a.ghi();
    }

}
