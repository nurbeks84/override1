public class Main {
    public static void main(String[] args) {

    AirPlane airPlane = new AirPlane("Boing","Cargo",1998);
        System.out.println(airPlane);
        AirPlane.Fly();
        Car car = new Car("BMW",2,"bexa");
        System.out.println(car);
        Kosmicheskiykarabl kosmicheskiykarabl = new Kosmicheskiykarabl("Appolon","Space",1995);
        System.out.println(kosmicheskiykarabl);
        Tefal tefal = new Tefal("Chainik",2022);
        System.out.println(tefal);
        Technique technique = new Technique("ORG texnika","professional");
        System.out.println(technique);

    }
}