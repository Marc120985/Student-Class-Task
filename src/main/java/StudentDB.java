import lombok.Data;

import java.util.ArrayList;
import java.util.NoSuchElementException;

@Data
public class StudentDB {
    ArrayList<Student> students;

    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }
    public ArrayList<Student> getAllStudents(){
        return students;
    }
    public String toString(){
        String result = "";
        for(Student singleStundent : students){
            result += "Name: " + singleStundent.name + "\nID: " + singleStundent.id + "\n";
        }
        return result;
    }

    public Student randomStudent(){
        int randomIndex = (int)(Math.random() * students.size());
        System.out.println(randomIndex);
        return students.get(randomIndex);
    }

    public Student findById(int id){
        Student resultStudent = null;
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getId() == id){
               //resultStudent = students[i];
               return students.get(i);
            }
        }
        throw new NoSuchElementException("Kein Student gefunden under der ID: " + id);
    }
}

    /*public Student findById (int id) throws RuntimeException{

        for (Student singleStudent : students) {
            if (singleStudent.id == id) {
                return singleStudent;
            }

        }
        throw new RuntimeException("Kein Student mit der gesuchten ID vorhanden.");
        }

    }*/

