package by.it.yurtsevich.videoCourse.homework.homework7;

public class Employee {
    private double salary;
    public String surname;
    private int id;

    public double showSalary(double salary2) {
        salary = salary2;
        System.out.println("Zarplata: " + salary);
        return salary;
    }

    public String showSurname(String surname2) {
        surname = surname2;
        System.out.println("Familiya: " + surname2);
        return surname;
    }

    public double showId(int id2) {
        id = id2;
        System.out.println("Nomer: " + id);
        return id;
    }

    public Employee(String surname1, double salary1, int id1) {
        id = id1;
        salary = salary1;
        surname = surname1;
    }

    Employee(String surname1, double salary1) {
        salary = salary1;
        surname = surname1;
    }

    private Employee(int id1) {
        id = id1;
    }

    static class NewClass {
        public static void main(String[] args) {
            Employee emp1 = new Employee("Petrov", 100);
            Employee emp2 = new Employee(5);
            Employee emp3 = new Employee("Zybrov", 500, 1);
            System.out.println(emp1.salary);
            System.out.println(emp2.id);
            System.out.println(emp3.surname);
        }
    }
}
