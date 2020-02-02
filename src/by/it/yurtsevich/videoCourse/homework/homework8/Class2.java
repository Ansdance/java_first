package by.it.yurtsevich.videoCourse.homework.homework8;

public class Class2 {
    public final static double p = 3.14;

    public double ploshad(double radius) {
        double ploshad1 = p * radius * radius;
        return ploshad1;
    }

    public static double dlinaOkr(double radius2) {
        double ploshad2 = 2 * p * radius2;
        return ploshad2;
    }
    public void info(double radius3){
        System.out.println("Radius = " + radius3);
        System.out.println("Ploshad = " + ploshad(radius3));
        System.out.println("Dlina okr = " + dlinaOkr(radius3));
    }

}
class Class2Test{
    public static void main(String[] args) {
        Class2 c2 = new Class2();
        c2.ploshad(44);
        c2.info(22);
        Class2.dlinaOkr(22);
    }

}


