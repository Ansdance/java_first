package by.it.yurtsevich.videoCourse.lesson18;

public class Test3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 7, 5, -8, 9};
        int[] array2 = {1, 2, 3, 4, 7, 5, -8, 9};
        int[] array3 = array2;

        // false ссылаются на разные адреса
        System.out.println(array1 == array2);
        System.out.println(array1.equals(array2));
        // true ссылаются на один и тот же адрес
        System.out.println(array3 == array2);
    }
}
