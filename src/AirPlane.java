public class AirPlane {
    private String name;
    private String classes;
    private int age;

    public AirPlane(String name, String classes, int age) {
        this.name = name;
        this.classes = classes;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", age=" + age +
                '}';
    }
    public static void Fly(){
        System.out.println("Летать жана летать");
    }
}
