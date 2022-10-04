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
        }return result;
    }
}
