import lombok.Data;


import java.util.HashMap;
import java.util.NoSuchElementException;

@Data
public class StudentDB {
    HashMap<String, Student> students;

    public StudentDB(HashMap<String,Student> students) {
        this.students = students;
    }
    public HashMap<String, Student> getAllStudents(){
        return students;
    }
//    public String toString(){
//        String result = "";
//        for(Student singleStundent : students.values()){
//            result += "Name: " + singleStundent.name + "\nID: " + singleStundent.id + "\n";
//        }
//        return result;
//    }


//    @Override
//    public String toString() {
//        return "" + "Name " + students + '}';
//    }

    public Student randomStudent(){
        int randomIndex = (int)(Math.random() * students.size());
        System.out.println(randomIndex);
        return students.get(randomIndex);
    }

    public Student findById(int id){
            if(students.containsKey(id)){
               return students.get(id);
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

