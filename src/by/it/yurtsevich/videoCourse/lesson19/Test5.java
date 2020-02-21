package by.it.yurtsevich.videoCourse.lesson19;

public class Test5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("bye");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder[] array = {sb1, sb2, sb3};
        for (StringBuilder sb : array) {
            sb.append("kokoko");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


