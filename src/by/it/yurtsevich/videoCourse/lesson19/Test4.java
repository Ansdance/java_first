package by.it.yurtsevich.videoCourse.lesson19;

public class Test4 {
    public static void main(String[] args) {
        int[][] array = {{6, 7, 7}, {4, 4}, {6, 7, 8, 86, 4}};
        for (int[] array2 : array) {
            for (int a : array2) {
                System.out.print(a + " ");
            }
        }
    }
}
