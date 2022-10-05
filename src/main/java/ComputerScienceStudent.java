import java.util.ArrayList;


public class ComputerScienceStudent extends Student {
    String mainSubject = "Computer Science";
    String secondSubject;

    public ComputerScienceStudent(String name,
                                  int id,
                                  ArrayList<String> courses,
                                  String secondSubject) {
        super(name, id, courses);
        this.secondSubject = secondSubject;

    }
    @Override
    public String toString() {
        return "Name :"+name+ "\nID: "+id+"\nCourses: "+courses+"\nSecondSubject: "+secondSubject;
    }

    public void chooseCourse(String newCourse) {
        super.courses.add(newCourse);
    }

    public void sayHello(String message) {
        System.out.println(message);
    }
}
