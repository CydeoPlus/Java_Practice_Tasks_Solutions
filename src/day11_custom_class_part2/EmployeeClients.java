package day11_custom_class_part2;

public class EmployeeClients {

    public static void main(String[] args) {
        Employee emp1 = new Employee("James", 30, 'M', "Software Engineer", 70000.0);
        Employee emp2 = new Employee("Yulia", 25, 'F', "Data Analyst", 60000.0);

        emp1.work();
        emp2.work();

        System.out.println(emp1);
        System.out.println(emp2);
    }

}