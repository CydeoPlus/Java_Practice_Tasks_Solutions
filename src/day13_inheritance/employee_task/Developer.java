package day13_inheritance.employee_task;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, String gender, String employeeId, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, employeeId, "Developer", salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.trim().isEmpty()) {
            throw new IllegalArgumentException("Programming language cannot be null, empty, or blank.");
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println("Developer " + getName() + " is coding in " + programmingLanguage + ".");
    }
}
