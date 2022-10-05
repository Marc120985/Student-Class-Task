import java.util.ArrayList;

public class BiologyStudent extends Student implements Citizen {


    String mainSubject = "Biology";
    String secondSubject;

    public BiologyStudent(String name,
                          int id,
                          ArrayList<String> courses,
                          String secondSubject) {
        super(name, id, courses);
        this.secondSubject = secondSubject;
    }
    public void chooseCourse(String newCourse) {
        super.courses.add(newCourse);
    }
    public void sayHello(String message) {
        System.out.println(message);
    }
    public String getAdress() {
        return "Adresse: zzz";
    }

    public int getIdentityCardNumber() {
        return 456;
    }
    public String toString() {
        return "Name :"+name+ "\nID: "+id+"\nCourses: "+courses+"\nSecondSubject: "+secondSubject;
    }

}
