package day13_inheritance.employee_task;

public class Teacher extends Employee {

    public Teacher(String name, int age, String gender, String employeeId, double salary, String companyName) {
        super(name, age, gender, employeeId, "Teacher", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching.");
    }

}
