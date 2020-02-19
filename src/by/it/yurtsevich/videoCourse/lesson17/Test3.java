package by.it.yurtsevich.videoCourse.lesson17;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        sb2 = sb2.append("6").append("7");
        System.out.println("sb1= " + sb1);
        System.out.println("sb2= " + sb2);
        boolean b = sb1==sb2;
        System.out.println(b);
        // true так как ссылаются на один и тот же обьект
    }
}
