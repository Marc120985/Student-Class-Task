import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Asem", 1);
        //System.out.println(student.name);
        Student student2 = new Student("Christian", 2);
        Student student3 = new Student("Marc", 3);


        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
//        System.out.println(students);
//        System.out.println(students.get(1));


        HashMap<String, Student> hashStudents = new HashMap<>();
        hashStudents.put("001",student);
        hashStudents.put("002",student2);
        hashStudents.put("003", student3);

        System.out.println(hashStudents.get("001"));
        System.out.println(hashStudents.get("002"));
        System.out.println(hashStudents);


        //StudentDB studentDB = new StudentDB(students);
        StudentDB studentDBHash = new StudentDB(hashStudents);

        System.out.println();
        //Student[] students = {student, student2, student3};
        //System.out.println(students[1])
        //StudentDB studentData = new StudentDB(students);
        //System.out.println(studentData);
        //System.out.println(studentData.getAllStudents());
        //System.out.println(studentData.randomStudent());

        //studentData.findById(876543321);
//        try{
//        System.out.println(studentData.findById(6477435));}
//        catch (NoSuchElementException e){
//            System.out.println("Es wurde keine ID gefunden");
//        }

    }
}
