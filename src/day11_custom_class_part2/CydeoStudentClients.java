package day11_custom_class_part2;

public class CydeoStudentClients {

    public static void main(String[] args) {
        CydeoStudent.schoolName = "Cydeo School";
        CydeoStudent.programmingLanguage = "Java";

        CydeoStudent student1 = new CydeoStudent("John", 25, 101, 'A', 33, 1);
        CydeoStudent student2 = new CydeoStudent("Jane", 22, 102, 'B', 28, 2);

        student1.study();
        student2.attendClass();
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();
        System.out.println(student1);
        System.out.println(student2);
    }

}
