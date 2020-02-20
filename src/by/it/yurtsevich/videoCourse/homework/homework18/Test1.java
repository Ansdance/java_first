package by.it.yurtsevich.videoCourse.homework.homework18;

import java.util.Arrays;

public class Test1 {
    public static int sortirovka(int[] array) {
        int a1 =array[0];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        return a1;
    }

    public static void main(String[] args) {
        int [] array1 = {1, 44, 344, 243};
        int [] array2 = {5, 4, 34, 24};
        sortirovka(array1);
        sortirovka(array2);
    }
}