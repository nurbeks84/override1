public class Kosmicheskiykarabl {
    private String name;
    private String where;
    private int whatYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public int getWhatYear() {
        return whatYear;
    }

    public void setWhatYear(int whatYear) {
        this.whatYear = whatYear;
    }

    public Kosmicheskiykarabl(String name, String where, int whatYear) {
        this.name = name;
        this.where = where;
        this.whatYear = whatYear;
    }


    @Override
    public String toString() {
        return "Kosmicheskiykarabl{" +
                "name='" + name + '\'' +
                ", where='" + where + '\'' +
                ", whatYear=" + whatYear +
                '}';
    }
}
