import java.util.StringJoiner;

public class Tefal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Tefal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Tefal.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }
}
