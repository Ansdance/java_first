package by.it.yurtsevich.videoCourse.lesson16;

public class Test6 {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Uraaaaaaaa!";
        String s3 = s1.concat(s2).trim().replace("Uraaaaaaaa!", "Pobedaaaaaa").substring(6, 10);
        System.out.println(s1.substring(s1.indexOf("w")));
        System.out.println(s3);
    }
}
