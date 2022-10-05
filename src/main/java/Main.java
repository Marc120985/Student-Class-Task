import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student("Asem", 1);
//        //System.out.println(student.name);
//        Student student2 = new Student("Christian", 2);
//        Student student3 = new Student("Marc", 3);
//
//        Student[] students = {student, student2, student3};
//        //System.out.println(students[1])
//        StudentDB studentData = new StudentDB(students);
//        //System.out.println(studentData);
//        //System.out.println(studentData.getAllStudents());
//        System.out.println(studentData.randomStudent());

        ComputerScienceStudent hansMueller = new ComputerScienceStudent("Hans Müller",34264,
                new ArrayList<>(List.of("Computer Science I", "Algebra I")), "Philosophy");
        System.out.println(hansMueller);
        hansMueller.chooseCourse("Computer Networks II");
        System.out.println(hansMueller);
        hansMueller.sayHello("Hi, ich bin Hans");

    }
}
