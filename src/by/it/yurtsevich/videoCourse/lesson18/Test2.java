package by.it.yurtsevich.videoCourse.lesson18;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 7, 5, -8, 9};
        // Вывел значения массива
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        // Отсортировал массив при помощи эрэйс.сорт
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        // Ищу индекс 9 в массиве эррэй1 !!!Используй данный метод только в отсортировоном массиве!!!
        int index1 = Arrays.binarySearch(array1, 9);
        System.out.println(index1);
    }
}