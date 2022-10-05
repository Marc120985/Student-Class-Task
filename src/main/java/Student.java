import java.util.ArrayList;


public abstract class Student extends Person {

    int id;
    ArrayList<String> courses = new ArrayList<>();

    public Student(String name, int id, ArrayList<String> courses) {
        super(name);
        this.id = id;
        this.courses = courses;
    }
    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    public abstract void chooseCourse(String newCourse);
}
