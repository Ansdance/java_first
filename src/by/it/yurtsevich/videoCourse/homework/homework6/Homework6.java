package by.it.yurtsevich.videoCourse.homework.homework6;

public class Homework6 {
    int show() {
        int sum = 0;
        System.out.println("Сумма 0 чисел:"+sum);
        return sum;

    }

    int show1(int a) {
        int sum1 = (a);
        System.out.println("Сумма 1 числа:"+sum1);
        return sum1;
    }

    int show2(int a, int b) {
        int sum2 = (a + b);
        System.out.println("Сумма 2 чисел:"+sum2);
        return sum2;
    }

    int show3(int a, int b, int c) {
        int sum3 = (a + b + c);
        System.out.println("Сумма 3 чисел:"+sum3);
        return sum3;
    }

    int show4(int a, int b, int c, int d) {
        int sum4 = (a + b + c + d);
        System.out.println("Сумма 4 чисел:"+sum4);
        return sum4;
    }

    int show5(int a, int b, int c, int d, int e) {
        int sum5 = (a + b + c + d + e);
        System.out.println("Сумма 5 чисел:" + sum5);
        return sum5;
    }
}

class Homework6Test {
    public static void main(String[] args) {
        Homework6 h6 = new Homework6();
        int a = 5;
        int b = 15;
        h6.show();
        h6.show1(a);
        h6.show2(a, b);
        h6.show3(1,1,1);
        h6.show4(2,4,4,234);
        h6.show5(4,5,56,56,543);
    }
}