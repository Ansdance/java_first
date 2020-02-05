package by.it.yurtsevich.videoCourse.homework.homework13;

public class Month {
    public static void kolvoDney(int n) {
        switch (n) {
            case 2:
                System.out.println("Количество дней 29");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Количество дней 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println("Количетсво дней 31");
                break;
            default:
                System.out.println("Месяца с таким порядковым номером не существует");
        }
    }

    public static void main(String[] args) {
        Month.kolvoDney(1);
        Month.kolvoDney(4);
        Month.kolvoDney(2);
        kolvoDney(5);
    }
}


