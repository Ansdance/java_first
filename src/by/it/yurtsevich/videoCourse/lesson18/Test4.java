package by.it.yurtsevich.videoCourse.lesson18;

public class Test4 {
    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max element =" + max);
        System.out.println("min element =" + min);
    }

    public static void main(String[] args) {
        double[] array1 = {1, 4.44, 344, 243};
        maxMin(array1);
    }
}