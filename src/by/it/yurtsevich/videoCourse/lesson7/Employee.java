package by.it.yurtsevich.videoCourse.lesson7;

public class Employee {
    public double salary;

    public void dvounayaZP() {
        System.out.println("New z/p: " + salary * 2);
    }

    public Employee(double salary2) {
        salary = salary2;
    }

    public static class EmployeeTest {
        public static void main(String[] args) {
            Employee emp = new Employee(500);
            System.out.println(emp.salary);
            emp.dvounayaZP();
        }
    }
}
