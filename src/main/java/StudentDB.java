import lombok.Data;

@Data
public class StudentDB {
    Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }
    public Student[] getAllStudents(){
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
        int randomIndex = (int)(Math.random() * students.length);
        System.out.println(randomIndex);
        return students[randomIndex];
    }

    public Student findById (int id) throws RuntimeException{

        for (Student singleStudent : students) {
            if (singleStudent.id == id) {
                return singleStudent;
            }

        }
        throw new RuntimeException("Kein Student mit der gesuchten ID vorhanden.");
        }
    }

