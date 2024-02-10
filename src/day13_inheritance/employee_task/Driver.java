package day13_inheritance.employee_task;

class Driver extends Employee {

    public Driver(String name, int age, String gender, String employeeId, double salary, String companyName) {
        super(name, age, gender, employeeId, "Driver", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving.");
    }

}