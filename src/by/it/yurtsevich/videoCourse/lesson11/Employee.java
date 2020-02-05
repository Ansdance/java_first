package by.it.yurtsevich.videoCourse.lesson11;

public class Employee {
    public static String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel(double a) {
        a = a * 2;
        return a;
    }
    public double zp2(){
        salary=salary*2;
        return salary;

    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 45435.33);
        double d = emp1.uvelichitel(emp1.salary);
        System.out.println(emp1.salary);
        System.out.println(d);
        emp1.zp2();
        System.out.println(emp1.salary);
    }
}
