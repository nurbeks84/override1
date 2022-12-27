public class Car {
    private String name;
    private int years;
    private String name1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", name1='" + name1 + '\'' +
                '}';
    }
}

