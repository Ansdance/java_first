package by.it.yurtsevich.videoCourse.lesson16;

public class Test4 {
    public static void main(String[] args) {

    }
}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.isManager = isManager;
        this.salary = salary;

    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(1110.50, true);
        System.out.println("ON manager? " + emp.isManager + " Ego zarplata: " + emp.salary);

    }
}
