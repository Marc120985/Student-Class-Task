import lombok.Data;

@Data
public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void sayHello(String message);
}
