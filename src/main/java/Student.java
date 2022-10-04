import lombok.Data;

@Data
public class Student {
    String name;
      int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "" +
                "Name: '" + name + '\'' +
                "Studentennummer: " + id + "\n"
                ;
    }
}
