package by.it.yurtsevich.videoCourse.homework.homework5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;

    double salaryX2 (double salary1){
        double result1 = (salary1) *2;
        return result1;
    }

}
class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.id=1;
        e1.surname="Kolobkov";
        e1.age=23;
        double salaryx2 = e2.salaryX2(1300);
        System.out.println("Id: "+ e1.id + " Name: "+ e1.surname + " Age: " + e1.age + " SalaryX2: " + salaryx2 );
        e2.id=2;
        e2.surname="Petrov";
        e2.age=23;
        double salaryx3 = e2.salaryX2(1500);
        System.out.println("Id: "+ e2.id + " Name: "+ e2.surname + " Age: " + e2.age + " SalaryX2: " + salaryx3 );
    }
}