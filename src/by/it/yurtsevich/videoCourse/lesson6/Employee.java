package by.it.yurtsevich.videoCourse.lesson6;

public class Employee {
    //Создал три консруктора работников с разными параметрами
    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }
//При помощи this вызываем первый консруктор, место параметров,
// которые не указаны во втором консрукторе записываем деф.значения

    Employee(String surname1, int age1, double salary1) {
        this(0, surname1, age1, salary1, null);
    }
    //я могу в одном консрукторе вызывать другой и для упрощения использовать THIS(ЭТО ВЫЗОВ КОНСТРУКТОРА)
    // (ДОЛЖНО БЫТЬ ЗАПИСАНО В НАЧАЛЕ КОНСРУКТОРА в котором вызываем)

    Employee(String surname3, int age3, double salary3, String department3) {
        this(surname3, age3, salary3);
        department = department3;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Petrov", 35, 120, "OPK");
        System.out.println(emp.surname);
        Employee emp2 = new Employee("Sidorov", 33, 12222, "IT");
        System.out.println(emp2.surname);
        Employee emp1 = new Employee("Ivanov", 33, 111);
    }
}
