import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void getAllStudentsTest () {
        //GIVEN
        Student student1 = new Student("Test", 123);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        StudentDB studentData = new StudentDB(students);

        //WHEN
        ArrayList<Student> actual = studentData.getAllStudents();

        //THEN
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        assertEquals(actual, expected);
    }
    @Test
    public void excistingID() throws Exception {
        //given
        Student student1 = new Student("Zeshan", 0);
        Student student2 = new Student("Ana",1);
        Student [] array1 = new Student[2];
        array1[0] = student1;
        array1[1] = student2;
        StudentDB db = new StudentDB(array1);

        //when
        Student actual = db.findById(1);
        Student expected = (array1[1]);

        //then
        assertEquals(expected, actual);
    }
    @Test
    public void notExcistingID() throws NoSuchElementException {
        //given
        Student student1 = new Student("Zeshan", 0);
        Student student2 = new Student("Ana", 1);
        Student[] array1 = new Student[2];
        array1[0] = student1;
        array1[1] = student2;
        StudentDB db = new StudentDB(array1);

        //when
        try {
            db.findById(2);
            fail("Exception ist nicht aufgetreten");
        } catch (NoSuchElementException e) {
            System.out.println("Exception ist aufgetreten.");
        }
    }


   /* @Test
    public void getAllStudentsTestEmptyArray () {
        //GIVEN
        Student student1 = new Student("Test", 123);
        Student[] students = {};
        StudentDB studentData = new StudentDB(students);

        //WHEN
        Student[] actual = studentData.getAllStudents();

        //THEN
        Student[] expected = {student1};
        assertArrayEquals(actual, expected);
    } */
}
