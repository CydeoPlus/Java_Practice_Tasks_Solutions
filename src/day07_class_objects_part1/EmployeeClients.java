package day07_class_objects_part1;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "James";
        employee1.age = 38;
        employee1.gender = 'M';
        employee1.salary = 150_000;
        employee1.jobTitle = "Software Developer";

        Employee employee2 = new Employee();
        employee2.name = "Yulia";
        employee2.age = 29;
        employee2.gender = 'F';
        employee2.salary = 110_000;
        employee2.jobTitle = "SDET";

        System.out.println(employee1);
        System.out.println(employee2);

        employee1.work();
        employee2.work();


    }
}
