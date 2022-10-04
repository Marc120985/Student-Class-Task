import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Asem", 1234567);
        //System.out.println(student.name);
        Student student2 = new Student("Christian", 876543321);
        Student student3 = new Student("Marc", 64727435);

        Student[] students = {student, student2, student3};
        //System.out.println(students[1])
        StudentDB studentData = new StudentDB(students);
        //System.out.println(studentData);
        //System.out.println(studentData.getAllStudents());
        //System.out.println(studentData.randomStudent());

        //studentData.findById(876543321);
        try{
        System.out.println(studentData.findById(6477435));}
        catch (NoSuchElementException e){
            System.out.println("Es wurde keine ID gefunden");
        }

    }
}
