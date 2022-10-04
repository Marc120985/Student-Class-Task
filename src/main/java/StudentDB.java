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
}
